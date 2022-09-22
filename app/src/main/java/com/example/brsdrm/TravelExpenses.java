package com.example.brsdrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TravelExpenses extends AppCompatActivity {

    TextView motorCycleRunningExpenses, otherRunningExpenses, tv3, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_expenses);

        //Set the orientation to Portrait for this screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        motorCycleRunningExpenses = findViewById(R.id.textView10);
        otherRunningExpenses = findViewById(R.id.textView11);
        quit = findViewById(R.id.textView12);

        motorCycleRunningExpenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        otherRunningExpenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);

            }
        });


    }
}