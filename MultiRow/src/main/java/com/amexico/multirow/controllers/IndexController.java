/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.multirow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author victorpuchacer
 */
@Controller
public class IndexController {
    private static ModelAndView mav =new ModelAndView();;
    
    @RequestMapping(value="/")
    
    public ModelAndView index() {
        mav.setViewName("index");
        return mav;
    }
}
