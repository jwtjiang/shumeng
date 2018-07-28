package com.example.demo.po;

import java.util.Date;

public class report {
    private String reportid;

    private String title;

    private Date createtime;

    private String conformity;

    private Integer reportDelStatus;

    private Date date2;

    private Date date1;

    private String bz3;

    private String bz2;

    private String bz1;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getConformity() {
        return conformity;
    }

    public void setConformity(String conformity) {
        this.conformity = conformity;
    }

    public Integer getReportDelStatus() {
        return reportDelStatus;
    }

    public void setReportDelStatus(Integer reportDelStatus) {
        this.reportDelStatus = reportDelStatus;
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
}