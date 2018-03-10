/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail;


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
public class MailsTest {
    
    /**
     * Test of sendingMails method, of class Mails.
     */
    @Test
    public void testSendingMails() throws Exception {
        System.out.println("sendingMails");
        String email = "pasanmadusanka95@gmail.com";
        String subject = "Requesting information";
        String msg = "I want some information about your events. If you can send me those information as soon as possible. I would be so grateful to you..";
        Mails instance = new Mails();
        instance.sendingMails(email, subject, msg);
       
    }
    
}
