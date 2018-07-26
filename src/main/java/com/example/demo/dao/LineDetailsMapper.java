package com.example.demo.dao;


import com.example.demo.po.LineDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface LineDetailsMapper {

    int deleteByPrimaryKey(String lineId);

    int insert(LineDetails record);

    int insertSelective(LineDetails record);

    LineDetails selectByPrimaryKey(String lineId);

    int updateByPrimaryKeySelective(LineDetails record);

    int updateByPrimaryKey(LineDetails record);
}