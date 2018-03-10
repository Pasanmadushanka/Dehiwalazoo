/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Night
 */
@WebService(serviceName = "DataService")
public class DataService {


    Connection connect = Connection.getcon();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "addanimal")
    public int addanimal(@WebParam(name = "animal") List<Animal> animal, String username) {
        for(Animal a:animal){
            
            try {

                String sqlquery = "Insert into animal values('" + a.getName() + "'," + a.getNoofcategories() + ",'" + a.getDescription() + "','" + username + "','" + a.getLink()+ "','" + a.getScientificname()+ "')";

                if (connect.Add_Update_delete(sqlquery) >= 1) {
                    return 1;

                } else {
                    return 0;
                }
            } catch (Exception ex) {
                
                    Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
        }
        return 0;
    }
    
    @WebMethod(operationName = "deleteanimal")
    public int deleteanimal(@WebParam(name = "name") String name) {
    
            try {

                String sqlquery = "Delete from animal where name='" + name + "'";

                if (connect.Add_Update_delete(sqlquery) >= 1) {
                    return 1;

                } else {
                    return 0;
                }
            } catch (Exception ex) {
                
                    Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
        
        return 0;
    }
     @WebMethod(operationName = "updateanimal")
    public int updateanimal(@WebParam(name = "animal") List<Animal> animal, String username) {
    for(Animal a:animal){
            try {

                String sqlquery = "Update animal set noofcaegories="+ a.getNoofcategories() +",Description='"+ a.getDescription()+"', link='"+ a.getLink()+"', username='"+username+"', Scientificname='"+a.getScientificname()+"' where name='" + a.getName()+ "'";

                if (connect.Add_Update_delete(sqlquery) >= 1) {
                    return 1;

                } else {
                    return 0;
                }
            } catch (Exception ex) {
                
                    Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
    }
        return 0;
    }
    
        @WebMethod(operationName = "searchanimal")
    public List<Animal> searchanimal(@WebParam(name = "name") String name) {
     List<Animal> information=new ArrayList<Animal>();
            try {
                
                String sqlquery = "Select * from animal where name='"+name+"'";
                ResultSet rs=connect.SearchInfo(sqlquery);
                if (rs.next()) {
                    Animal animal=new Animal();
                    System.err.println(rs.getString("name"));
                    animal.setName(rs.getString("name"));
                    animal.setNoofcategories(rs.getInt("noofcaegories"));
                    animal.setDescription(rs.getString("Description"));
                    animal.setLink(rs.getString("link"));
                    animal.setScientificname(rs.getString("Scientificname"));
                    information.add(animal);
                    return information;

                } else {
                    return null;
                }
            } catch (Exception ex) {
                
                    Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
        return null;
    }
    
        @WebMethod(operationName = "Allanimalnames")
    public List<Animal> Allanimalnames() {
     List<Animal> information=new ArrayList<Animal>();
            try {
                
                String sqlquery = "Select * from animal";
               
                ResultSet rs=connect.SearchInfo(sqlquery);
                
                while (rs.next()) {
                    Animal animal=new Animal();
                    animal.setName(rs.getString("name"));
                    
                    information.add(animal);
                }
                
                    return information;
            } catch (Exception ex) {
                
                    ex.getMessage();
                
            }
        
        return null;
    }
    @WebMethod(operationName = "AdminLogin")
    public String AdminLogin(@WebParam(name = "Admin") List<User> Admin) {
     
            try {
                String sqlquery="";
              for(User u:Admin){  
                 sqlquery = "Select * from Admin where username='"+u.getUsername()+"' AND password='"+u.getPassword()+"'";
               }  
                ResultSet rs=connect.SearchInfo(sqlquery);
                if(rs.next()){
              
                    return rs.getString(1);
                
              }
                else{
                    return null;
              }
               
            } catch (Exception ex) {
                
                    ex.getMessage();
                
            }
        
        return null;
    }
}
