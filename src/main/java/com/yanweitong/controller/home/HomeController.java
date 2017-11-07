package com.yanweitong.controller.home;

import java.util.HashMap;
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
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    public ModelAndView home(HttpServletRequest request){
        HashMap<Long,Long> hashMap = new HashMap<>();
        return new ModelAndView("/home/home","home",null);
    }
    
}
