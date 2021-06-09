package com.fujie.timetable.db;

import android.content.Context;
import android.os.AsyncTask;

import com.fujie.timetable.db.room.TimeTableDatabase;
import com.fujie.timetable.db.room.dao.TimeTableDao;
import com.fujie.timetable.db.room.model.Course;

import java.util.List;

/**
 * 1、Room数据库的增删改查不可以在主线程中进行操作
 * 2、CURD操作继承AsyncTask类
 * 3、重写doInBackground方法
 * 4、执行异步操作。
 */
public class Repo {
    TimeTableDao timeTableDao;
    public List<Course> allCourse;

    public Repo(Context context) {
        TimeTableDatabase database = TimeTableDatabase.getDatabase(context.getApplicationContext());
        timeTableDao = database.getDao();
//        allCourse = timeTableDao.queryCourse();
    }

    //执行execute方法可以进行异步操作，好处：不会阻塞主线程
    public void InsertCourse(Course... courses) {
        new InsertCourseAsyncTask(timeTableDao).execute(courses);
    }

    static class InsertCourseAsyncTask extends AsyncTask<Course, Void, Void> {
        private TimeTableDao timeTableDao;

        public InsertCourseAsyncTask(TimeTableDao dao) {
            this.timeTableDao = dao;
        }

        //自定义线程操作
        @Override
        protected Void doInBackground(Course... course) {
            timeTableDao.insertCourse(course);
            return null;
        }
    }
}
