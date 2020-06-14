package com.leo.studentManager.service;

import com.leo.studentManager.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
}
