package tn.esprit.business;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Subscription;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Session Bean implementation class InscriptionService
 */
@Stateless
@LocalBean
public class InscriptionService implements InscriptionServiceRemote, InscriptionServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public InscriptionService() {
        
    }

	@Override
	public void inscription(Person customer) {
		em.persist(customer);
	}

	@Override
	public Customer find(Integer id) {
		
		return em.find(Customer.class, id);
	}

	@Override
	public void copie(String pathToCopy, String pathToPaste) {
		
		try{
			
		FileInputStream src = new FileInputStream(pathToCopy);
	    FileOutputStream dest = new FileOutputStream(pathToPaste);
		
		 	 src = new FileInputStream(pathToCopy);
		     dest = new FileOutputStream(pathToPaste);
		 
		    FileChannel inChannel = src.getChannel();
		    FileChannel outChannel = dest.getChannel();
		 
		    for (ByteBuffer buffer = ByteBuffer.allocate(1024*1024);
		         inChannel.read(buffer) != -1;
		         buffer.clear()) {
		       buffer.flip();
		       while (buffer.hasRemaining()) outChannel.write(buffer);
		    }
		 
		    inChannel.close();
		    outChannel.close();
		}catch(Exception e){
			
		}
		
	}

	@Override
	public boolean SendMail(String from, String password, String Subject,
			String message, String[] to, String[] attachFiles) {
		
		String host="smtp.gmail.com";
        Properties props= System.getProperties();
        props.put("mail.smtp.starttls.enable","true"); 
        props.put ("mail.smtp.host",host);
        props.put ("mail.smtp.user",from);
        props.put ("mail.smtp.password",password);
        props.put ("mail.smtp.port",587);
        props.put ("mail.smtp.auth","true");
        
        
        Session session= Session.getDefaultInstance(props,null);
        MimeMessage mimeMessage=new MimeMessage(session);
        try{
        mimeMessage.setFrom(new InternetAddress(from));
        InternetAddress[]toAdress =new InternetAddress[to.length];
        for (int i=0;i<to.length;i++){
             toAdress[i]= new InternetAddress(to[i]);
        }
        for (int i=0;i<toAdress.length;i++){
            mimeMessage.addRecipients(Message.RecipientType.TO, toAdress);
        }
            mimeMessage.setSubject(Subject);
            
           /* MimeBodyPart messagebodypart =new MimeBodyPart();
            messagebodypart.setText(message);
            Multipart multipart= new MimeMultipart();
            multipart.addBodyPart(messagebodypart);
            messagebodypart=new MimeBodyPart();
            Contact_Email_Freelancer e = new Contact_Email_Freelancer();
            javax.activation.DataSource source =new FileDataSource();
            messagebodypart.setDataHandler(new DataHandler(source));
            messagebodypart.setFileName();
            multipart.addBodyPart(messagebodypart);
            
            mimeMessage.setContent(multipart);*/
                    // msg.setSentDate(new Date());
 
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");
 
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
 
        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();
 
                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
 
                multipart.addBodyPart(attachPart);
            }
        }
 
        // sets the multi-part as e-mail's content
        mimeMessage.setContent(multipart);
 
            //mimeMessage.setText(message);
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
           // Transport.send(mimeMessage);
           //transport.close();
            return true;
        
        }catch(MessagingException me){
            me.printStackTrace();
        }
        return false;
	}
	
	

}
