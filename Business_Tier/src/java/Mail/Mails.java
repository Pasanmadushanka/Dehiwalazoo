package Mail;



import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;

public class Mails {

    public void sendingMails(String email, String subject, String msges) throws MessagingException {
        Properties property = new Properties();
        property.put("mail.smtp.host", "smtp.gmail.com");
        property.put("mail.smtp.port", "587");
        property.put("mail.smtp.auth", "true");
        property.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("abcnugegoda@gmail.com ", "chamodipasan");
            }
        };

        Session session = Session.getInstance(property, auth);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("abcnugegoda@gmail.com "));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
        message.setSubject(subject);
        message.setText(msges);

        Transport.send(message);
    }
}
