package com.example.macbook.sqllitelesson;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText password;
    private Button submit;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.paswword);
        submit = findViewById(R.id.submit);
        register = findViewById(R.id.register);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//
//                SharedPreferences sharedPreferences = getSharedPreferences("File", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("key1", login.getText().toString());
//                editor.putString("key2", password.getText().toString());
//                editor.commit();

                if (!login.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(intent);
                }




            }
        });



    }
}
