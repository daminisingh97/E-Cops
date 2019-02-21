package com.example.hp.e_cops;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PhoneActivity extends AppCompatActivity {
ImageView gotohome;
private EditText editTextMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        gotohome=(ImageView)findViewById(R.id.thirdback);
        editTextMobile=findViewById(R.id.et_phone_number);
        gotohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhoneActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        findViewById(R.id.btn_generate_otp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobile=editTextMobile.getText().toString().trim();
                if(mobile.isEmpty() || mobile.length() < 10){
                    editTextMobile.setError("Enter a valid mobile");
                    editTextMobile.requestFocus();
                    return;
                }
                Intent i = new Intent(PhoneActivity.this,VerifyPhoneActivity.class);
                i.putExtra("mobile",mobile);
                startActivity(i);
            }
        });
    }
}
