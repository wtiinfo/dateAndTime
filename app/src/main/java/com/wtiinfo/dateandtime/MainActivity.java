package com.wtiinfo.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDate(View view) {
        new DatePicker().show(getSupportFragmentManager(), "DatePicker");
    }

    public void openTime(View view) {
        new TimePicker().show(getSupportFragmentManager(), "TimePicker");
    }
}