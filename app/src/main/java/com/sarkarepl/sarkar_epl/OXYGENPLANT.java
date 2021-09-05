package com.sarkarepl.sarkar_epl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OXYGENPLANT extends AppCompatActivity {

    Button button20,button21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxygenplant);

        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OXYGENPLANT.this, OXYGENINHEALTHCARE.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OXYGENPLANT.this, GENERATINGPLANT.class);
                startActivity(intent);
            }
        });

    }
}