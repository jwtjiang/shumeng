package com.example.demo.dao;

import com.example.demo.po.comment;
import com.example.demo.po.commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface commentMapper {
    int countByExample(commentExample example);

    int deleteByExample(commentExample example);

    int deleteByPrimaryKey(Long commentid);

    int insert(comment record);

    int insertSelective(comment record);

    List<comment> selectByExample(commentExample example);

    comment selectByPrimaryKey(Long commentid);

    int updateByExampleSelective(@Param("record") comment record, @Param("example") commentExample example);

    int updateByExample(@Param("record") comment record, @Param("example") commentExample example);

    int updateByPrimaryKeySelective(comment record);

    int updateByPrimaryKey(comment record);
}