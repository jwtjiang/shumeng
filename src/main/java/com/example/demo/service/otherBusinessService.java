package com.example.demo.service;

import java.util.List;

/**
 * Created by admin on 2018/7/26.
 * 其他业务接口
 */
public interface otherBusinessService {
    /**
     * 风险评估查询列表接口
     * @param params
     * @return list
     */
    public List riskList(String params);

    /**
     * 删除风险评估列表信息
     * @param params
     */
    public void delectRiskList(String params);
}
