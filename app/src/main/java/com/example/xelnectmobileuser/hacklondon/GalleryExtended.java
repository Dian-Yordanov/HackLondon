package com.example.xelnectmobileuser.hacklondon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Gallery;

/**
 * Created by XelnectMobileUser on 3/1/2015.
 */
public class GalleryExtended extends Gallery {
   /* private boolean isScrollingLeft(MotionEvent e1, MotionEvent e2){
        return e2.getX() > e1.getX();
    }*/
    public GalleryExtended(Context context) {
        super(context);
    }
    public GalleryExtended(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public GalleryExtended(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }


    /*@Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
        int kEvent;
        *//*if(isScrollingLeft(e1, e2)){ //Check if scrolling left
            kEvent = KeyEvent.KEYCODE_DPAD_LEFT;
        }
        else{ //Otherwise scrolling right 
            kEvent = KeyEvent.KEYCODE_DPAD_RIGHT;
        }
        onKeyDown(kEvent, null);
        return true;*//*
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
        float velocityY) {
            return false;
        }
*/
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        return false;
    }
}
