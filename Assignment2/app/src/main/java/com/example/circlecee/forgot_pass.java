package com.example.circlecee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class forgot_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        Button but=(Button) findViewById(R.id.reset);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset password to 1234
                EditText e= (EditText)findViewById(R.id.forgot_email);
                if(!android.util.Patterns.EMAIL_ADDRESS.matcher(e.getText().toString()).matches()){
                    Toast.makeText(getApplicationContext(),"Enter Valid Email address",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Your Password has reset to 1234!", Toast.LENGTH_LONG).show();
                }
            }
        });
        TextView b=(TextView) findViewById(R.id.back_log);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i=new Intent(getApplicationContext(),MainActivity.class);
                //startActivity(i);
                finish();
            }
        });
    }
}
