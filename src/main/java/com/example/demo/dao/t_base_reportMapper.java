package com.example.demo.dao;

import com.example.demo.po.t_base_report;
import com.example.demo.po.t_base_reportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_base_reportMapper {
    int countByExample(t_base_reportExample example);

    int deleteByExample(t_base_reportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(t_base_report record);

    int insertSelective(t_base_report record);

    List<t_base_report> selectByExample(t_base_reportExample example);

    t_base_report selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") t_base_report record, @Param("example") t_base_reportExample example);

    int updateByExample(@Param("record") t_base_report record, @Param("example") t_base_reportExample example);

    int updateByPrimaryKeySelective(t_base_report record);

    int updateByPrimaryKey(t_base_report record);
}