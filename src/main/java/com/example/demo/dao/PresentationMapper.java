package com.example.demo.dao;


import com.example.demo.po.Presentation;

public interface PresentationMapper {

    int deleteByPrimaryKey(Long preId);

    int insert(Presentation record);

    int insertSelective(Presentation record);

    Presentation selectByPrimaryKey(Long preId);

    int updateByPrimaryKeySelective(Presentation record);

    int updateByPrimaryKey(Presentation record);
}