package com.yanweitong.controller.base;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BaseController
 * Description:
 * @author: weitongyan
 * @date: 06/Nov/2017 21:08
 */
@Controller
@RequestMapping("")
public class BaseController {  

    @RequestMapping("")
    public ModelAndView indexPage(HttpServletRequest request){

        return new ModelAndView("index","index",null);
    }
}
