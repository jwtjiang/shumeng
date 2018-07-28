package com.example.demo.dao;

import com.example.demo.po.model;
import com.example.demo.po.modelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface modelMapper {
    int countByExample(modelExample example);

    int deleteByExample(modelExample example);

    int deleteByPrimaryKey(Integer modelid);

    int insert(model record);

    int insertSelective(model record);

    List<model> selectByExample(modelExample example);

    model selectByPrimaryKey(Integer modelid);

    int updateByExampleSelective(@Param("record") model record, @Param("example") modelExample example);

    int updateByExample(@Param("record") model record, @Param("example") modelExample example);

    int updateByPrimaryKeySelective(model record);

    int updateByPrimaryKey(model record);
}