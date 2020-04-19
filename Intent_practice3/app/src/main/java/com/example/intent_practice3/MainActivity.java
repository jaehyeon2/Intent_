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
    EditText ID_;
    EditText PW_;
    String ID;
    String PW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn = findViewById(R.id.login);
        signup_btn = findViewById(R.id.signup);
        ID_ = findViewById(R.id.Id);
        PW_ = findViewById(R.id.Password);

        ID = ID_.getText().toString();
        PW = PW_.getText().toString();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginResult.class);
                intent.putExtra("ID", ID);
                intent.putExtra("PW", PW);
                startActivity(intent);
            }
        });
    }
}
