package com.example.microsoftsurface.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WellcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome_page);
        getSupportActionBar().hide();

        Intent get=getIntent();
        final String strFname=get.getStringExtra("Firstname");
        final String strLname=get.getStringExtra("Lastname");
        final String strEmail=get.getStringExtra("Email");
        final String strAge=get.getStringExtra("Age");

        //Toast.makeText(this,strFname.toString()+ strLname.toString() + strEmail.toString()+String.valueOf(strAge),Toast.LENGTH_SHORT).show();

        TextView Name= (TextView) findViewById(R.id.Yname);
        TextView Email= (TextView) findViewById(R.id.Yemail);
        TextView Age= (TextView) findViewById(R.id.Yage);

        Name.setText(strFname.toString()+" "+strLname.toString());
        Email.setText(strEmail.toString());
        Age.setText(strAge.toString());

    }

}
