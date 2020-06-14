package com.leo.studentManager.controller;

import com.leo.studentManager.entity.Student;
import com.leo.studentManager.service.StudentService;
import com.leo.studentManager.utils.UploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public List<Student> getStudentsList() {
        return studentService.getStudents();
    }

    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public void initStudentByCsv(@RequestParam("file") MultipartFile file) {
        UploadUtil.uploadCsv(file);
    }
}
