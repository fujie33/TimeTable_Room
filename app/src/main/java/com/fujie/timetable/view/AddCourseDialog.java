package com.fujie.timetable.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fujie.timetable.R;


public class AddCourseDialog extends Dialog {

    EditText edCourseName;
    EditText edWeek;
    EditText edCourseBegin;
    EditText edCourseEnds;
    EditText edTeacherName;
    EditText edCourseRoom;
    Button btnCancel;
    Button btnOk;
    LinearLayout layoutCourseName;
    LinearLayout layoutWeek;
    LinearLayout layoutCourseStart;
    LinearLayout layoutEnd;
    LinearLayout layoutTeacher;
    LinearLayout layoutRoom;
    TextView tvTitle;

    public AddCourseDialog(Context context) {
        super(context, R.style.dialog_add_course);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_add_course);
        initViews();
        // 将对话框的大小按屏幕大小的百分比设置
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        final WindowManager.LayoutParams p = getWindow().getAttributes();
        p.height = (int) (d.getHeight() * 0.7);
        p.width = (int) (d.getWidth() * 0.7);
        getWindow().setAttributes(p);
        setCanceledOnTouchOutside(false);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    private void initViews() {
        edCourseName = findViewById(R.id.ed_course_name);
        edWeek = findViewById(R.id.ed_week);
        edCourseBegin = findViewById(R.id.ed_course_begin);
        edCourseEnds = findViewById(R.id.ed_course_ends);
        edTeacherName = findViewById(R.id.ed_teacher_name);
        edCourseRoom = findViewById(R.id.ed_course_room);
        btnCancel = findViewById(R.id.btn_cancel);
        btnOk = findViewById(R.id.btn_ok);
        layoutCourseName = findViewById(R.id.layout_course_name);
        layoutWeek = findViewById(R.id.layout_week);
        layoutCourseStart = findViewById(R.id.layout_course_start);
        layoutEnd = findViewById(R.id.layout_end);
        layoutTeacher = findViewById(R.id.layout_teacher);
        layoutRoom = findViewById(R.id.layout_room);
        tvTitle = findViewById(R.id.tv_title);
    }

    public void setTvTitle(String title) {
        this.tvTitle.setText(title);
    }

    public void setBtnSure(View.OnClickListener listener) {
        btnOk.setOnClickListener(listener);
    }

    public void setBtnCancel(View.OnClickListener listener) {
        btnCancel.setOnClickListener(listener);
    }

    public EditText getEdCourseName() {
        return edCourseName;
    }

    public EditText getEdWeek() {
        return edWeek;
    }

    public EditText getEdCourseBegin() {
        return edCourseBegin;
    }

    public EditText getEdCourseEnds() {
        return edCourseEnds;
    }

    public EditText getEdTeacherName() {
        return edTeacherName;
    }

    public EditText getEdCourseRoom() {
        return edCourseRoom;
    }

    public LinearLayout getLayoutCourseName() {
        return layoutCourseName;
    }

    public LinearLayout getLayoutWeek() {
        return layoutWeek;
    }

    public LinearLayout getLayoutCourseStart() {
        return layoutCourseStart;
    }

    public LinearLayout getLayoutEnd() {
        return layoutEnd;
    }

    public LinearLayout getLayoutTeacher() {
        return layoutTeacher;
    }

    public LinearLayout getLayoutRoom() {
        return layoutRoom;
    }


}
