package com.leo.studentManager.dao;

import com.leo.studentManager.entity.County;
import java.util.List;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(County record);

    County selectByPrimaryKey(Integer id);

    List<County> selectAll();

    int updateByPrimaryKey(County record);
}