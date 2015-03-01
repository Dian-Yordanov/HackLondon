package com.example.xelnectmobileuser.hacklondon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  ImageButton upperButton = (ImageButton) findViewById(R.id.upperButton);
        upperButton.setClickable(false);
        upperButton.setPressed(true);

        ImageButton bottomButton = (ImageButton) findViewById(R.id.bottomButton);
        bottomButton.setClickable(false);
        bottomButton.setPressed(true);

        ImageButton yellowButton = (ImageButton) findViewById(R.id.yellowButton);
        yellowButton.setClickable(false);
        yellowButton.setPressed(true);

        ImageButton gpsButton = (ImageButton) findViewById(R.id.gpsButton);
        gpsButton.setClickable(false);
        gpsButton.setPressed(true);

        ImageButton allButton = (ImageButton) findViewById(R.id.allButton);
        allButton.setClickable(false);
        allButton.setPressed(true);

        ImageButton deliveryButton = (ImageButton) findViewById(R.id.deliveryButton);
        deliveryButton.setClickable(false);
        deliveryButton.setPressed(true);

        ImageButton collectionButton = (ImageButton) findViewById(R.id.collectionButton);
        collectionButton.setClickable(false);
        collectionButton.setPressed(true);*/

        Button buttonForNewActivity = (Button) findViewById(R.id.buttonForNewActivity);
        buttonForNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
             //   myIntent.putExtra("key",); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });



       /* final Button next = (Button) findViewById(R.id.image) ;
       // Drawable d = Drawable.createFromPath("@drawable/upper_label");
        next.setBackgroundResource(R.drawable.upper_label);
*/
        //imageView(R.drawable.upper_label);

       /* this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.layout_launch);
*/
/*
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.loadUrl("https://mcsnap.herokuapp.com");*/



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
/*
            Uri uri = Uri.parse("https://mcsnap.herokuapp.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);*/

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
