package com.example.demo.dao;

import com.example.demo.po.t_base_report;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_base_reportMapper {
    t_base_report selectByPrimaryKey(Integer id);
}