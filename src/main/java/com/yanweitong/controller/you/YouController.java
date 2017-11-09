package com.yanweitong.controller.you;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * YouController
 * Description:
 * @author: weitongyan
 * @date: 07/Nov/2017 09:58
 */
@Controller
@RequestMapping("/you")
public class YouController {  

    @RequestMapping("")
    public ModelAndView you(){
        return  new ModelAndView("you/you","you",null);
    }
}
