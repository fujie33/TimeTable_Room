package com.fujie.timetable.db.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

/**
 * Entity 标注实体类
 * PrimaryKey autoGenerate = true 主键
 * ColumnInfo 列名
 */
@Entity
public class Course {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "course_name")
    private String courseName;
    @ColumnInfo(name = "teacher")
    private String teacher;
    @ColumnInfo(name = "class_room")
    private String classRoom;
    @ColumnInfo(name = "day")
    private int day;
    @ColumnInfo(name = "start")
    private int start;
    @ColumnInfo(name = "end")
    private int end;

    public Course(String courseName, String teacher, String classRoom, int day, int start, int end) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.day = day;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
