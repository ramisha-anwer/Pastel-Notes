 package com.example.pastelnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

 public class SignupActivity extends AppCompatActivity {

    private EditText msignupemail,msignuppassword;
    private RelativeLayout msignup_btn;
    private TextView mgotologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        msignupemail=findViewById(R.id.signupEmail);
        msignuppassword=findViewById(R.id.signupPassword);
        msignup_btn=findViewById(R.id.signup_btn);
        mgotologin=findViewById(R.id.gobacktologin);



        mgotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        msignup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= msignupemail.getText().toString().trim();
                String password= msignuppassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty() ){
                    Toast.makeText(getApplicationContext(), "All Fields Are Required", Toast.LENGTH_SHORT).show();
                }
                else if (password.length()<7){
                    Toast.makeText(getApplicationContext(), "Password should contain more than 7 characters", Toast.LENGTH_SHORT).show();
                }

                else {
                    //TODO SIGNUP
                }
            }
        });
    }


}