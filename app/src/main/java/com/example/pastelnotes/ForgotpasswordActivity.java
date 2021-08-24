package com.example.pastelnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotpasswordActivity extends AppCompatActivity {

    private EditText mforgotemail;
    private AppCompatButton mforgotbtn;
    private TextView mgotologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        getSupportActionBar().hide();

        mforgotemail=findViewById(R.id.forgotemail);
        mforgotbtn=findViewById(R.id.forgot_btn);
        mgotologin=findViewById(R.id.gotologin);

        mgotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ForgotpasswordActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        mforgotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= mforgotemail.getText().toString().trim();
                if (email.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                }
                else {
                    // TODO: SEND  VERIFICATION EMAIL.
                }
            }
        });

    }
}