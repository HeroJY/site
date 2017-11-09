package com.yanweitong.dao.mysql.repository.visitor;

import com.yanweitong.dao.common.jpa.CommonJpaRepositoryBean;
import com.yanweitong.dao.mysql.po.visitor.Visitor;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * VisitorIpRepositoryImpl
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 09:46
 */
@Repository
public class VisitorRepositoryImpl extends CommonJpaRepositoryBean<Visitor,Long> implements VisitorDAO {

    @Autowired
    public VisitorRepositoryImpl(EntityManager em) {
        super(Visitor.class, em);
    }

}
