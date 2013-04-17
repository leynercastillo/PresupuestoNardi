package general;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.zkoss.zk.ui.Sessions;

import com.sun.mail.smtp.SMTPTransport;

/**
 * @author Sistemas
 * 
 */
public class Emails {
    private Properties properties;
    private Session session;

    public Emails() {
	super();
	this.properties = new Properties();
    }

    /**
     * @param propertiesPath
     *            Example: "config/mail.properties" is in WebContent folder.
     */
    public void loadProperties(String propertiesPath) {
	try {
	    properties.load(new FileInputStream(Sessions.getCurrent().getWebApp().getRealPath(propertiesPath)));
	} catch (IOException e) {
	    System.out.println("The properties wasn't loaded.");
	}
    }

    /**
     * @param subject
     *            String mail subject.
     * @param listRecipient
     *            List&lt;String&gt; mail recipient.
     * @param message
     *            String mail message
     * @param listAttach
     *            List&lt;String&gt; mail attach.
     * @throws MessagingException
     *             It happens when the properties aren't loaded.
     */
    public void sendMail(String subject, List<String> listRecipient, String message, List<File> listAttach) throws MessagingException {
	session = Session.getInstance(properties, null);
	Message mail = new MimeMessage(session);
	mail.setFrom(new InternetAddress(properties.getProperty("mail.from")));
	for (String email : listRecipient) {
	    mail.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
	}
	mail.setSubject(subject);
	mail.setSentDate(new Date());
	BodyPart bodyMessage = new MimeBodyPart();
	bodyMessage.setText(message);
	Multipart multipart = new MimeMultipart();
	multipart.addBodyPart(bodyMessage);
	if (listAttach != null)
	    for (File attach : listAttach) {
		bodyMessage = new MimeBodyPart();
		DataSource source = new FileDataSource(attach);
		bodyMessage.setDataHandler(new DataHandler(source));
		bodyMessage.setFileName(source.getName());
		multipart.addBodyPart(bodyMessage);
	    }
	mail.setContent(multipart);
	SMTPTransport transport = (SMTPTransport) session.getTransport("smtp");
	try {
	    transport.connect(properties.getProperty("mail.user"), properties.getProperty("mail.password"));
	    transport.sendMessage(mail, mail.getAllRecipients());
	} finally {
	    transport.close();
	}
    }
}
