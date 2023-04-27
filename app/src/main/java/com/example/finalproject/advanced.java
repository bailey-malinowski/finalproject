package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class advanced extends AppCompatActivity {
    Button calculate;
    Button back;

    TextView hnum;
    TextView cnum;
    TextView qnum;
    TextView tnum;

    TextView hpercent;
    TextView cpercent;
    TextView qpercent;
    TextView tpercent;

    TextView fgrade;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        calculate = findViewById(R.id.calc);
        back = findViewById(R.id.back2);
        fgrade = findViewById(R.id.fingrade);
        total = findViewById(R.id.total);

        hnum = findViewById(R.id.h_num);
        cnum = findViewById(R.id.c_num);
        qnum = findViewById(R.id.q_num);
        tnum= findViewById(R.id.t_num);

        hpercent = findViewById(R.id.h_per);
        cpercent = findViewById(R.id.c_per);
        qpercent = findViewById(R.id.q_num);
        tpercent = findViewById(R.id.t_per);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i;
                Integer t;
                Integer c = 0;
                Integer quiz = 0;
                Integer test = 0;
                Integer home = 0;
                Integer math;
                String subhome;
                String subc;
                String subquiz;
                String subtest;

                i=0;
                t = Integer.parseInt(total.toString());

                do {
                    subhome = hnum.toString().substring(i+1, i);
                    home += Integer.parseInt(subhome);

                    subc = cnum.toString().substring(i+1, i);
                    c += Integer.parseInt(subc);

                    subquiz = qnum.toString().substring(i+1, i);
                    quiz += Integer.parseInt(subquiz);

                    subtest = tnum.toString().substring(i+1, i);
                    test += Integer.parseInt(subquiz);
                } while(i <= t);

                Integer ctot;
                Integer quiztot;
                Integer testtot;
                Integer hometot;

                ctot = Integer.parseInt(cnum.toString()) * (Integer.parseInt(cpercent.toString()) * 100);
                quiztot = Integer.parseInt(qnum.toString()) * (Integer.parseInt(qpercent.toString()) * 100);
                testtot = Integer.parseInt(tnum.toString()) * (Integer.parseInt(tpercent.toString()) * 100);
                hometot = Integer.parseInt(hnum.toString()) * (Integer.parseInt(hpercent.toString()) * 100);
                math = c + home + quiz + test;
                fgrade.setText(math);
            }
        }); // end of calculate button

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    } // end of onCreate
} // end