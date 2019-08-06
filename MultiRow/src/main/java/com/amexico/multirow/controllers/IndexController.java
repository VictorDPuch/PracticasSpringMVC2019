/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.multirow.controllers;

import com.amexico.multirow.models.Conectar;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author victorpuchacer
 */
@Controller
public class IndexController {
    
    private static ModelAndView mav =new ModelAndView();
    private JdbcTemplate jdbcTemplate;
    
    public IndexController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(value="/")
    
    public ModelAndView index() {
         String sql="select * from articulos order by id asc";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.setViewName("index");
        mav.addObject("datos",datos);
        return mav;
    }
}
