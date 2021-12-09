
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ebrahim Baig
 */
public class admin_driverCode {

    int std_id;
    database db;
    Connection conn;
//    student_driverCode std_dc = new student_driverCode();

    public admin_driverCode() {
        db = new database();
        conn = db.getConnection();
    }

    public void adminLogin(int id, String pass) throws SQLException {

        std_id = id; //updating global std_id
        int check_id; //id from query
        String Check_pass = null; // pw from query
        boolean login;

        try {

            String query = "select emp_id from employee where emp_id = ?"; // query to check if id exists

            PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
            st.setInt(1, id); //passing id as parameter
            ResultSet rs = st.executeQuery();

            if (!rs.next()) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "ID Does not exist");
            } else {

                String query3 = "select * from employee where emp_id = ?"; // query to check if id exists

                PreparedStatement st3 = conn.prepareStatement(query3); //creating and preparing statements
                st3.setInt(1, id); //passing id as parameter
                ResultSet rs3 = st3.executeQuery();

                int flag = 0;
                while (rs3.next()) {

                    flag = Integer.parseInt(rs3.getString("Isadmin"));

                }

                if (flag == 0) {

                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "You need to be an admin to login!");
                } else {

                    String query1 = "select emp_id, password from employee where emp_id =?";

                    PreparedStatement st1 = conn.prepareStatement(query1);
                    st1.setInt(1, id);
                    ResultSet rs1 = st1.executeQuery();

                    while (rs1.next()) {

                        check_id = rs.getInt("emp_id");
                        Check_pass = rs1.getString("password");
                    }

                    if (Check_pass.equals(pass)) {
                        JFrame f = new JFrame();
                        JOptionPane.showMessageDialog(f, "Login Successful!");
                        adminwelcomeGUI a = new adminwelcomeGUI();
                        a.setVisible(true);
                        login = true;
                    } else {
                        JFrame f = new JFrame();
                        JOptionPane.showMessageDialog(f, "Password doesnot match!");
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(student_driverCode.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int countRooms() throws SQLException {

        int count = 0;

        String query = "SELECT count(room_occupied) from room where room_occupied=0;"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            count = rs.getInt("count(room_occupied)");
        }

        return count;
    }

    public int countUnpaidChallans() throws SQLException {

        int count = 0;

        String query = "SELECT count(voucher_status) from fees where voucher_status=0;"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            count = rs.getInt("count(voucher_status)");
        }

        return count;
    }

    public int checkStudentID(int id) throws SQLException {
        int status = 0;

        String query1 = "select student_id  from students where student_id=?";
        PreparedStatement st1 = conn.prepareStatement(query1); //creating and preparing statements
        st1.setInt(1, id);
        ResultSet rs1 = st1.executeQuery();
        if (!rs1.next()) {
            status = 1;
        }

        return status;
    }

    public void insertStudent(String f_name, String l_name, String father_name, String cnic,
            String email, String phone, String program, String address, String DOB, int id) throws SQLException {

        String query = "INSERT INTO students (student_id, first_name, last_name,"
                + "father_name, cnic_num, program, home_add, mobile_no, email, password) VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        st.setInt(1, id);
        st.setString(2, f_name);
        st.setString(3, l_name);
        st.setString(4, father_name);
        st.setString(5, cnic);
        st.setString(6, program);
//            st.setDate(7, new Date(DOB);
        st.setString(7, address);
        st.setString(8, phone);
        st.setString(9, email);
        st.setString(10, "1234");
        st.executeUpdate();

    }

    public void updateSTudentRoom(int id, int room) throws SQLException {
        String query = "update students set room_id = ? where student_id = ?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, room);
        st.setInt(2, id);
        st.executeUpdate();

        // changing room status
        String query2 = "update room set room_occupied= ? where room_id = ?";
        PreparedStatement st2 = conn.prepareStatement(query2);
        st2.setBoolean(1, true);
        st2.setInt(2, room);
        st2.executeUpdate();

        int b_id = 0; //finding b_id of room
        String query3 = "select building_id from room where room_id = ?";
        PreparedStatement st3 = conn.prepareStatement(query3);
        st3.setInt(1, room);
        ResultSet rs3 = st3.executeQuery();

        rs3.next();
        b_id = rs3.getInt("building_id");

        int std_no = 0;

        // incrementing students
        String query4 = "select no_of_students from building where building_id = ?";
        PreparedStatement st4 = conn.prepareStatement(query4);
        st4.setInt(1, b_id);
        ResultSet rs4 = st4.executeQuery();
        while (rs4.next()) {
            std_no = rs4.getInt("no_of_students");
        }

        std_no++;

        // updating no_of_students in building table
        String query5 = "update building set no_of_students = ? where building_id = ?";
        PreparedStatement st5 = conn.prepareStatement(query5);
        st5.setInt(1, std_no);
        st5.setInt(2, b_id);
        st5.executeUpdate();

        int voucher_num = 0;

        //looking for last voucher number and incrememnting 1
        String query6 = "select voucher_no from fees order by voucher_no ASC";
        PreparedStatement st6 = conn.prepareStatement(query6); //creating and preparing statements
        ResultSet rs6 = st6.executeQuery();

        if (!rs6.next()) {
            voucher_num = 1;
        } else {
            ResultSet rs8 = st6.executeQuery();
            while (rs8.next()) {

                voucher_num = rs8.getInt("voucher_no");
            }
            voucher_num++;
        }

        //craeting voucher row fee=0
        String query7 = "INSERT INTO fees(voucher_no, fees, voucher_status, student_id) VALUES (?,?,?,?)";
        PreparedStatement st7 = conn.prepareStatement(query7);
        st7.setInt(1, voucher_num);
        st7.setInt(2, 0);
        st7.setBoolean(3, false);
        st7.setInt(4, id);
        st7.executeUpdate();

    }

    public int getVoucherNum(int id) throws SQLException {
        String query1 = "select voucher_no from fees where student_id=?";
        PreparedStatement st1 = conn.prepareStatement(query1); //creating and preparing statements
        st1.setInt(1, id);
        ResultSet rs1 = st1.executeQuery();
        int num = 0;
        while (rs1.next()) {

            num = rs1.getInt("voucher_no");

        }
        return num;
    }

    public void setFacility(int id, int[] a) throws SQLException {

        int voucher_num = getVoucherNum(id);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (a[i] == 0) {
                //do nothing
            } else {
                String query1 = "INSERT INTO facilities_availed (facility_id, voucher_no, student_id) VALUES (?,?,?)";

                PreparedStatement st1 = conn.prepareStatement(query1);
                st1.setInt(1, a[i]);
                st1.setInt(2, voucher_num);
                st1.setInt(3, id);
                st1.executeUpdate();

            }

        }

    }

    public int getTotalStudents() throws SQLException {
        int count = 0;
        String query = "SELECT count(student_id ) from students"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        ResultSet rs = st.executeQuery();
        while (rs.next()) {

            count = rs.getInt("count(student_id )");
        }
        return count;
    }

    public void updateStudent(String f_name, String l_name, String father_name, String cnic,
            String email, String phone, String program, String address, int id) throws SQLException {

        String query = "update students set first_name = ?, last_name = ?, father_name = ?, cnic_num = ?, program = ?"
                + ", home_add = ?, mobile_no = ?, email = ? where student_id = ?";
        PreparedStatement st = conn.prepareStatement(query);

//        st.setInt(1, new_id);
        st.setString(1, f_name);
        st.setString(2, l_name);
        st.setString(3, father_name);
        st.setString(4, cnic);
        st.setString(5, program);
        st.setString(6, address);
        st.setString(7, phone);
        st.setString(8, email);
        st.setInt(9, id);

        st.executeUpdate();

    }

    public int getOCRooms(int id) throws SQLException {
        int count = 0;

        String query = "SELECT count(room_occupied) from room where building_id=? AND room_occupied=1"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        st.setInt(1, id);

        ResultSet rs = st.executeQuery();
        while (rs.next()) {

            count = rs.getInt("count(room_occupied)");
        }
        return count;
    }

    public int getRoomCount(int id) throws SQLException {
        int count = 0;

        String query = "SELECT count(room_id) from room where building_id=?"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {

            count = rs.getInt("count(room_id)");
        }
        return count;
    }

    public void vacateRoom(int id) throws SQLException {

        String query = "Update room set room_occupied = false WHERE room_id=?"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
        st.setInt(1, id);
        st.executeUpdate();

        String query1 = "UPDATE students set room_id = null where room_id=?";
        PreparedStatement st1 = conn.prepareStatement(query1); //creating and preparing statements
        st1.setInt(1, id);
        st1.executeUpdate();

        int b_id = 0; //finding b_id of room
        String query3 = "select building_id from room where room_id = ?";
        PreparedStatement st3 = conn.prepareStatement(query3);
        st3.setInt(1, id);
        ResultSet rs3 = st3.executeQuery();
        rs3.next();

        b_id = rs3.getInt("building_id");

        int std_no = 0;

        // decrementing students
        String query4 = "select no_of_students from building where building_id = ?";
        PreparedStatement st4 = conn.prepareStatement(query4);
        st4.setInt(1, b_id);
        ResultSet rs4 = st4.executeQuery();
        while (rs4.next()) {
            std_no = rs4.getInt("no_of_students");
        }
        std_no--;

        // updating no_of_students in building table
        String query5 = "update building set no_of_students = ? where building_id = ?";
        PreparedStatement st5 = conn.prepareStatement(query5);
        st5.setInt(1, std_no);
        st5.setInt(2, b_id);
        st5.executeUpdate();

    }

    public int getEmp() throws SQLException {
        int count = 0;

        String query = "SELECT count(emp_id) from employee"; // query to check if id exists

        PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements

        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            count = rs.getInt("count(emp_id)");
        }
        return count;

    }

    public void insertEmployee(String name, String phone, String email, String cnic,
            int salary, int dep_id, int isAdmin) throws SQLException {

        boolean admin = true;
        if (isAdmin == 0) {
            admin = false;
        }

        String query1 = "Select department_id from department where department_id =?";
        PreparedStatement st1 = conn.prepareStatement(query1);
        st1.setInt(1, dep_id);
        ResultSet rs = st1.executeQuery();

        if (!rs.next()) {
            System.out.println("Dept Not Found");
        } else {

            String query = "INSERT INTO employee(emp_id, full_name, mobile_name, email, cnic_num, Salary, password,"
                    + " Isadmin, department_id, building_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(query);

            int emp_id = getEmp() + 1;

            st.setInt(1, emp_id);
            st.setString(2, name);
            st.setString(3, phone);
            st.setString(4, email);
            st.setString(5, cnic);
            st.setInt(6, salary);
            st.setString(7, "1234");
            st.setBoolean(8, admin);
            st.setInt(9, dep_id);

            Random ran = new Random();
            int x = ran.nextInt(4) + 1;

            st.setInt(10, x);
            st.execute();

        }
    }

    public int checkVoucher_Status(int id) throws SQLException {
        int status = 0;

        String query1 = "select voucher_status from fees where voucher_no=?";
        PreparedStatement st1 = conn.prepareStatement(query1); //creating and preparing statements
        st1.setInt(1, id);
        ResultSet rs1 = st1.executeQuery();
        if (!rs1.next()) {
            status = 99999;

        }
        ResultSet rs2 = st1.executeQuery();
        while (rs2.next()) {
            if (rs2.getBoolean("voucher_status")) {
                status = 1;
            }
        }

        return status;
    }

    public int payVoucher(int id) throws SQLException {

        int paid = 0;
        String query1 = "select voucher_status from fees where voucher_no=?";
        PreparedStatement st1 = conn.prepareStatement(query1); //creating and preparing statements
        st1.setInt(1, id);
        ResultSet rs1 = st1.executeQuery();
        if (!rs1.next()) {
            paid = 99999;

        } else {
            ResultSet rs2 = st1.executeQuery();
            rs2.next();
            if (rs2.getBoolean("voucher_status")) {
                paid = 0;
            } else {

                String query = "update fees set voucher_status = true where voucher_no = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setInt(1, id);
                paid = st.executeUpdate();

            }
        }
        System.out.println(paid);
        return paid;
    }

    public int getTotalFee(int id) throws SQLException {
        int Fee = 0;
        String query = "SELECT Facility_charges from facility AS F NATURAL JOIN facilities_availed AS FA WHERE FA.student_id = ? ";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Fee += rs.getInt("Facility_charges");
            System.out.println("Fee: " + Fee);
        }
        return Fee;
    }

    public void setFee(int id) throws SQLException {

        int total_fee = getTotalFee(id);
        System.out.println(total_fee);
        int voucher_num = 0;

        String query = "Select voucher_no  from fees where student_id=?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);

        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            voucher_num = rs.getInt("voucher_no");
        }

        String query9 = "update fees set fees = ? where voucher_no= ?";
        PreparedStatement st9 = conn.prepareStatement(query9);
        st9.setInt(1, total_fee);
        st9.setInt(2, voucher_num);
        st9.executeUpdate();
    }

    public void deleteStudent(int id) throws SQLException {
        String query = "delete from students where student_id=?";
        PreparedStatement st = conn.prepareStatement(query);
        ResultSet rs = st.executeQuery();
    }

    public void getstudentTable() throws SQLException {
        String[] columnNames = {"student_id", "f_name", "l_name", "father_name", "cnic", "email", "phone", "program", "address", "room_id"};
        JFrame frame1 = new JFrame("Database Search Result");

//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0);

        JTable table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String query = "select * from students";
        PreparedStatement st = conn.prepareStatement(query);

        ResultSet rs = st.executeQuery();
        ResultSetMetaData rsd = rs.getMetaData();
        int j = rsd.getColumnCount();
//        "student_id","f_name", "l_name","father_name", "cnic", "email" ,"phone","program","address"};    
//        JFrame frame1 = new JFrame("Database Search Result");

        while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 0; i <= j; i++) {
                v2.add(rs.getString("student_id"));
                v2.add(rs.getString("first_name"));
                v2.add(rs.getString("last_name"));
                v2.add(rs.getString("father_name"));
                v2.add(rs.getString("cnic_num"));
                v2.add(rs.getString("program"));
                v2.add(rs.getString("home_add"));
                v2.add(rs.getString("mobile_no"));
                v2.add(rs.getString("email"));
                v2.add(rs.getString("room_id"));

            }
            model.addRow(v2);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(800, 300);
    }

    public void getRoomTable() throws SQLException {
        String[] columnNames = {"room_id", "building_id"};
        JFrame frame1 = new JFrame("Database Search Result");

//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0);

        JTable table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String query = "select room_id, building_id from room where room_occupied=false";
        PreparedStatement st = conn.prepareStatement(query);

        ResultSet rs = st.executeQuery();
        ResultSetMetaData rsd = rs.getMetaData();
        int j = rsd.getColumnCount();
//        "student_id","f_name", "l_name","father_name", "cnic", "email" ,"phone","program","address"};    
//        JFrame frame1 = new JFrame("Database Search Result");

        while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 0; i <= j; i++) {
                v2.add(rs.getString("room_id"));
                v2.add(rs.getString("building_id"));

            }
            model.addRow(v2);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(200, 600);
    }

    public void getChallanTable() throws SQLException {
        String[] columnNames = {"voucher_no", "fees", "voucher_status", "student_id"};
        JFrame frame1 = new JFrame("Database Search Result");

//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0);

        JTable table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String query = "select * from fees";
        PreparedStatement st = conn.prepareStatement(query);

        ResultSet rs = st.executeQuery();
        ResultSetMetaData rsd = rs.getMetaData();
        int j = rsd.getColumnCount();
//        "student_id","f_name", "l_name","father_name", "cnic", "email" ,"phone","program","address"};    
//        JFrame frame1 = new JFrame("Database Search Result");

        while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 0; i <= j; i++) {
                v2.add(rs.getString("voucher_no"));
                v2.add(rs.getString("fees"));
                v2.add(rs.getString("voucher_status"));
                v2.add(rs.getString("student_id"));

            }
            model.addRow(v2);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(800, 300);
    }

    public void getEmployeeTable() throws SQLException {
        String[] columnNames = {"emp_id", "full_name", "mobile_name", "email", "cnic_num", "Salary", "Isadmin", "department_id", "building_id"};
        JFrame frame1 = new JFrame("Database Search Result");

//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0);

        JTable table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String query = "select * from employee";
        PreparedStatement st = conn.prepareStatement(query);

        ResultSet rs = st.executeQuery();
        ResultSetMetaData rsd = rs.getMetaData();
        int j = rsd.getColumnCount();
//        "emp_id", "full_name", "mobile_name", "email", "cnic_num", "Salary", "Isadmin", "department_id", "building_id"

        while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 0; i <= j; i++) {
                v2.add(rs.getString("emp_id"));
                v2.add(rs.getString("full_name"));
                v2.add(rs.getString("mobile_name"));
                v2.add(rs.getString("email"));
                v2.add(rs.getString("cnic_num"));
                v2.add(rs.getString("Salary"));
                v2.add(rs.getString("Isadmin"));
                v2.add(rs.getString("department_id"));
                v2.add(rs.getString("building_id"));

            }
            model.addRow(v2);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(800, 300);
    }

    public static void main(String[] args) throws SQLException {
        admin_driverCode s = new admin_driverCode();

//        s.countUnpaidChallans();
//s.insertStudent("bilal", "aslam", "aslam", "56426", "aslam@bilal.com", "1559988", "ACF", "Bahadrabad", "2000-02-18", 3);
//s.updateSTudentRoom(12, 2);
//        int a[] = {1, 0, 0, 1, 1};
//        s.setFacility(12, a);
//        s.setFee(12);
        s.deleteStudent(11);
    }
}
