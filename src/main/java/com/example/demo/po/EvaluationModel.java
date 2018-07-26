package com.example.demo.po;

/**
 *风险模型实体类
 */
public class EvaluationModel {
    /** 评估模型id **/
    private Integer emId;
    /** 评估模型名称 **/
    private String emName;

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }
}