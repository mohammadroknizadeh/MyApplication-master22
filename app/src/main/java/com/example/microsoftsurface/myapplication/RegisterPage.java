package com.example.microsoftsurface.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        getSupportActionBar().hide();

        Button sign1=(Button)findViewById(R.id.signn1);

        sign1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                EditText firstname = (EditText) findViewById(R.id.Firstname);
                String strfname = firstname.getText().toString();

                 EditText lastname = (EditText) findViewById(R.id.Lastname);
                String strlname = lastname.getText().toString();

                 EditText lstemail = (EditText) findViewById(R.id.Email);
                String stremail = lstemail.getText().toString();

                 EditText lstpass = (EditText) findViewById(R.id.Password);
                String strpass = lstpass.getText().toString();

                EditText age = (EditText) findViewById(R.id.Age);
                String intage = age.getText().toString();

                if (strfname.trim().equals("") || strlname.trim().equals("") || stremail.trim().equals("") || strpass.trim().equals("") ||
                       Integer.parseInt(intage.toString())>100 || Integer.parseInt(intage.toString())<5 || intage.trim().equals(""))
                {
                    Toast.makeText(RegisterPage.this, R.string.Error, Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(RegisterPage.this, MainActivity.class);
                    intent.putExtra("Firstname",strfname);
                    intent.putExtra("Lastname",strlname);
                    intent.putExtra("Email",stremail);
                    intent.putExtra("Password",strpass);
                    intent.putExtra("Age",intage);
                    Toast.makeText(RegisterPage.this,R.string.Active, Toast.LENGTH_LONG).show();
                    startActivity(intent);
                    finish();
                }

            }
        });


    }


}
//EditText email= (EditText) findViewById(R.id.Email);
//EditText password= (EditText) findViewById(R.id.Password);
//final String stremail=email.getText().toString();
//final String strpassword=password.getText().toString();
//&&!strlname.trim().equals("")&&!stremail.trim().equals("")&&!strpassword.trim().equals("")&&