package com.yanweitong.controller.me;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TimController
 * Description:
 * @author: weitongyan
 * @date: 06/Nov/2017 20:09
 */
@Controller
@RequestMapping("/me")
public class MeController {

    @RequestMapping("")
    public ModelAndView me(){
        return new ModelAndView("/me/me","me",null);
    }

}
