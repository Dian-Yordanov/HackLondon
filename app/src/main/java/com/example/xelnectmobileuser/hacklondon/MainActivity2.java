package com.example.xelnectmobileuser.hacklondon;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XelnectMobileUser on 3/1/2015.
 */
public class MainActivity2 extends Activity {
        //---the images to display---
        Integer[] imageIDs = {
                R.drawable.candies,
                R.drawable.steak,
                R.drawable.steak_chips,
                R.drawable.fruit_salad,
                R.drawable.pizza,
        };
    int width;
    int height;

    @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_launch);

            Gallery gallery = (Gallery) findViewById(R.id.gallery);

            gallery.setAdapter(new ImageAdapter(this));
            gallery.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                public void onItemClick(AdapterView parent,
                                        View v, int position, long id)
                {
                    Toast.makeText(getBaseContext(),
                            "pic" + (position + 1) + " selected",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        public class ImageAdapter extends BaseAdapter
        {
            private Context context;
            private int itemBackground;

            public ImageAdapter(Context c)
            {
                context = c;
                //---setting the style---
              //  TypedArray a = obtainStyledAttributes(R.styleable.);
           /*     itemBackground = a.getResourceId(
                        R.styleable.Gallery1_android_galleryItemBackground, 0);
                a.recycle();*/
            }

            //---returns the number of images---
            public int getCount() {
                return imageIDs.length;
            }

            //---returns the ID of an item---
            public Object getItem(int position) {
                return position;
            }

            public long getItemId(int position) {
                return position;
            }

            //---returns an ImageView view---
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(imageIDs[position]);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                getDisplaySize();
                imageView.setLayoutParams(new Gallery.LayoutParams(width, height/2));
                imageView.setBackgroundResource(itemBackground);
                return imageView;
            }
            public void getDisplaySize() {
                Display display = getWindowManager().getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                width = size.x;
                height = size.y;
            }
        }
    }