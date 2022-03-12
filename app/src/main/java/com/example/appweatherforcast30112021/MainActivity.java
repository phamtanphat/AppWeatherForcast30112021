package com.example.appweatherforcast30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.appweatherforcast30112021.databinding.ActivityMainBinding;
import com.example.appweatherforcast30112021.model.Xehoi;
import com.example.appweatherforcast30112021.model.Xemay;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Xemay xemay;

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());



       mBinding.btnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
           }
       });

//        Log.d("BBB","Main "  + xehoi.toString());
    }
}