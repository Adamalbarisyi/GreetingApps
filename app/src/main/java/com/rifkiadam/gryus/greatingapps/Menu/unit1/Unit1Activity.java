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
import android.widget.ImageButton;

import com.rifkiadam.gryus.greatingapps.MainActivity;
import com.rifkiadam.gryus.greatingapps.Menu.unit1.fragments.DefinitionFragment;
import com.rifkiadam.gryus.greatingapps.Menu.unit1.fragments.DescriptionFragment;
import com.rifkiadam.gryus.greatingapps.Menu.unit1.fragments.ExampleFragment;
import com.rifkiadam.gryus.greatingapps.R;


public class Unit1Activity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    Fragment definitionFragment;
    Fragment descriptionFragment;
    Fragment exampleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        definitionFragment = new DefinitionFragment();
        descriptionFragment = new DescriptionFragment();
        exampleFragment = new ExampleFragment();




    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter{
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position){
            if (position ==0){
                return definitionFragment;
            }else if (position == 1){
                return descriptionFragment;
            }else if (position == 2){
                return exampleFragment;
            }
            return null;
        }

        @Override
        public int getCount(){
            return 3;
        }
    }
}
