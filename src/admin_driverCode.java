
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                System.out.println("Id Not Found");
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
                    System.out.println("Not an admin!");
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
                        adminwelcomeGUI a = new adminwelcomeGUI(std_id);
                        a.setVisible(true);
                        login = true;
                    } else {
                        System.out.println("Password not match");
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

        String query2 = "update rooms set room_occupied = ? where room_id = ?";
        PreparedStatement st2 = conn.prepareStatement(query);
        st2.setBoolean(1, true);
        st2.setInt(2, room);
        st2.executeUpdate();

        int b_id = 0; //fining b_id of room
        String query3 = "select building_id from room where room_id = ?";
        PreparedStatement st3 = conn.prepareStatement(query);
        st3.setInt(1, room);
        ResultSet rs3 = st3.executeQuery();
        if(!rs3.next())
            
        while (rs3.next()) {
            b_id = rs3.getInt("building_id");
        }

        int std_no = 0;
        
        // incrementing 
        String query4 = "select no_of_students  from building where room_id = ?";
        PreparedStatement st4 = conn.prepareStatement(query);
        ResultSet rs4 = st4.executeQuery();
        while (rs4.next()) {
            std_no = rs4.getInt("building_id");
        }

        std_no++;
        
        // changing room status
        String query5 = "update building set no_of_students = ? where building_id = ?";
        PreparedStatement st5 = conn.prepareStatement(query);
        st5.setInt(1, std_no);
        st5.setInt(1, b_id);
        st5.executeUpdate();

        int voucher_num=0; //looking for last voucher number and incrememnting 1
        String query6 = "select voucher_no from fees";
        PreparedStatement st6 = conn.prepareStatement(query); //creating and preparing statements
        ResultSet rs6 = st6.executeQuery();

        if (!rs6.next()) {
            voucher_num = 0;
        } else {
            while (rs6.next()) {
                voucher_num = rs6.getInt("voucher_no");
            }
        }

        voucher_num++;

//craeting voucher row
        String query7 = "INSERT INTO fees(voucher_no, voucher_status, student_id) VALUES (?,?,?)";
        PreparedStatement st7 = conn.prepareStatement(query);
        st7.setInt(1, voucher_num);
        st7.setBoolean(1, false);
        st7.setInt(3, id);
        

    }

//    public static void main(String[] args) throws SQLException {
//        admin_driverCode s = new admin_driverCode();
////        s.countUnpaidChallans();
//s.insertStudent("bilal", "aslam", "aslam", "56426", "aslam@bilal.com", "1559988", "ACF", "Bahadrabad", "2000-02-18", 3);
//    }
}
