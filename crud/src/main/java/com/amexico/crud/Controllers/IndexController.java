package com.amexico.crud.Controllers;

import com.amexico.crud.models.Conectar;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController { 
 
   private JdbcTemplate jdbcTemplate;
    
    public IndexController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView mav=new ModelAndView();
        String sql="select * from usuarios order by id asc";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("index");
        return mav;
    }
 
}