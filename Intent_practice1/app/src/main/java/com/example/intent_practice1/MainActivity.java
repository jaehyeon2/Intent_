package com.example.intent_practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start_btn;
    Button first_btn;
    Button second_btn;
    Button third_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_btn = findViewById(R.id.start);
        first_btn = findViewById(R.id.first);
        second_btn = findViewById(R.id.second);
        third_btn = findViewById(R.id.third);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, First_activity.class);
                startActivity(intent);
            }
        });


    }
}
