
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class student_driverCode {
            database db;
            Connection conn;
            ArrayList<String> profile = new ArrayList<String>();
   
  public student_driverCode(){
        db = new database();
        conn= db.getConnection();
  }

//   StudentLoginGUI stdlogin = new StudentLoginGUI();
     int std_id;
    
   
   
    public void stdLogin(int id, String pass) throws SQLException{
      

       std_id=id; //updating global std_id
       int check_id; //id from query
       String Check_pass = null; // pw from query
       boolean login;
       
       try{
 
       String query ="select student_id from students where student_id = ?";
           
       PreparedStatement st = conn.prepareStatement(query); 
       st.setInt(1, id);
//       System.out.println(st);
       ResultSet rs = st.executeQuery();  
//           System.out.println(rs);
       if(!rs.next()){
           System.out.println("Id Not Found");
       }
       
       else{
       
       String query1 ="select student_id, password from students where student_id =?";
       
       PreparedStatement st1 = conn.prepareStatement(query1); 
       st1.setInt(1, id);
       ResultSet rs1 = st1.executeQuery();  
//           System.out.println(rs1);
       while (rs1.next())
      {
          System.out.println(rs1.getInt("student_id")+"");
        check_id = rs.getInt("student_id");   
        Check_pass =rs1.getString("password");
      }
              
      if (Check_pass.equals(pass)){
        StdwelcomeGUI a = new StdwelcomeGUI();
        a.setVisible(true);
        login = true;
      }
      else
            System.out.println("Password not match"); 
       }
       }
      catch (SQLException ex) {
            Logger.getLogger(student_driverCode.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void showProfile() throws SQLException{
        
       String query ="select * from students where student_id =1";
       PreparedStatement st = conn.prepareStatement(query); 
       ResultSet rs = st.executeQuery(query);
       while (rs.next())
      {
        profile.add(rs.getString("student_id"));
      }
        
    }
    
    
    
    
}
       
        

