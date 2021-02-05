package com.tyrowebdev.E_Banking.model;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailOTPSender {
		public void sendEmail(String email,int otp) {
			String to = email;
		final String from = "YourGmailId@gmail.com(To use as bank's email which will send email's to customer)";
		 final String password ="YourGmailPassword(Password of Bank's Name id)";
		 
		 Properties prop = new Properties();
		 prop.put("mail.smtp.host","smtp.gmail.com");
		 prop.put("mail.smtp.port","465");
		 prop.put("mail.smtp.user","ebanking78@gmail.com");
		 prop.put("mail.smtp.auth","true");
		 prop.put("mail.smtp.socketFactory.port","465");
		 prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		 prop.put("mail.smtp.socketFactory.fallback","false");
		 
		 try {
			 Session session = Session.getDefaultInstance(prop,null);
			 session.setDebug(true);
			 MimeMessage message = new MimeMessage(session);
			 message.setText("Your OTP Is: "+ otp);
			 message.setSubject("OTP for Verification");
			 message.setFrom(new InternetAddress(from));
			 message.addRecipient(RecipientType.TO,new InternetAddress(to));
	         message.saveChanges();
	         Transport transport = session.getTransport("smtp");
	         transport.connect("smtp.gmail.com",from,password);
	         transport.sendMessage(message,message.getAllRecipients());
	         transport.close();
	        }catch(MessagingException e) {
	        	e.printStackTrace();
	        }
		
	}
	}
