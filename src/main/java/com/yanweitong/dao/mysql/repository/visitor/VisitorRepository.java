package com.yanweitong.dao.mysql.repository.visitor;

import com.yanweitong.dao.common.jpa.CommonJpaRepository;
import com.yanweitong.dao.mysql.po.visitor.Visitor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * VisitorRepository
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 09:46
 */

public interface VisitorRepository extends CommonJpaRepository<Visitor,Long> ,VisitorDAO, JpaSpecificationExecutor<Visitor>{

    @Query("SELECT ip from Visitor")
    List<String> getIps();

    /**
     * 根据IP查PO
     * @param str
     * @return
     */
    Visitor findByIp(String str);
    
}
