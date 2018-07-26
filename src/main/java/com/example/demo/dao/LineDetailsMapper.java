package com.example.demo.dao;


import com.example.demo.po.LineDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 线路Mapper
 */

public interface LineDetailsMapper {
    /**
     * 根据线路id 删除
     * @param lineId
     * @return
     */
    int deleteByPrimaryKey(String lineId);

    /**
     * 添加线路
     * @param record
     * @return
     */
    int insert(LineDetails record);

    /**
     *选择性保存数据
     * @param record
     * @return
     */
    int insertSelective(LineDetails record);

    /**
     *根据线路id查询
     * @param lineId
     * @return
     */
    LineDetails selectByPrimaryKey(String lineId);

    /**
     *根据线路ID 判断再更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(LineDetails record);

    /**
     * 根据线路id修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(LineDetails record);
}