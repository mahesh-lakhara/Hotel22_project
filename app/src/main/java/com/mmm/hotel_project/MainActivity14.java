package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {
    TextView txtcon;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        txtcon = findViewById(R.id.txtcon2);
        txtcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity14.this,MainActivity15.class);
                startActivity(intent);
            }
        });
    }
}