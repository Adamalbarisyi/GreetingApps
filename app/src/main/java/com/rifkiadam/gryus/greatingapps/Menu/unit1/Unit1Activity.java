package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifkiadam.gryus.greatingapps.R;
import com.rifkiadam.gryus.greatingapps.SecondActivity;


public class Unit1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);

        Button btnDefinisi = findViewById(R.id.definisi);
        btnDefinisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, DefinitionActivity.class);
                startActivity(intent);

            }
        });
        Button btnDeskripsi = findViewById(R.id.greeting_card);
        btnDeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, DescribeActivity.class);
                startActivity(intent);

            }
        });
        Button btnContoh = findViewById(R.id.example);
        btnContoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, ExampleActivity.class);
                startActivity(intent);

            }
        });
        Button btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, SecondActivity.class);
                startActivity(intent);

            }
        });


    }
}