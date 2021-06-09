package com.fujie.timetable.db.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.fujie.timetable.db.room.dao.TimeTableDao;
import com.fujie.timetable.db.room.model.Course;
import com.fujie.timetable.db.room.model.CourseTime;

/**
 * 1、继承RoomDatabase
 * 2、更改为抽象类
 * 3、单例模式，好处：线程安全、全局仅存在一个实例
 * 4、注解（实体类、版本、默认false）
 * 5、数据库升级addMigrations()
 */
@Database(entities = {Course.class, CourseTime.class}, version = 1, exportSchema = false)
public abstract class TimeTableDatabase extends RoomDatabase {
    private static TimeTableDatabase INSTANCE;

    //单例模式，线程安全
    public static synchronized TimeTableDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            //执行databaseBuilder（application对象,当前类对象,数据库名称）
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    TimeTableDatabase.class,
                    "time_table_database")
                    .build();
        }
        return INSTANCE;
    }

    public abstract TimeTableDao getDao();
}
