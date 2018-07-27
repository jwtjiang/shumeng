package com.example.demo.dao;

import com.example.demo.po.lineRep;
import com.example.demo.po.lineRepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lineRepMapper {
    int countByExample(lineRepExample example);

    int deleteByExample(lineRepExample example);

    int insert(lineRep record);

    int insertSelective(lineRep record);

    List<lineRep> selectByExample(lineRepExample example);

    int updateByExampleSelective(@Param("record") lineRep record, @Param("example") lineRepExample example);

    int updateByExample(@Param("record") lineRep record, @Param("example") lineRepExample example);
}