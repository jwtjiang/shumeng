package com.example.demo.po;

import java.util.Date;

/**
 *线路实体类
 */
public class LineDetails {
    /** 线路ID **/
    private String lineId;
    /**  线路名称 **/
    private String lineName;
    /**  杆塔名称 **/
    private String towerName;
    /**  杆塔id **/
    private String towerId;
    /**  杆塔所在地区的父地区编号 **/
    private String parentregion;
    /**  评估模型id **/
    private Integer emId;
    /**  报告id **/
    private Long preId;
    /**  供电公司 **/
    private String maintainer;
    /**  绝缘爬距 **/
    private Integer insulationCreepDistance;
    /**  绝缘吨位（T） **/
    private Integer insulationTon;
    /** 绝缘配置高度 **/
    private Integer insulationHigh;
    /**  绝缘配置_每串个数 **/
    private Integer insulationBunchNum;
    /**  接地电阻设置值 **/
    private Integer resistanceDesignValue;
    /**  杆塔_纬度 **/
    private Float stationmap2;
    /**  杆塔_经度 **/
    private Float stationmap1;
    /**  地形地貌 **/
    private String terrain;
    /**  电压等级 **/
    private String voltage;
    /**  月份 **/
    private Integer datetimeMonth;
    /**  日期时间 **/
    private Date datetime;
    /**  线路长度 **/
    private Float lineLength;
    /**  0 删除 1未删 **/
    private int lineDelstatus;

    public int getLineDelstatus() {
        return lineDelstatus;
    }

    public void setLineDelstatus(int lineDelstatus) {
        this.lineDelstatus = lineDelstatus;
    }

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

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public Long getPreId() {
        return preId;
    }

    public void setPreId(Long preId) {
        this.preId = preId;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public Integer getInsulationCreepDistance() {
        return insulationCreepDistance;
    }

    public void setInsulationCreepDistance(Integer insulationCreepDistance) {
        this.insulationCreepDistance = insulationCreepDistance;
    }

    public Integer getInsulationTon() {
        return insulationTon;
    }

    public void setInsulationTon(Integer insulationTon) {
        this.insulationTon = insulationTon;
    }

    public Integer getInsulationHigh() {
        return insulationHigh;
    }

    public void setInsulationHigh(Integer insulationHigh) {
        this.insulationHigh = insulationHigh;
    }

    public Integer getInsulationBunchNum() {
        return insulationBunchNum;
    }

    public void setInsulationBunchNum(Integer insulationBunchNum) {
        this.insulationBunchNum = insulationBunchNum;
    }

    public Integer getResistanceDesignValue() {
        return resistanceDesignValue;
    }

    public void setResistanceDesignValue(Integer resistanceDesignValue) {
        this.resistanceDesignValue = resistanceDesignValue;
    }

    public Float getStationmap2() {
        return stationmap2;
    }

    public void setStationmap2(Float stationmap2) {
        this.stationmap2 = stationmap2;
    }

    public Float getStationmap1() {
        return stationmap1;
    }

    public void setStationmap1(Float stationmap1) {
        this.stationmap1 = stationmap1;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
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

    public Float getLineLength() {
        return lineLength;
    }

    public void setLineLength(Float lineLength) {
        this.lineLength = lineLength;
    }
}