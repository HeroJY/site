package com.yanweitong.dao.common;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * BasePO
 * Description:
 * @author: weitongyan
 * @date: 07/Nov/2017 17:12
 */
@MappedSuperclass
public abstract class BasePO<ID> implements Identifiable<ID> {

    private static final long serialVersionUID = 694564832838145656L;

    @Id
    private ID id;

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }
}
