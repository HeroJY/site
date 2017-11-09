package com.yanweitong.controller.base;

import com.yanweitong.dao.common.IdService;
import com.yanweitong.dao.mysql.po.visitor.Visitor;
import com.yanweitong.dao.vo.visitor.VisitorVO;
import com.yanweitong.service.visitor.VisitorService;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private VisitorService visitorService;


    @RequestMapping("")
    public ModelAndView indexPage(HttpServletRequest request){
        saveIp(request);
        return new ModelAndView("index","index",null);
    }



    /** ------------private---------------- */


    /**
     * 保存用户IP
     * @param request
     */
    private void saveIp(HttpServletRequest request){
        VisitorVO visitorVO = new VisitorVO();
        visitorVO.setIp(request.getRemoteHost());
        visitorVO.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
        visitorService.save(visitorVO);
    }
}
