package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button simple;
    Button advanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        simple = findViewById(R.id.simple); // using section averages
        advanced = findViewById(R.id.advanced); // individual scores

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, simple.class);
                startActivity(k);
            }
        });

        advanced.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent k = new Intent(MainActivity.this, advanced.class);
               startActivity(k);
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end of onCreate
} // end