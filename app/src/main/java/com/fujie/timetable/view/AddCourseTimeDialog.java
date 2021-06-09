package com.fujie.timetable.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.fujie.timetable.R;


public class AddCourseTimeDialog extends Dialog {

    Button btnCancel;
    Button btnOk;
    EditText edStartTime;
    EditText edEndTime;

    public AddCourseTimeDialog(Context context) {
        super(context, R.style.dialog_add_course);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_add_course_time);
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
        btnCancel = findViewById(R.id.btn_cancel);
        btnOk = findViewById(R.id.btn_ok);
        edStartTime = findViewById(R.id.ed_start_time);
        edEndTime = findViewById(R.id.ed_end_time);
    }

    public void setBtnSure(View.OnClickListener listener) {
        btnOk.setOnClickListener(listener);
    }

    public void setBtnCancel(View.OnClickListener listener) {
        btnCancel.setOnClickListener(listener);
    }

    public void setEdStartTime(String str) {
        edStartTime.setText(str);
    }

    public EditText getEdStartTime() {
        return edStartTime;
    }

    public void setEdEndTime(String str) {
        edEndTime.setText(str);
    }

    public EditText getEdEndTime() {
        return edEndTime;
    }
}
