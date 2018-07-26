package com.example.demo.dao;


import com.example.demo.po.EvaluationModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 风险模型Mapper
 */
public interface EvaluationModelMapper {
    /**
     * 根据id删除
     * @param emId
     * @return
     */
    int deleteByPrimaryKey(Integer emId);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(EvaluationModel record);

    /**
     * 根据id查询
     * @param emId
     * @return
     */
    EvaluationModel selectByPrimaryKey(Integer emId);

    /**
     * 对字段进行判断再更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(EvaluationModel record);

    /**
     * 根据id 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(EvaluationModel record);
}