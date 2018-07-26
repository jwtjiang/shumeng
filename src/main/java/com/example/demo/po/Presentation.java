package com.example.demo.po;

import java.util.Date;

/**
 *报告实体类
 */
public class Presentation {
    /** 报告ID **/
    private Long preId;
    /** 报告名称**/
    private String preName;
    /**  报告生成时间**/
    private Date preCreateTime;
    /** 评估模型ID **/
    private Integer emId;
    /**  符合度**/
    private String coincidenceDegree;
    /** 报告点评 **/
    private String preComment;
    /** date预留字段2 **/
    private Date date2;
    /** date预留字段1 **/
    private Date date1;
    /** 字符串预留字段3 **/
    private String bz3;
    /** 字符串预留字段2 **/
    private String bz2;
    /** 字符串预留字段1 **/
    private String bz1;
    /** 风险类型 **/
    private String preFactor;
    /** 报告删除状态 0 删除 1未删 **/
    private int preDelstatus;

    public int getPreDelstatus() {
        return preDelstatus;
    }

    public void setPreDelstatus(int preDelstatus) {
        this.preDelstatus = preDelstatus;
    }

    public Long getPreId() {
        return preId;
    }

    public void setPreId(Long preId) {
        this.preId = preId;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public Date getPreCreateTime() {
        return preCreateTime;
    }

    public void setPreCreateTime(Date preCreateTime) {
        this.preCreateTime = preCreateTime;
    }

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getCoincidenceDegree() {
        return coincidenceDegree;
    }

    public void setCoincidenceDegree(String coincidenceDegree) {
        this.coincidenceDegree = coincidenceDegree;
    }

    public String getPreComment() {
        return preComment;
    }

    public void setPreComment(String preComment) {
        this.preComment = preComment;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public String getBz3() {
        return bz3;
    }

    public void setBz3(String bz3) {
        this.bz3 = bz3;
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    public String getPreFactor() {
        return preFactor;
    }

    public void setPreFactor(String preFactor) {
        this.preFactor = preFactor;
    }
}