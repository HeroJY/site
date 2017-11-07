package com.yanweitong.dao.common;

import java.io.Serializable;

/**
 * Identifiable
 * Description:
 * @author: weitongyan
 * @date: 07/Nov/2017 17:15
 */

public interface Identifiable<ID> extends Serializable {

    ID getId();

    void setId(ID id);
}
