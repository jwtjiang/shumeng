package com.example.demo.service;

import com.example.demo.util.Constant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/7/26.
 * 其他业务接口实现类
 */
@Service
public class otherBusinessServiceImp implements otherBusinessService{
    @Override
    /**
     * 风险评估查询列表
     */
    public List riskList(String params){
        //获取列表数据
        List list = new ArrayList();
        list.add(Constant.delete_no);
        return list;
    }
}
