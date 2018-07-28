package com.example.demo.dao;

import com.example.demo.po.lineDetails;
import com.example.demo.po.lineDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lineDetailsMapper {
    int countByExample(lineDetailsExample example);

    int deleteByExample(lineDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(lineDetails record);

    int insertSelective(lineDetails record);

    List<lineDetails> selectByExample(lineDetailsExample example);

    lineDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") lineDetails record, @Param("example") lineDetailsExample example);

    int updateByExample(@Param("record") lineDetails record, @Param("example") lineDetailsExample example);

    int updateByPrimaryKeySelective(lineDetails record);

    int updateByPrimaryKey(lineDetails record);
}