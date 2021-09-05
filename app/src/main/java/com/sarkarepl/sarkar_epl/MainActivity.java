package com.sarkarepl.sarkar_epl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HOME.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HEALTHCARE.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WHOWEARE.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OXYGENPLANT.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MEDICAL_STUFF.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PD.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CLIENTS.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CAREERS.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CONTACTUS.class);
                startActivity(intent);
            }
        });

    }

//    public void home(View view) {
//        Intent intent = new Intent(this, HOME.class);
//        startActivity(intent);
//    }
//
//    public void whoweare(View view) {
//        Intent intent = new Intent(this, WHOWEARE.class);
//        startActivity(intent);
//    }
//
//
//    public void pd(View view) {
//        Intent intent = new Intent(this, PD.class);
//        startActivity(intent);
//    }
//
//    public void clients(View view) {
//        Intent intent = new Intent(this, CLIENTS.class);
//        startActivity(intent);
//    }
//
//    public void careers(View view) {
//        Intent intent = new Intent(this, CAREERS.class);
//        startActivity(intent);
//    }
//
//    public void contactUs(View view) {
//        Intent intent = new Intent(this, CONTACTUS.class);
//        startActivity(intent);
//    }
//
//    public void medicalStuff(View view) {
//        Intent intent = new Intent(this, MEDICAL_STUFF.class);
//        startActivity(intent);
//    }
//
//    public void oxygenPlant(View view) {
//        Intent intent = new Intent(MainActivity.this, OXYGEN_PLANT.class);
//        startActivity(intent);
//    }
}