/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.multirow.controllers;

import com.amexico.multirow.models.Articulo;
import com.amexico.multirow.models.Conectar;
import com.amexico.multirow.models.ListaArticulos;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @RequestMapping(value="/",method=RequestMethod.POST)
    public String index(@ModelAttribute("datos") ListaArticulos datos, HttpServletRequest request){
        String sql  = "UPDATE articulos"+ " SET cantidad=?,nombre=? where id=?";
        System.out.println("-----------------------");
        for (Articulo obj : datos.getArticulos()) {
            System.out.println(obj.getId()+" "+obj.getNombre()+" "+obj.getCantidad()+" "+obj.getChanges());
            if(obj.getChanges().equals("1")){
                System.out.println("updated"+obj.getId());
                this.jdbcTemplate.update(sql,obj.getCantidad(),obj.getNombre(),obj.getId());
            }
        }
        System.out.println("-----------------------");
        return "redirect:/";
    }
    
    @RequestMapping(value="/")
    public ModelAndView index() {
        String sql="select * from articulos order by id asc";
        List<Articulo> datos=this.jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Articulo.class));
        ListaArticulos articulos = new ListaArticulos();
        articulos.setArticulos(datos);
        mav.setViewName("index");
        mav.addObject("datos",articulos);
        return mav;
    }
}