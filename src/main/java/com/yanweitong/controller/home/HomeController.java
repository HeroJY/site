package com.yanweitong.controller.home;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 * Description:
 * @author: weitongyan
 * @date: 24/Oct/2017 01:04
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(HttpServletRequest request){
        return new ModelAndView("/home/home","home",null);
    }
    
}
