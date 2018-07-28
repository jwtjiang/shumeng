package com.example.demo.dao;

import com.example.demo.po.lineReport;
import com.example.demo.po.lineReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lineReportMapper {
    int countByExample(lineReportExample example);

    int deleteByExample(lineReportExample example);

    int insert(lineReport record);

    int insertSelective(lineReport record);

    List<lineReport> selectByExample(lineReportExample example);

    int updateByExampleSelective(@Param("record") lineReport record, @Param("example") lineReportExample example);

    int updateByExample(@Param("record") lineReport record, @Param("example") lineReportExample example);
}