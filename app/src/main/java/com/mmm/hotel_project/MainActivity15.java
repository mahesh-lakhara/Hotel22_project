package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {

    TextView txtbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        txtbtn2 = findViewById(R.id.txtbtn2);

        txtbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity15.this,MainActivity16.class);
                startActivity(intent);
            }
        });


    }
}