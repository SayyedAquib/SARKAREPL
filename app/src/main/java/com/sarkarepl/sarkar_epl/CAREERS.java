package com.sarkarepl.sarkar_epl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CAREERS extends AppCompatActivity {

    Button button15, button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers);

        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CAREERS.this, LD.class);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CAREERS.this, RECRUITMENTS.class);
                startActivity(intent);
            }
        });
    }

}