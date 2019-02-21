package com.example.hp.e_cops;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
EditText ph;
TextView so;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ph=(EditText)findViewById(R.id.editTextPhone);
        so=(TextView)findViewById(R.id.social);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,PhoneActivity.class);
                startActivity(i);
            }
        });
       so.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(MainActivity2.this,SocialActivity.class);
               startActivity(i);
           }
       });


    }
}
