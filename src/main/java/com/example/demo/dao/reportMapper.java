package com.example.demo.dao;

import com.example.demo.po.report;
import com.example.demo.po.reportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface reportMapper {
    int countByExample(reportExample example);

    int deleteByExample(reportExample example);

    int deleteByPrimaryKey(String reportid);

    int insert(report record);

    int insertSelective(report record);

    List<report> selectByExample(reportExample example);

    report selectByPrimaryKey(String reportid);

    int updateByExampleSelective(@Param("record") report record, @Param("example") reportExample example);

    int updateByExample(@Param("record") report record, @Param("example") reportExample example);

    int updateByPrimaryKeySelective(report record);

    int updateByPrimaryKey(report record);
}