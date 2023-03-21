package com.mmm.hotel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity13 extends AppCompatActivity {

  TextView txtcon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        txtcon = findViewById(R.id.txtcon);

        txtcon.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity13.this);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
                dialog.setContentView(R.layout.custom);

                TextView txtverify = dialog.findViewById(R.id.txtverify);
                ImageView imgwin = dialog.findViewById(R.id.imgwin);

                Glide.with(MainActivity13.this).load(R.drawable.right).into(imgwin);

                txtverify.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();

                        Intent intent = new Intent(MainActivity13.this,MainActivity14.class);
                        startActivity(intent);

                    }
                });

                dialog.show();

            }
        });


    }
}