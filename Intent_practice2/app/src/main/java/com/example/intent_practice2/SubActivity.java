package com.example.intent_practice2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    TextView rcv_word;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        rcv_word = findViewById(R.id.word_rcv);
        Intent intent = getIntent();
        String word = intent.getExtras().getString("word");
        rcv_word.setText(word);

    }
}
