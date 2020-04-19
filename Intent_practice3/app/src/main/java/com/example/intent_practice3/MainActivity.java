package com.example.intent_practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button login_btn;
    Button signup_btn;
    EditText ID;
    EditText PW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn = findViewById(R.id.login);
        signup_btn = findViewById(R.id.signup);
        ID = findViewById(R.id.Id);
        PW = findViewById(R.id.Password);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginResult.class);
                intent.putExtra("ID", ID.getText().toString());
                intent.putExtra("PW", PW.getText().toString());
                startActivity(intent);
            }
        });
    }
}
