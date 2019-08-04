package com.amexico.chooseyourpokemon.controllers;
import com.amexico.chooseyourpokemon.models.Seleccionado;
import com.amexico.chooseyourpokemon.models.Conectar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{
    private static Conectar connection;
    private static JdbcTemplate jdbctemplate;
    private static ModelAndView mav;
    
    public IndexController(){
        connection=new Conectar();
        jdbctemplate=new JdbcTemplate(connection.conectar());
        mav=new ModelAndView();
    }
    
    @RequestMapping(value="/", method={RequestMethod.GET})
    public ModelAndView index(@ModelAttribute("inicial") Seleccionado pokemon, HttpServletRequest request) {
        mav.setViewName("index");
        String sql = "SELECT * FROM iniciales ORDER BY nombre ASC";
        String sql1 = "SELECT * FROM seleccionado where entrenador=?";
        List pokelist = jdbctemplate.queryForList(sql);
        pokemon = jdbctemplate.queryForObject(sql1, BeanPropertyRowMapper.newInstance(Seleccionado.class),1);
        mav.addObject("inicial",pokemon);
        mav.addObject("datos",pokelist);
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView select(@ModelAttribute("inicial") Seleccionado pokemon, HttpServletRequest request){
        String sql3  = "UPDATE seleccionado"
                + " SET eleccion=? where entrenador=?";
        mav.setViewName("index");
        jdbctemplate.update(sql3,pokemon.getEleccion(),1);
        mav.addObject("inicial",pokemon);
        return mav;
    }
}