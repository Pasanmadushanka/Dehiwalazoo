/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NaTsU
 */
public class Connection {
   
    private java.sql.Connection con;
    private Statement St;
    private ResultSet Rs;
    private static Connection connect=new Connection();
    
    private Connection(){
         try {
           
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/animal_classification_system", "root", "pasanpc123");
            St = con.createStatement();
        } catch (ClassNotFoundException ex) {

           // System.err.println(ex.getMessage());
        } catch (SQLException ex) {
           // System.err.println(ex.getMessage());
        }  
    }
    
    public static Connection getcon(){
        return connect;
    }
    public int Add_Update_delete(String query) throws Exception{
      try{
          return St.executeUpdate(query);
      }
      catch(Exception ex){
          throw ex;
      }
    }
     public ResultSet SearchInfo(String query) throws Exception{
      try{
         
          return St.executeQuery(query); 
      }
      catch(Exception ex){
          throw ex;
      }
    }
}
