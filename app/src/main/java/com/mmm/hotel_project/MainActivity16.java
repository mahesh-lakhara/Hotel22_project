package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity16 extends AppCompatActivity {

    ImageView img34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        img34 = findViewById(R.id.img34);

        img34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity16.this,MainActivity17.class);
                startActivity(intent);
            }
        });
    }
}