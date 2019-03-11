package com.example.hp.e_cops;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t = new Thread() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3500);
                }
                catch (Exception e)
                {}
                finish();
                Intent i =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        };
        t.start();
            }
        }
//test comment