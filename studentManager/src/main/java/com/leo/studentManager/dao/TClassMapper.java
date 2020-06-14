package com.leo.studentManager.dao;

import com.leo.studentManager.entity.TClass;
import java.util.List;

public interface TClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TClass record);

    TClass selectByPrimaryKey(Integer id);

    List<TClass> selectAll();

    int updateByPrimaryKey(TClass record);
}