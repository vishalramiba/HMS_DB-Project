
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class student_driverCode {

   database db = new database();
   Connection conn= db.getConnection();
   StudentLoginGUI stdlogin = new StudentLoginGUI();
   public int std_id;
    
   
   
    public void stdLogin(int id, String pass) throws SQLException{
        
       std_id=id; //updating global std_id
       int check_id; //id from query
       String Check_pass = null; // pw from query
       boolean login;
       
       try{
       String query ="select student_id from students where student_id =?";
       PreparedStatement st = conn.prepareStatement(query); 
       st.setInt(1, id);
       ResultSet rs = st.executeQuery(query);  
        
       if(rs == null){
           System.out.println("Id Not Found");
       }
       
       query ="select password from students where student_id =?";
       
       st = conn.prepareStatement(query); 
       st.setInt(1, id);
       rs = st.executeQuery(query);  
       
       while (rs.next())
      {
        id = rs.getInt("student_id");   
        Check_pass =rs.getString("password");
      }
              
      if (Check_pass.equals(pass)){
        StdwelcomeGUI a = new StdwelcomeGUI();
        a.setVisible(true);
        login = true;
      }
      else
            System.out.println("Password not match");

    }
    
    
    catch (SQLException ex) {
            Logger.getLogger(student_driverCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
       
        
}
