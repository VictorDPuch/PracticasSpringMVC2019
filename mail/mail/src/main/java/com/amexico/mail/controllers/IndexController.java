package com.amexico.mail.controllers;

import com.amexico.mail.email.MyConstants;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    public JavaMailSender emailSender;
    
    private ModelAndView crearmav(String name) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(name);
        return mav;
    }

    public ModelAndView home(Model model) {
        model.addAttribute("datos", new Datos());
        return crearmav("index");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        return crearmav("index").addObject("datos", new Datos());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(
            @ModelAttribute("datos") Datos u, BindingResult result, SessionStatus status)
            throws MessagingException {

        try {
            MimeMessage message;
            message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setFrom(MyConstants.MY_EMAIL);
            helper.setTo(u.getCorreo());
            helper.setSubject("HOLA VERGA");
            helper.setText("prro");
            emailSender.send(message);
            return crearmav("mailsend");
        } catch (MessagingException | MailException e) {
            return crearmav("fail");
        }
    }
}