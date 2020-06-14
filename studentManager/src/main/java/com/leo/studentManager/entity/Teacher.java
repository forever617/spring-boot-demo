package com.leo.studentManager.entity;

import java.util.Date;

public class Teacher {
    private Integer id;

    private String teacherName;

    private String desc;

    private Integer subjectId;

    private String subSubjects;

    private Integer positionId;

    private Integer schoolId;

    private Integer sex;

    private Integer age;

    private Date startTeach;

    private Integer isRetire;

    private String classId;

    private String headImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubSubjects() {
        return subSubjects;
    }

    public void setSubSubjects(String subSubjects) {
        this.subSubjects = subSubjects == null ? null : subSubjects.trim();
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getStartTeach() {
        return startTeach;
    }

    public void setStartTeach(Date startTeach) {
        this.startTeach = startTeach;
    }

    public Integer getIsRetire() {
        return isRetire;
    }

    public void setIsRetire(Integer isRetire) {
        this.isRetire = isRetire;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }
}