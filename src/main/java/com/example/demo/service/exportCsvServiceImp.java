package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.t_base_reportMapper;
import com.example.demo.po.t_base_report;

import javax.annotation.Resource;

/**
 * Created by jwt on 2018/7/25.
 * 导出csv实现类
 */
@Service
public class exportCsvServiceImp implements exportCsvService{
    @Resource
    t_base_reportMapper t_base_reportmapper;
    @Override
    public String name(int id){
        t_base_report m = t_base_reportmapper.selectByPrimaryKey(id);
        System.out.println(m.getLineName());
       return "qweqe";
    }
}
