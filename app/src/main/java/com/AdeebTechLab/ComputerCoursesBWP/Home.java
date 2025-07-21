package com.AdeebTechLab.ComputerCoursesBWP;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {


    Button wp ;
    ImageButton info, all_COURSES, certificaate,sociaaaal_profile_bt,withdraw_bt,  instructor,change_paaaaswwword_bt, reveos, student_bt, profile_bt, enrolled_bt, quiz_bt, edit_perofile_bt ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        //------------Button----------------------------------------
        wp = findViewById(R.id.wp);
        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.whatsapp.com/channel/0029VaC5PtjEgGfEQtQZUh1p";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        //------------Button------------------------------------

        info = findViewById(R.id.infoo_bt);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button---------------------------------------------
        all_COURSES = findViewById(R.id.all_COURSES_bt);
        all_COURSES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://computercourses.rf.gd/course-category/graphic-design/?keyword=&course_order=course_title_az&course_filter=true&loop_content_only=false&column_per_row=3&course_per_page=12&show_pagination=false&current_page=1&action=tutor_course_filter_ajax";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button------------------------------------

        certificaate = findViewById(R.id.certificate_bt);
        certificaate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://computercoursesbwp.blogspot.com/p/student-verification.html";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button------------------------------------

        instructor = findViewById(R.id.instructor_bt);
        instructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        //------------Button------------------------------------

        reveos = findViewById(R.id.reveos_bt);
        reveos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/place/The+Computer+Courses+Bahawalpur/@29.3779462,71.6968447,17z/data=!4m21!1m14!4m13!1m5!1m1!1s0x393b91fb7b3faf95:0xfa9381c28749111a!2m2!1d71.6994196!2d29.3779416!1m6!1m2!1s0x393b91fb7b3faf95:0xfa9381c28749111a!2sGreen+Town+Rd,+Green+Town,+Bahawalpur,+63100,+Pakistan!2m2!1d71.6994196!2d29.3779416!3m5!1s0x393b91fb7b3faf95:0xfa9381c28749111a!8m2!3d29.3779416!4d71.6994196!16s%2Fg%2F11sv1xs66l?entry=ttu&g_ep=EgoyMDI1MDcxNi4wIKXMDSoASAFQAw%3D%3D";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //------------Button------------------------------------

        student_bt = findViewById(R.id.student_bt);
        student_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //------------Button------------------------------------

        profile_bt = findViewById(R.id.profile_bt);
        profile_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //------------Button------------------------------------

        enrolled_bt = findViewById(R.id.enrolled_bt);
        enrolled_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //------------Button------------------------------------

        quiz_bt = findViewById(R.id.quiz_bt);
        quiz_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //------------Button------------------------------------

        edit_perofile_bt = findViewById(R.id.edit_perofile_bt);
        edit_perofile_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button------------------------------------

        change_paaaaswwword_bt = findViewById(R.id.change_paaaaswwword_bt);
        change_paaaaswwword_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button------------------------------------

        sociaaaal_profile_bt = findViewById(R.id.sociaaaal_profile_bt);
        sociaaaal_profile_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //------------Button------------------------------------

        withdraw_bt = findViewById(R.id.withdraw_bt);
        withdraw_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://pcskils.blogspot.com/";
                Intent i = new Intent(Home.this, Websit.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


    }
}