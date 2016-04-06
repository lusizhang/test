package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.*;
import java.util.Date;
/**
 * Student实体
 * Created by chant on 2016/3/23.
 */

@Table(name = "t_student")
@Entity
public class Student extends AbstractEntity {
    @Id
    private Integer id;

    @Column(name = "student_num")
    private Integer studentNumber;

    @Column(name = "name")
    private String studentName;

    @Column(name = "sex")
    private Byte sex;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "class_num")
    private Integer classNumber;

    @Column(name = "college")
    @Enumerated(EnumType.STRING)
    private Integer college;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "is_good_student")
    private Boolean isGoodStudent;

    @Column(name="password")
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Byte  getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getIsGoodStudent() {
        return isGoodStudent;
    }

    public void setIsGoodStudent(Boolean isGoodStudent) {
        this.isGoodStudent = isGoodStudent;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}