package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifkiadam.gryus.greatingapps.R;


public class Unit1Activity extends AppCompatActivity {

//    private SectionsPagerAdapter mSectionsPagerAdapter;
//
//    private ViewPager mViewPager;
//
//    Fragment definitionFragment;
//    Fragment descriptionFragment;
//    Fragment exampleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);

//        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
//        mViewPager = findViewById(R.id.container);
//        mViewPager.setAdapter(mSectionsPagerAdapter);
//
//        TabLayout tabLayout = findViewById(R.id.tabs);
//
//        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
//
//        definitionFragment = new DefinitionFragment();
//        descriptionFragment = new DescriptionFragment();
//        exampleFragment = new ExampleFragment();


        Button btnDefinisi = findViewById(R.id.definisi);
        btnDefinisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Unit1Activity.this, DefinitionActivity.class);
                startActivity(intent);

            }
        });
        Button btnDeskripsi = findViewById(R.id.deskripsi);
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


    }
}

//    public class SectionsPagerAdapter extends FragmentPagerAdapter{
//        public SectionsPagerAdapter(FragmentManager fm){
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position){
//            if (position ==0){
//                return definitionFragment;
//            }else if (position == 1){
//                return descriptionFragment;
//            }else if (position == 2){
//                return exampleFragment;
//            }
//            return null;
//        }
//
//        @Override
//        public int getCount(){
//            return 3;
//        }
////    }
//}
