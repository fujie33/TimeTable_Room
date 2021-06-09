package com.fujie.timetable.db.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.fujie.timetable.db.room.model.Course;
import com.fujie.timetable.db.room.model.CourseTime;

import java.util.List;

/**
 * Dao层用Dao标注
 *
 * @Insert
 */
@Dao
public interface TimeTableDao {
    //Course... 可以插入多个Course对象
    @Insert
    void insertCourse(Course... course);

    @Delete
    int deleteCourse(Course course);

    @Query("select * from course")
    List<Course> queryCourse();

    @Query("select * from coursetime")
    List<CourseTime> queryCourseTime();
}
