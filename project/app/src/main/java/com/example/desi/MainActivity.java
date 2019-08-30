package com.example.desi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick03(View view){
        Intent intent3 = new Intent(this, WeatherActivity.class);
        startActivity(intent3);
    }
    public void onClick04(View view){
        Intent intent4 = new Intent(this, SettingActivity.class);
        startActivity(intent4);
    }
}


