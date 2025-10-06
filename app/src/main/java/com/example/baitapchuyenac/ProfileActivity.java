package com.example.baitapchuyenac;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private ImageButton imgbtnsetting;
    @Override
    public  void onCreate(Bundle saveIntancseState){
        super.onCreate(saveIntancseState);
        setContentView(R.layout.activity_profile);
        imgbtnsetting=findViewById(R.id.imgbtn_setting);
        imgbtnsetting.setOnClickListener(view ->{
            Intent myintent= new Intent(ProfileActivity.this,MainActivity.class);
            startActivity(myintent);
        });
    }
}
