package com.example.intent_practice3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginResult extends AppCompatActivity {

    TextView id_rslt;
    TextView pw_rslt;
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);
        setContentView(R.layout.login_result);
        Intent intent = getIntent();
        String rcv_ID = intent.getExtras().getString("ID");
        String rcv_PW = intent.getExtras().getString("PW");
        id_rslt.setText(rcv_ID);
        pw_rslt.setText(rcv_PW);
    }
}
