package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rifkiadam.gryus.greatingapps.MainActivity;
import com.rifkiadam.gryus.greatingapps.R;

public class HasilSkoringActivity extends AppCompatActivity {

    TextView mtvHasilAkhir;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring);

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);
        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkoringActivity.this, Unit1Activity.class);
                startActivity(i);

            }
        });
    }

    public void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if (activity.equals("PilihanGanda")) {
            mtvHasilAkhir.setText("SKOR : " + skorPilGan);
        } else {
            mtvHasilAkhir.setText("SKOR : " + skorEssay);
        }
    }
}
