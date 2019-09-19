package com.zxy.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent=new Intent();
//        intent.setClassName("com.netease.nim.demo","com.netease.nim.demo.main.activity.WelcomeActivity");
//        startActivity(intent);

//        Intent intent = new Intent();
//        ComponentName comp = new ComponentName("com.netease.nim.uikit","com.netease.nim.uikit.business.contact.selector.activity.ContactSelectActivity");
//        intent.setComponent(comp);
//        startActivity(intent);

        //参数：目标Activity的action的name值，String类型
//        Intent intent = new Intent("test" );
//         startActivity(intent);

        ARouter.init(getApplication());

        ARouter.getInstance().build("/zxy/welcom").navigation();

    }
}
