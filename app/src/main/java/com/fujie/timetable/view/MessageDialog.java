package com.fujie.timetable.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.fujie.timetable.R;


public class MessageDialog extends Dialog {

    TextView tvContent;
    TextView btnCancel;
    TextView btnSure;

    public MessageDialog(Context context) {
        super(context, R.style.dialog_add_course);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_message);
        initViews();
        setCanceledOnTouchOutside(false);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    private void initViews() {
        tvContent = findViewById(R.id.tv_content);
        btnCancel = findViewById(R.id.btn_cancel);
        btnSure = findViewById(R.id.btn_sure);

    }

    public void setContent(String content) {
        tvContent.setText(content);
    }

    public void setBtnSure(String str, View.OnClickListener listener) {
        btnSure.setText(str);
        btnSure.setOnClickListener(listener);
    }

    public void setBtnCancel(String str, View.OnClickListener listener) {
        btnCancel.setText(str);
        btnCancel.setOnClickListener(listener);
    }

}
