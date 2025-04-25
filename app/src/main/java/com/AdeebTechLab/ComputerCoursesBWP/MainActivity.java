package com.AdeebTechLab.ComputerCoursesBWP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button already_Login, login, Create_Account;



        //------------Button----------------------------------------
        already_Login = findViewById(R.id.already_Login);
        already_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);

            }
        });


        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://computercourses.rf.gd/my-account/";
                Intent i = new Intent(MainActivity.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        Create_Account = findViewById(R.id.Create_Account);
        Create_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://computercourses.rf.gd/student-registration/";
                Intent i = new Intent(MainActivity.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


    }
}