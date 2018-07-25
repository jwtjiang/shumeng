package com.example.demo.po;

import java.util.Date;

public class t_base_report {
    private Integer id;

    private String lineName;

    private String lineId;

    private String towerName;

    private String towerId;

    private String maintainer;

    private String parentregion;

    private String lineLength;

    private Date datetime;

    private Date datetimeMonth;

    private String valtage;

    private String terrain;

    private Float stationmap1;

    private Float stationmap2;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
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

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getParentregion() {
        return parentregion;
    }

    public void setParentregion(String parentregion) {
        this.parentregion = parentregion;
    }

    public String getLineLength() {
        return lineLength;
    }

    public void setLineLength(String lineLength) {
        this.lineLength = lineLength;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetimeMonth() {
        return datetimeMonth;
    }

    public void setDatetimeMonth(Date datetimeMonth) {
        this.datetimeMonth = datetimeMonth;
    }

    public String getValtage() {
        return valtage;
    }

    public void setValtage(String valtage) {
        this.valtage = valtage;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Float getStationmap1() {
        return stationmap1;
    }

    public void setStationmap1(Float stationmap1) {
        this.stationmap1 = stationmap1;
    }

    public Float getStationmap2() {
        return stationmap2;
    }

    public void setStationmap2(Float stationmap2) {
        this.stationmap2 = stationmap2;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}