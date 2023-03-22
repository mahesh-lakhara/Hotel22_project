package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
    TextView txtdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        txtdo = findViewById(R.id.txtdo);

        txtdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity17.this,MainActivity18.class);
                startActivity(intent);
            }
        });
    }
}