package email;
import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import texts.AllTexts;

public class MainEmail{
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
    "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
    	protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication(AllTexts.getMyEmail(),AllTexts.getPassWord());
           }
      });
    
    
    /** DeBug */
    session.setDebug(false);

    try {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress(AllTexts.getMyEmail()));

      Address[] toUser = InternetAddress.parse(AllTexts.getTo());
      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject(AllTexts.getSubject());

      MimeBodyPart mbp1 = new MimeBodyPart();
      mbp1.setText("Enviando arquivo");

      MimeBodyPart mbp2 = new MimeBodyPart();
      
      FileDataSource fds = new FileDataSource(AllTexts.getFile_Path());
      mbp2.setDataHandler(new DataHandler(fds));
      mbp2.setFileName(fds.getName());
      
      Multipart mp = new MimeMultipart();
      mp.addBodyPart(mbp1);
      mp.addBodyPart(mbp2);
      
      message.setContent(mp);
      message.setSentDate(new Date());
      
      Transport.send(message);
     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
}