package com.example.demo.dao;

import com.example.demo.po.presentationT;
import com.example.demo.po.presentationTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface presentationTMapper {
    int countByExample(presentationTExample example);

    int deleteByExample(presentationTExample example);

    int deleteByPrimaryKey(Long preId);

    int insert(presentationT record);

    int insertSelective(presentationT record);

    List<presentationT> selectByExample(presentationTExample example);

    presentationT selectByPrimaryKey(Long preId);

    int updateByExampleSelective(@Param("record") presentationT record, @Param("example") presentationTExample example);

    int updateByExample(@Param("record") presentationT record, @Param("example") presentationTExample example);

    int updateByPrimaryKeySelective(presentationT record);

    int updateByPrimaryKey(presentationT record);
}