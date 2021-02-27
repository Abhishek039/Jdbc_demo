/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.*;
import java.util.Calendar;
public class JdbcDemo {

  
    public static void main(String[] args) {
    
    try
    {
      // create a mysql database connection
      String myDriver ="com.mysql.jdbc.Driver";
     Class.forName(myDriver);
      Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "");
    
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      //String query = " insert into student (rollno, sname)" + " values (?, ?)";

      // create the mysql insert preparedstatement
      //PreparedStatement preparedStmt = conn.prepareStatement(query);
      //preparedStmt.setInt (1, 6);
      //preparedStmt.setString (2, "Rubble");
      
      //String query1 = "update student set sname = ? where rollno= ?";
      //PreparedStatement preparedStmt1 = conn.prepareStatement(query1);
      //preparedStmt1.setInt   (1, 3);
      //preparedStmt1.setInt (2, 4);



      // execute the preparedstatement
      //preparedStmt1.execute();
     /** Statement stmt= conn.createStatement();  
    ResultSet rs=stmt.executeQuery("select rollno, sname from student where rollno =2");  
    
    while(rs.next())
   {
   System.out.println(rs.getString(1));   
    System.out.println(rs.getString(2));
   }**/
      String sql = "DELETE FROM student WHERE rollno=?";
 
 PreparedStatement statement = conn.prepareStatement(sql);
 statement.setInt(1,6000 );
 statement.execute();

      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
    }
    
    
