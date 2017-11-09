package com.yanweitong.dao.common.jpa;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * CommonJpaRepository
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 09:50
 */
@NoRepositoryBean
public interface CommonJpaRepository<T,ID extends Serializable> extends JpaRepository<T,ID>{

    void persist(T entity);
}
