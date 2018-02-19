package com.example.macbook.sqllitelesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView email;
    private TextView login2;
    private TextView password2;
    private Button register2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = findViewById(R.id.email);
        login2 = findViewById(R.id.login2);
        password2 = findViewById(R.id.paswword2);
        register2 = findViewById(R.id.register2);

    }
}
