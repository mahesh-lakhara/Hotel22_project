package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {
    TextView txtverify;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        txtverify = findViewById(R.id.txtverify);


        txtverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,MainActivity13.class);
                startActivity(intent);
            }
        });



    }
}