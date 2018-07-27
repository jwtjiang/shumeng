package com.example.demo.service;

import com.example.demo.Util.jsonTranUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.example.demo.Util.Constant;
/**
 * Created by admin on 2018/7/26.
 * 其他业务接口实现类
 */
@Service
public class otherBusinessServiceImp implements otherBusinessService{
    /**
     * 风险评估查询列表
     */
    @Override
    public List riskList(String params){
        //获取列表数据
        List list = new ArrayList();
        list.add(Constant.delete_no);
        return list;
    }
    /**
     * 删除评估风险列表信息
     */
    @Override
    public void delectRiskList(String params){
        //json转化map
        Map map = jsonTranUtil.JsonToMap(params);
        if(StringUtils.isEmpty(map.get("emId"))){
            //全部删除
        }else{
            //条件删除
        }
    }
}
