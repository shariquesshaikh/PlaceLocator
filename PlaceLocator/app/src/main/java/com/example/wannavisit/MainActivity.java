package com.example.wannavisit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Button mGateway, mMarine, mNehru, mPark, mClink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Main Content
        mGateway = findViewById(R.id.gateway_h);
        mMarine = findViewById(R.id.marine_h);
        mNehru = findViewById(R.id.nehru_h);
        mPark = findViewById(R.id.sanjay_h);
        mClink = findViewById(R.id.sealink_h);

        mGateway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), gateway.class));
            }
        });

        mMarine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), marine.class));
            }
        });

        mNehru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), nehru.class));
            }
        });

        mPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), sanjay.class));
            }
        });

        mClink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), clink.class));
            }
        });
    }
}



