package com.example.microsoftsurface.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Intent get=getIntent();
        final String strFname=get.getStringExtra("Firstname");
        final String strLname=get.getStringExtra("Lastname");
        final String strEmail=get.getStringExtra("Email");
        final String strPassword=get.getStringExtra("Password");
        final String age1=get.getStringExtra("Age");
        final int age=Integer.parseInt(get.getStringExtra("Age"));


        Button signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterPage.class);
                startActivity(intent);
                finish();
            }

        });

        Toast.makeText(MainActivity.this,strFname + strLname.toString() + strEmail.toString()+age1.toString() +strPassword.toString(),Toast.LENGTH_LONG).show();


        Button signin=(Button)findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText email= (EditText) findViewById(R.id.Email1);
                String stremail=email.getText().toString();
                EditText password= (EditText) findViewById(R.id.Password1);
                String strpassword=password.getText().toString();

                if(stremail.trim().equals("") || !stremail.equals(strEmail) || strpassword.trim().equals("")||
                         (Integer.parseInt(strpassword.toString()))!=(Integer.parseInt(strPassword.toString())))
                {
                    Toast.makeText(MainActivity.this,R.string.Error1, Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(MainActivity.this,R.string.Successful, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, WellcomePage.class);
                    intent.putExtra("Firstname",strFname);
                    intent.putExtra("Lastname",strLname);
                    intent.putExtra("Email",strEmail);
                    intent.putExtra("Age",age1);
                    startActivity(intent);
                    finish();
                }
                
            }
        });
    }
}
