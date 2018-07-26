package com.example.demo.dao;

import com.example.demo.po.Presentation;

/**
 * 报告Mapper
 */
public interface PresentationMapper {
    /**
     * 根据报告ID删除
     * @param preId
     * @return
     */
    int deleteByPrimaryKey(Long preId);

    /**
     *添加报告
     * @param record
     * @return
     */
    int insert(Presentation record);

    /**
     *选择性保存数据
     * @param record
     * @return
     */
    int insertSelective(Presentation record);

    /**
     * 根据报告ID查询
     * @param preId
     * @return
     */
    Presentation selectByPrimaryKey(Long preId);

    /**
     *对字段进行判断再更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Presentation record);

    /**
     * 根据报告id修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Presentation record);
}