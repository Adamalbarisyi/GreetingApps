package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rifkiadam.gryus.greatingapps.R;

public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);


//        final RadioGroup rgSoal1 = findViewById(R.id.rg_soal1);
//        Button btnJawab = findViewById(R.id.btnJawab);
//        btnJawab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int id= rgSoal1.getCheckedRadioButtonId();
//                switch (id){
//                    case R.id.rb1A:
//                        Toast.makeText(getApplication(), "your answer is A", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.rb1B:
//                        Toast.makeText(getApplication(), "your answer is B", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.rb1C:
//                        Toast.makeText(getApplication(), "your answer is C", Toast.LENGTH_SHORT).show();
//                        break;
//                    case  R.id.rb1D:
//                        Toast.makeText(getApplication(), "your answer is D", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });
    }

    public void onRadioButton1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb1A:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Correct", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb1B:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb1C:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb1D:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                    break;
        }
    }

    public void onRadioButton2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb2A:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Correct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb2B:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb2C:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb2D:
                if (checked)
                    Toast.makeText(getApplication(), "your answer is Wrong", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
