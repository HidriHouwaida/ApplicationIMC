package com.example.imc;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Calendrier extends AppCompatActivity {
    Button bt;
    DatePicker datePicker;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier);
        datePicker=findViewById(R.id.calendrier);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(v -> datePicker.setOnDateChangedListener((view, year, monthOfYear, dayOfMonth) -> {
            String date=dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
            Intent intent=new Intent(getApplicationContext(),SignUp.class);
            intent.putExtra("date",date);
            startActivity(intent);
        }));
    }
}