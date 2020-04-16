package com.example.intent_practice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class First_activity extends AppCompatActivity {

    Button first_btn;
    Button second_btn;
    Button third_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        first_btn = findViewById(R.id.first);
        second_btn = findViewById(R.id.second);
        third_btn = findViewById(R.id.third);

        first_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "현재 화면 입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        second_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_activity.this, Second_activity.class);
                startActivity(intent);
                finish();
            }
        });

        third_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_activity.this, Third_activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
