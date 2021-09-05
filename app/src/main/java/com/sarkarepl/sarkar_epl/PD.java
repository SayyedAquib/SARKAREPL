package com.sarkarepl.sarkar_epl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PD extends AppCompatActivity {

    Button button11,button12,button13,button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pd);

        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PD.this, ITSERVICE.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PD.this, OILGAS.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PD.this, TELECOM.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PD.this, INDIANRAILWAYS.class);
                startActivity(intent);
            }
        });

    }
}