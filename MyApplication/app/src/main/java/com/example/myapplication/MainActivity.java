package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button dirButton, techButton, stdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dirButton = findViewById(R.id.directorLogin);
        techButton = findViewById(R.id.teacherLogin);
        stdButton = findViewById(R.id.studentLogin);

        dirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DirectorLoginDialog();
            }
        });
        techButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TeacherLoginDialog();
            }
        });
        stdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentLoginDialog();
            }
        });
    }







    private void DirectorLoginDialog() {
        final Dialog myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.activity_director_login_dialog);
        myDialog.setCancelable(false);
        myDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Button login = myDialog.findViewById(R.id.directorLoginBtn);
        Button back = myDialog.findViewById(R.id.directorBackBtn);


        final EditText password = myDialog.findViewById(R.id.DirPassword);
        myDialog.show();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent intentDir = new Intent(MainActivity.this,DirectorMain.class);
                    startActivity(intentDir);
                }
                else {Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();}

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
    }



    private void TeacherLoginDialog() {
        final Dialog myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.activity_teacher_login_dialog);
        myDialog.setCancelable(false);
        myDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Button login = myDialog.findViewById(R.id.teacherLoginBtn);
        Button back = myDialog.findViewById(R.id.teacherBackBtn);


        final EditText password = myDialog.findViewById(R.id.techPassword);
        myDialog.show();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent intentDir = new Intent(MainActivity.this,TeacherMain.class);
                    startActivity(intentDir);
                }
                else {Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();}

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
    }


    private void StudentLoginDialog() {
        final Dialog myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.activity_student_login_dialog);
        myDialog.setCancelable(false);
        myDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Button login = myDialog.findViewById(R.id.studentLoginBtn);
        Button back = myDialog.findViewById(R.id.studentBackBtn);


        final EditText password = myDialog.findViewById(R.id.stdPassword);
        myDialog.show();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent intentDir = new Intent(MainActivity.this,TeacherMain.class);
                    startActivity(intentDir);
                }
                else {Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();}

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
    }
}
