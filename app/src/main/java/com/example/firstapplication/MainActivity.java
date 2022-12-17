package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.editTextTextEmailAddress);
        TextView password = (TextView) findViewById(R.id.editTextTextPassword);
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("deDeveloper") && password.getText().toString().equals("123321"))
                {
                    Toast.makeText(MainActivity.this, "Log In Successfull", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "Invalid Arguments", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                }

            }
        });
    }
}