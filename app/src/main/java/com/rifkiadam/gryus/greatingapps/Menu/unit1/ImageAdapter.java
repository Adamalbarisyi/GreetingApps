package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.rifkiadam.gryus.greatingapps.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context context){
        mContext =context;
    }

    public static Integer[] mThumbsIds ={
            R.drawable.bgcard1,
            R.drawable.bgcard2,
            R.drawable.bgcard3,
            R.drawable.bgcard4,
            R.drawable.bgcard5,
            R.drawable.bgcard6,
            R.drawable.bgcard7
    };

    @Override
    public int getCount() {
        return mThumbsIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 0, 1, 0);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbsIds[position]);
        return imageView;
    }
}
