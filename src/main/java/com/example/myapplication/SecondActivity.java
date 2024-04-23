package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewFio, textViewGroup, textViewAge, textViewGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewFio = findViewById(R.id.textViewFio);
        textViewGroup = findViewById(R.id.textViewGroup);
        textViewAge = findViewById(R.id.textViewAge);
        textViewGrade = findViewById(R.id.textViewGrade);

        // Получение данных из Intent
        Intent intent = getIntent();
        String fio = intent.getStringExtra("fio");
        String group = intent.getStringExtra("group");
        String age = intent.getStringExtra("age");
        String grade = intent.getStringExtra("grade");

        // Отображение полученных данных
        textViewFio.setText("ФИО: " + fio);
        textViewGroup.setText("Группа: " + group);
        textViewAge.setText("Возраст: " + age);
        textViewGrade.setText("Оценка: " + grade);
    }
}