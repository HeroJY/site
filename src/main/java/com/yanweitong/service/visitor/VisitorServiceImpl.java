package com.yanweitong.service.visitor;

import com.yanweitong.dao.common.IdService;
import com.yanweitong.dao.mysql.po.visitor.Visitor;
import com.yanweitong.dao.mysql.repository.visitor.VisitorRepository;
import com.yanweitong.dao.vo.visitor.VisitorVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * VisitorServiceImpl
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 10:23
 */
@Service
public class VisitorServiceImpl implements VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    @Autowired
    private IdService idService;

    @Override
    public void save(VisitorVO vo) {
        Visitor visitor = new Visitor(vo);

        //判断是否已有此IP记录，执行更新或新增
        List<String> ips = visitorRepository.getIps();
        //判断数据库中有无数据
        if(ips.isEmpty()){
            visitor.setTotalLoginNumber(1);
            visitor.setId(idService.nextId());
            visitorRepository.save(visitor);
        }else {
            for(String str : ips){
                if(vo.getIp().equals(str)){
                    Visitor oldVisitor = visitorRepository.findByIp(str);
                    oldVisitor.setTotalLoginNumber(oldVisitor.getTotalLoginNumber()+1);
                    visitorRepository.save(oldVisitor);
                }else {
                    visitor.setTotalLoginNumber(1);
                    visitor.setId(idService.nextId());
                    visitorRepository.save(visitor);
                }
            }
        }

    }

    @Override
    public List<String> getAllIp() {
        List<String> ips = visitorRepository.getIps();
        return ips;
    }
}
