package com.leo.studentManager.service.impl;

import com.leo.studentManager.dao.StudentMapper;
import com.leo.studentManager.entity.Student;
import com.leo.studentManager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudents() {
        return studentMapper.selectAll();
    }
}
