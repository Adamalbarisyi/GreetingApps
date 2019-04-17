package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.rifkiadam.gryus.greatingapps.R;

public class DescribeActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);
        GridView gridView = findViewById(R.id.gridview_followed);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(DescribeActivity.this,"klik di gambar ke - " + position,Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,SingleImage.class);
        Bundle b = new Bundle();
        b.putInt("posisi",position);
        i.putExtras(b);
        startActivity(i);

    }
}
