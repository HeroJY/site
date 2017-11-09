package com.yanweitong.service.visitor;

import com.yanweitong.dao.vo.visitor.VisitorVO;
import java.util.List;

/**
 * VisitorService
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 10:15
 */

public interface VisitorService {

    void save(VisitorVO vo);

    List<String > getAllIp();

}
