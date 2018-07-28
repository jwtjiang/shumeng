package com.example.demo.dao;

import com.example.demo.po.lineModel;
import com.example.demo.po.lineModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lineModelMapper {
    int countByExample(lineModelExample example);

    int deleteByExample(lineModelExample example);

    int insert(lineModel record);

    int insertSelective(lineModel record);

    List<lineModel> selectByExample(lineModelExample example);

    int updateByExampleSelective(@Param("record") lineModel record, @Param("example") lineModelExample example);

    int updateByExample(@Param("record") lineModel record, @Param("example") lineModelExample example);
}