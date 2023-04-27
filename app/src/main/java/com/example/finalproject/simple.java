package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class simple extends AppCompatActivity {
    Button calculate;
    Button back;

    TextView hnum;
    TextView cnum;
    TextView qnum;
    TextView tnum;

    TextView fgrade;

    TextView hpercent;
    TextView cpercent;
    TextView qpercent;
    TextView tpercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        hnum = findViewById(R.id.hnum);
        cnum = findViewById(R.id.cnum);
        qnum = findViewById(R.id.qnum);
        tnum = findViewById(R.id.tnum);

        hpercent = findViewById(R.id.hpercent);
        cpercent = findViewById(R.id.cpercent);
        qpercent = findViewById(R.id.qpercent);
        tpercent = findViewById(R.id.tpercent);

        back = findViewById(R.id.back);
        calculate = findViewById(R.id.calculate);
        fgrade = findViewById(R.id.finalgrade);


        calculate.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
                Integer c;
                Integer quiz;
                Integer test;
                Integer home;
                Integer math;

               c = Integer.parseInt(cnum.toString()) * (Integer.parseInt(cpercent.toString()) * 100);
               quiz = Integer.parseInt(qnum.toString()) * (Integer.parseInt(qpercent.toString()) * 100);
               test = Integer.parseInt(tnum.toString()) * (Integer.parseInt(tpercent.toString()) * 100);
               home = Integer.parseInt(hnum.toString()) * (Integer.parseInt(hpercent.toString()) * 100);
               math = c + home + quiz + test;
               fgrade.setText(math);
           }
        }); // end of calculate

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    } // end of onCreate
} // end