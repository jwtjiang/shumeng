package com.example.demo.po;

import java.util.Date;

public class lineDetails {
    private String lineId;

    private String lineName;

    private String towerName;

    private String towerId;

    private String parentregion;

    private String whdj;

    private String model;

    private String maintainer;

    private String region;

    private Integer lineDelStatus;

    private String dilei;

    private Integer datetimeMonth;

    private Date datetime;

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public String getTowerId() {
        return towerId;
    }

    public void setTowerId(String towerId) {
        this.towerId = towerId;
    }

    public String getParentregion() {
        return parentregion;
    }

    public void setParentregion(String parentregion) {
        this.parentregion = parentregion;
    }

    public String getWhdj() {
        return whdj;
    }

    public void setWhdj(String whdj) {
        this.whdj = whdj;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getLineDelStatus() {
        return lineDelStatus;
    }

    public void setLineDelStatus(Integer lineDelStatus) {
        this.lineDelStatus = lineDelStatus;
    }

    public String getDilei() {
        return dilei;
    }

    public void setDilei(String dilei) {
        this.dilei = dilei;
    }

    public Integer getDatetimeMonth() {
        return datetimeMonth;
    }

    public void setDatetimeMonth(Integer datetimeMonth) {
        this.datetimeMonth = datetimeMonth;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}