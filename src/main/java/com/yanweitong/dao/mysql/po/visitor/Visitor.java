package com.yanweitong.dao.mysql.po.visitor;

import com.yanweitong.dao.common.BasePO;
import com.yanweitong.dao.vo.visitor.VisitorVO;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Visitor
 * Description:
 * @author: weitongyan
 * @date: 07/Nov/2017 17:09
 */
@Entity
@Table(name = "tb_visitor_ip")
public class Visitor extends BasePO<Long>{


    private static final long serialVersionUID = -40989839057226765L;

    @Column(length = 20,unique = true)
    private String ip;

    @Column
    private Timestamp lastLoginTime;

    @Column(length = 20)
    private Integer totalLoginNumber;

    @Column(length = 50)
    private String addressDesc;

    public Visitor() {
    }

    public Visitor(String ip, Timestamp lastLoginTime, Integer totalLoginNumber, String addressDesc) {
        this.ip = ip;
        this.lastLoginTime = lastLoginTime;
        this.totalLoginNumber = totalLoginNumber;
        this.addressDesc = addressDesc;
    }

    public Visitor(VisitorVO vo){
        this.ip = vo.getIp();
        this.lastLoginTime = vo.getLastLoginTime();
        this.totalLoginNumber = vo.getTotalLoginNumber();
        this.addressDesc = vo.getAddressDesc();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getTotalLoginNumber() {
        return totalLoginNumber;
    }

    public void setTotalLoginNumber(Integer totalLoginNumber) {
        this.totalLoginNumber = totalLoginNumber;
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }
}
