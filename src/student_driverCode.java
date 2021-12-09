
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class student_driverCode {

    int std_id;
    database db;
    Connection conn;
    ArrayList<String> profile = new ArrayList<String>();
    ArrayList<String> facilities = new ArrayList<String>();
    ArrayList<String> facility = new ArrayList<String>(5);
    String[] a = new String[5];
    String[] b = new String[5];

    public student_driverCode() {
        db = new database();
        conn = db.getConnection();
    }

    public void stdLogin(int id, String pass) throws SQLException {

        std_id = id; //updating global std_id
        int check_id; //id from query
        String Check_pass = null; // pw from query
        boolean login;

        try {

            String query = "select student_id from students where student_id = ?"; // query to check if id exists

            PreparedStatement st = conn.prepareStatement(query); //creating and preparing statements
            st.setInt(1, id); //passing id as parameter
            ResultSet rs = st.executeQuery();

            if (!rs.next()) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "ID Does not exist");
            } else {

                String query1 = "select student_id, password from students where student_id =?";

                PreparedStatement st1 = conn.prepareStatement(query1);
                st1.setInt(1, id);
                ResultSet rs1 = st1.executeQuery();

                while (rs1.next()) {

                    check_id = rs.getInt("student_id");
                    Check_pass = rs1.getString("password");
                }

                if (Check_pass.equals(pass)) {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Login Successful!");
                    StdwelcomeGUI a = new StdwelcomeGUI(std_id);
                    a.setVisible(true);
                    login = true;
                } else {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Password doesnot match!");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(student_driverCode.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getStudentID() {
        System.out.println("");
        System.out.println(std_id);
    }

    public int showProfile(int id) throws SQLException {
        int exists = 1;
        String query = "select * from students where student_id =?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);

        ResultSet rs2 = st.executeQuery();

        if (!rs2.next()) {
            exists = 0;
        } else {
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                profile.add(rs.getString("first_name"));
                profile.add(rs.getString("last_name"));
                profile.add(rs.getString("father_name"));
                profile.add(rs.getString("cnic_num"));
                profile.add(rs.getString("program"));
                profile.add(rs.getString("dob"));
                profile.add(rs.getString("home_add"));
                profile.add(rs.getString("mobile_no"));
                profile.add(rs.getString("email"));
                profile.add(rs.getString("room_id"));
                profile.add(rs.getString("student_id"));
            }

            int room_id = Integer.parseInt(profile.get(9));

            String query1 = "select * from room where room_id =?";

            PreparedStatement st1 = conn.prepareStatement(query1);

            st1.setInt(1, room_id);

            ResultSet rs1 = st1.executeQuery();
            while (rs1.next()) {
                profile.add(rs1.getString("room_id"));
            }
        }
        return exists;
    }

    public boolean checkVoucherStatus(int id) throws SQLException {
        boolean status = false;

        String query = "select voucher_status from fees where student_id =?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            if (Integer.parseInt(rs.getString("voucher_status")) == 0) {
                return status;
            } else {
                status = true;
            }
        }

        return status;
    }

    public void checkFacilities(int id) throws SQLException {

        String query = "select * from facilities_availed where student_id =?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            facilities.add(rs.getString("facility_id"));

        }

    }

    public void addFacilitytoArray() throws SQLException {

        String query = "select * from facility";
        PreparedStatement st = conn.prepareStatement(query);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            facility.add(rs.getString("facility_charges"));
        }

        arrayforTF();

    }

    public void arrayforTF() {
        Arrays.fill(a, "-");
        Arrays.fill(b, "-");

        for (int i = 0; i < facilities.size(); i++) {
            a[i] = facilities.get(i);
            System.out.println(a[i]);
        }
        for (int i = 0; i < facility.size(); i++) {
            b[i] = facility.get(i);
            System.out.println(b[i]);
        }

    }

    public int getTotalFee() throws SQLException {
        int fac_id;
        int total_fee = 0;
        for (int i = 0; i < facilities.size() - 1; i++) {

            fac_id = Integer.parseInt(facilities.get(i));

            String query = "select Facility_charges from facility where facility_id =?";

            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, fac_id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                total_fee = total_fee + Integer.parseInt(rs.getString("facility_charges"));
            }

        }
        return total_fee;

    }

    public void setUpdateTF(int id) throws SQLException {

        String query = "Select email, mobile_no, home_add from students where student_id =?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            profile.add(rs.getString("home_add"));
            profile.add(rs.getString("mobile_no"));
            profile.add(rs.getString("email"));
        }

    }

    public void updateProfile(int id, String address, String phone, String email) throws SQLException {
        String query = "update students set home_add = ?, mobile_no = ?, email = ? where student_id = ?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, address);
        st.setString(2, phone);
        st.setString(3, email);
        st.setInt(4, id);
        st.executeUpdate();

    }

    public void getFacilities(int id) throws SQLException {
        String query = "SELECT facility_desc from facility AS F NATURAL JOIN facilities_availed AS FA WHERE FA.student_id = ? ";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        String all_Facilities = "";
        while (rs.next()) {
            System.out.println(all_Facilities);

            all_Facilities += rs.getString("facility_desc");
            all_Facilities += ", ";

        }

        profile.add(all_Facilities);
    }

    public int updatePass(int id, String old_pass, String new_pass, String confirm_pass) throws SQLException {

        int success = 0;

        String query = "Select password from students where student_id =?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        String check_pass = null;
        while (rs.next()) {
            check_pass = rs.getString("password");
        }

        if (!check_pass.equals(old_pass)) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Old password doesnot match");
        } else {
            String query1 = "update students set password = ? where student_id = ?";
            PreparedStatement st1 = conn.prepareStatement(query1);
            st1.setString(1, new_pass);
            st1.setInt(2, id);
            st1.executeUpdate();
            success = 1;
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Password Updated! Your new password is: " + new_pass);

        }
        return success;
    }

    public String getAvailedFacilities(int id, String desc) throws SQLException {
        String all_Facilities = "";
        String query = "SELECT Facility_charges from facility AS F NATURAL JOIN facilities_availed AS FA WHERE FA.student_id = ? AND F.facility_desc=?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, id);
        st.setString(2, desc);
        ResultSet rs2 = st.executeQuery();
        if(!rs2.next()){
            all_Facilities ="-";
        }
        else{
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            all_Facilities += rs.getString("Facility_charges");

        }
        }
        return all_Facilities;
    }
    
        public void getVoucher() throws SQLException{
                   String[] columnNames = {"Facility", "Charges"};
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
//    public static void main(String[] args) throws SQLException {
//        student_driverCode s = new student_driverCode();
//        s.checkFacilities(1);
//        s.addFacilitytoArray();
//
//    }
}
