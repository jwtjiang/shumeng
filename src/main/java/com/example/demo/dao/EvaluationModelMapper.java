package com.example.demo.dao;


import com.example.demo.po.EvaluationModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluationModelMapper {

    int deleteByPrimaryKey(Integer emId);

    int insert(EvaluationModel record);

    int insertSelective(EvaluationModel record);

    EvaluationModel selectByPrimaryKey(Integer emId);

    int updateByPrimaryKeySelective(EvaluationModel record);

    int updateByPrimaryKey(EvaluationModel record);
}