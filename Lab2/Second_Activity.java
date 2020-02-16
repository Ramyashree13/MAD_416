package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2,t3;
    String name,usn,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.textView11);
        t2=(TextView)findViewById(R.id.textView12);
        t3=(TextView)findViewById(R.id.textView13);

        Intent i=getIntent();

        name=i.getStringExtra("name_key");
        usn=i.getStringExtra("usn_key");
        dept=i.getStringExtra("dept_key");

        t1.setText(name);
        t2.setText(usn);
        t3.setText(dept);

    }
}
