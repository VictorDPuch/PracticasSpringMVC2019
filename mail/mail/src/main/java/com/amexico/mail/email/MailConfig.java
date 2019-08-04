
package com.amexico.mail.email;

import java.util.Properties;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
 
@Configuration
public class MailConfig {
 
    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setDefaultEncoding("UTF-8");
        //mailSender.setHost("smtp-mail.outlook.com");
        //mailSender.setPort(587);
        mailSender.setHost("mail.analiticamex.com");
        mailSender.setPort(2525);
 
        mailSender.setUsername(MyConstants.MY_EMAIL);
        mailSender.setPassword(MyConstants.MY_PASSWORD);
 
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        System.gc();
        return mailSender;
    }
 
}
    