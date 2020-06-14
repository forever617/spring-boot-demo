package com.leo.studentManager.dao;

import com.leo.studentManager.entity.Exam;
import java.util.List;

public interface ExamMapper {
    int insert(Exam record);

    List<Exam> selectAll();
}