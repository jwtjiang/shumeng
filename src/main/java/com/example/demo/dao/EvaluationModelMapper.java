package com.example.demo.dao;

import com.example.demo.po.evaluationModel;
import com.example.demo.po.evaluationModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface evaluationModelMapper {
    int countByExample(evaluationModelExample example);

    int deleteByExample(evaluationModelExample example);

    int deleteByPrimaryKey(Integer emId);

    int insert(evaluationModel record);

    int insertSelective(evaluationModel record);

    List<evaluationModel> selectByExample(evaluationModelExample example);

    evaluationModel selectByPrimaryKey(Integer emId);

    int updateByExampleSelective(@Param("record") evaluationModel record, @Param("example") evaluationModelExample example);

    int updateByExample(@Param("record") evaluationModel record, @Param("example") evaluationModelExample example);

    int updateByPrimaryKeySelective(evaluationModel record);

    int updateByPrimaryKey(evaluationModel record);
}