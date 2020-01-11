package com.example.greendaoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student student=new Student();
                student.setName("jerry");
                student.setAddress("mox");
                DaoManager.getInstance(MainActivity.this).getDaoSession().getStudentDao().insertOrReplace(student);
            }
        });
    }
}
