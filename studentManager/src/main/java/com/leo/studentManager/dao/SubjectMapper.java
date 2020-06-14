package com.leo.studentManager.dao;

import com.leo.studentManager.entity.Subject;
import java.util.List;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subject record);

    Subject selectByPrimaryKey(Integer id);

    List<Subject> selectAll();

    int updateByPrimaryKey(Subject record);
}