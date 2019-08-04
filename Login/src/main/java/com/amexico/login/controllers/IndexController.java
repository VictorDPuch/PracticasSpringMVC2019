/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.login.controllers;

import com.amexico.login.models.Conectar;
import com.amexico.login.models.User;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author victorpuch
 */
@Controller
public class IndexController {
    
    private static Conectar connection;
    private static JdbcTemplate jdbctemplate;
    private static ModelAndView mav;
    
    public IndexController(){
        connection=new Conectar();
        jdbctemplate=new JdbcTemplate(connection.conectar());
        mav=new ModelAndView();
    }
    @RequestMapping("/")
    public ModelAndView index(){
        mav.setViewName("index");
        mav.addObject("login",new User());
        return mav;
    }
    @RequestMapping("loginprocess")
    public ModelAndView loginprocess(@ModelAttribute("inicial") User user, HttpServletRequest request){
          String sql = "SELECT * FROM users where BINARY user=? and BINARY pass=?";
          try{
              user = jdbctemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(User.class), user.getUser(), user.getPass());
              mav.setViewName("sucess");
              request.getSession().setAttribute("user", user); 
              return mav;
          }catch (Exception e){
              mav.setViewName("rejected");
              return mav;
          }
    }
}
