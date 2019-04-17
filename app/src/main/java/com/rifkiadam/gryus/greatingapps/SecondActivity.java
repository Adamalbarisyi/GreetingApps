package com.rifkiadam.gryus.greatingapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifkiadam.gryus.greatingapps.Menu.unit1.Unit1Activity;
import com.rifkiadam.gryus.greatingapps.Menu.unit2.Unit2Activity;
import com.rifkiadam.gryus.greatingapps.Menu.unit3.Unit3Activity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnUnit1 = findViewById(R.id.unit1);
        btnUnit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Unit1Activity.class);
                startActivity(intent);

            }
        });

        Button btnUnit2 = findViewById(R.id.unit2);
        btnUnit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Unit2Activity.class);
                startActivity(intent);

            }
        });

        Button btnUnit3 = findViewById(R.id.unit3);
        btnUnit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Unit3Activity.class);
                startActivity(intent);

            }
        });


    }
}
