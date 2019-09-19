package com.zxy.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent();
        //包名，全类名。均为String型。只要是String型的类名，都要写成全类名。
        intent.setClassName("com.netease.nim.demo","com.netease.nim.demo.main.activity.AboutActivity");
        startActivity(intent);
    }
}
