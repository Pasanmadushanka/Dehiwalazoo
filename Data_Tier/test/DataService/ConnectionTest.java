/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Night
 */
public class ConnectionTest {
    
    
    /**
     * Test of getcon method, of class Connection.
     */
//    @Test
//    public void testGetcon() {
//        System.out.println("getcon");
//        Connection result = Connection.getcon();
//        if(result==null){
//            fail();
//        }
//        
//        
//    }

//    /**
//     * Test of Add_Update_delete method, of class Connection.
//     */
//    @Test
//    public void testAdd_Update_delete() throws Exception {
//        System.out.println("Add_Update_delete");
//        String query = "Delete from admin where Username='pasan'";
//        Connection instance = Connection.getcon();
//        
//        int expResult = 1;
//        int result = instance.Add_Update_delete(query);
//        assertEquals(expResult, result);
//        
//    }

    /**
     * Test of SearchInfo method, of class Connection.
     */
    @Test
    public void testSearchInfo() throws Exception {
        System.out.println("SearchInfo");
        String query = "Select * from animal where name='bear'";
        Connection instance = Connection.getcon();
        ResultSet expResult = null;
        ResultSet result = instance.SearchInfo(query);
        if(result==null){
            fail();
        }
    }
    
}
