package com.yanweitong.dao.vo.visitor;

import java.sql.Timestamp;

/**
 * VisitorVO
 * Description:
 * @author: weitongyan
 * @date: 09/Nov/2017 10:17
 */

public class VisitorVO {


    private String ip;

    private Timestamp lastLoginTime;

    private Integer totalLoginNumber ;

    private String addressDesc;

    public VisitorVO() {
    }

    public VisitorVO(String ip, Timestamp lastLoginTime, Integer totalLoginNumber, String addressDesc) {
        this.ip = ip;
        this.lastLoginTime = lastLoginTime;
        this.totalLoginNumber = totalLoginNumber;
        this.addressDesc = addressDesc;
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
