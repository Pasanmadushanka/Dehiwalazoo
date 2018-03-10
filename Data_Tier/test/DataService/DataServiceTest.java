/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataService;

import java.util.ArrayList;
import java.util.List;
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
public class DataServiceTest {
    
    public DataServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addanimal method, of class DataService.
     */
    @Test
    public void testAddanimal() {
        System.out.println("addanimal");
        List<Animal> animal = new ArrayList<Animal>();
        Animal a=new Animal();
        a.setName("Rabbit");
        a.setDescription("Rabbit");
        a.setNoofcategories(2);
        a.setLink("https://www.livescience.com/27320-rabbit.html");
        a.setScientificname("Rabbit");
        animal.add(a);
        DataService instance = new DataService();
        int expResult = 1;
        int result = instance.addanimal(animal,"pasan");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

//    /**
//     * Test of deleteanimal method, of class DataService.
//     */
//    @Test
//    public void testDeleteanimal() {
//        System.out.println("deleteanimal");
//        String name="Rabbit";
//        DataService instance = new DataService();
//        int expResult = 1;
//        int result = instance.deleteanimal(name);
//        assertEquals(expResult, result);
//     
//    }

    /**
     * Test of updateanimal method, of class DataService.
     */
//    @Test
//    public void testUpdateanimal() {
//        System.out.println("updateanimal");
//         List<Animal> animal = new ArrayList<Animal>();
//        Animal a=new Animal();
//        a.setName("Rabbit");
//        a.setDescription("Elephants are the largest land animals on Earth. They have characteristic long noses, or trunks; large, floppy ears; and wide, thick legs. There are two species of elephant. The Asian elephant and the African elephant live on separate continents and have many unique features.");
//        a.setNoofcategories(2);
//        a.setLink("https://www.livescience.com/27320-rabbit.html");
//        a.setScientificname("Rabbit");
//        animal.add(a);
//        DataService instance = new DataService();
//        int expResult = 1;
//        int result = instance.updateanimal(animal,"pasan");
//        assertEquals(expResult, result);
//       
//    }

    /**
     * Test of getallnames method, of class DataService.
     */
//    @Test
//    public void testSearchanimal() {
//        System.out.println("getallnames");
//       // String name = "";
//        DataService instance = new DataService();
//        List<Animal> expResult = null;
//        List<Animal> result = instance.Allanimalnames();
//        if(result==null){
//            fail();
//        }
//       // assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    /**
     * Test of searchanimal method, of class DataService.
     */
//    @Test
//    public void testSearchanimal() {
//        System.out.println("searchanimal");
//        String name = "bear";
//        DataService instance = new DataService();
//        List<Animal> expResult = null;
//        List<Animal> result = instance.searchanimal(name);
//        if(result==null){
//            fail();
//        }
//        
//    }
    
    /**
     * Test of getallnames method, of class DataService.
     */
//    @Test
//    public void testadminlogin() {
//        System.out.println("testadminlogin");
//       // String name = "";
//        DataService instance = new DataService();
//        List<User> user=new ArrayList<User>();
//        User u=new User();
//        u.setUsername("pasan");
//        u.setPassword("1234");
//        user.add(u);
//        String expResult = "pasan";
//        String result = instance.AdminLogin(user);
//        
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
}
