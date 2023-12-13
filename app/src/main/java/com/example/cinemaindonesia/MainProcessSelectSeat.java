package com.example.cinemaindonesia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainProcessSelectSeat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_process_select_seat);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0E2954")); // Replace with your desired color
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Pilih Kursi");
        actionBar.setElevation(0);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Set listenerr to thee buttonn
        Button btnNextStep = findViewById(R.id.btnNextStep);
        btnNextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProcessSelectSeat.this, MainProcessPaymentSummary.class);
                startActivity(intent);
            }
        });
    }
}