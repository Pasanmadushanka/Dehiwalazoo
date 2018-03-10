/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessService;

import Mail.Mails;
import dataservice.Animal;
import dataservice.User;
import dataservice.DataService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.mail.MessagingException;

/**
 *
 * @author Night
 */
@WebService(serviceName = "BussinessService")
public class BussinessService {

    /**
     * This is a sample web service operation
     */
    dataservice.DataService proxy = new dataservice.DataService_Service().getDataServicePort();

    @WebMethod(operationName = "SendingMessage")
    public boolean SendingMessage(@WebParam(name = "name") String name, @WebParam(name = "email") String email, @WebParam(name = "subject") String subject, @WebParam(name = "message") String message) {
        Mails mail = new Mails();

        message = "I'm " + name + ". " + message;

        try {
            mail.sendingMails(email, subject, message);
        } catch (MessagingException ex) {
            Logger.getLogger(BussinessService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    @WebMethod(operationName = "Animalsnames")
    public List<Animal> Animalsnames() {
        return proxy.allanimalnames();
    }

    @WebMethod(operationName = "Searchanimals")
    public List<Animal> Searchanimals(@WebParam(name = "name") String name) {
        return proxy.searchanimal(name);
    }
    
      @WebMethod(operationName = "AdminLogin")
    public String AdminLogin(@WebParam(name = "admin") List<User> admin) {
        return proxy.adminLogin(admin);
    }
    
     @WebMethod(operationName = "Addanimal")
    public int Addanimal(@WebParam(name = "animal") List<Animal> animal, @WebParam(name = "name") String username) {
        return proxy.addanimal(animal, username);
    }
    
     @WebMethod(operationName = "updateanimal")
    public int updateanimal(@WebParam(name = "animal") List<Animal> animal, @WebParam(name = "name") String username) {
        return proxy.updateanimal(animal, username);
    }
    
     @WebMethod(operationName = "Deleteanimal")
    public int Deleteanimal(@WebParam(name = "name") String name) {
        return proxy.deleteanimal(name);
    }
    
   
}
