package com.leena.spring.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;

@Service
public class EmailService {
    @Autowired
    private SimpleMailMessage templateMessage;
    @Autowired
    private MailSender mailSender;

    public void sendMail() {
        SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
        //msg.setTo(to);
        //Setting mail text
        msg.setText("This is a test mail sent through Spring framework");
        try{
            this.mailSender.send(msg);
        }
        catch (MailException ex) {
            // just printing
            System.out.println(ex.getMessage());
        }
    }
}