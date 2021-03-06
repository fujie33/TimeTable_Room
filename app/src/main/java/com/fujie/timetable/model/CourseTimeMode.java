package com.fujie.timetable.model;

import java.io.Serializable;


public class CourseTimeMode implements Serializable {

    private int index;
    private String startTime;
    private String endTime;

    public CourseTimeMode(int index, String start, String end){
        this.index = index;
        this.startTime = start;
        this.endTime = end;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}
