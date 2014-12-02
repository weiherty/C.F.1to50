package com.cfworks.cf1to50;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;


public class MainActivity extends Activity {
    ImageButton b11;
    ImageButton b12;
    ImageButton b13;
    ImageButton b14;
    ImageButton b15;
    ImageButton b21;
    ImageButton b22;
    ImageButton b23;
    ImageButton b24;
    ImageButton b25;
    ImageButton b31;
    ImageButton b32;
    ImageButton b33;
    ImageButton b34;
    ImageButton b35;
    ImageButton b41;
    ImageButton b42;
    ImageButton b43;
    ImageButton b44;
    ImageButton b45;
    ImageButton b51;
    ImageButton b52;
    ImageButton b53;
    ImageButton b54;
    ImageButton b55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        int width = metric.widthPixels;     // 屏幕宽度（像素）
        int bwidth = (width-2*dip2px(this,16))/5;
        setContentView(R.layout.activity_main);
        b11=(ImageButton)findViewById(R.id.imageButton1);
        b12=(ImageButton)findViewById(R.id.imageButton2);
        b13=(ImageButton)findViewById(R.id.imageButton3);
        b14=(ImageButton)findViewById(R.id.imageButton4);
        b15=(ImageButton)findViewById(R.id.imageButton5);
        b21=(ImageButton)findViewById(R.id.imageButton6);
        b22=(ImageButton)findViewById(R.id.imageButton7);
        b23=(ImageButton)findViewById(R.id.imageButton8);
        b24=(ImageButton)findViewById(R.id.imageButton9);
        b25=(ImageButton)findViewById(R.id.imageButton10);
        b31=(ImageButton)findViewById(R.id.imageButton11);
        b32=(ImageButton)findViewById(R.id.imageButton12);
        b33=(ImageButton)findViewById(R.id.imageButton13);
        b34=(ImageButton)findViewById(R.id.imageButton14);
        b35=(ImageButton)findViewById(R.id.imageButton15);
        b41=(ImageButton)findViewById(R.id.imageButton16);
        b42=(ImageButton)findViewById(R.id.imageButton17);
        b43=(ImageButton)findViewById(R.id.imageButton18);
        b44=(ImageButton)findViewById(R.id.imageButton19);
        b45=(ImageButton)findViewById(R.id.imageButton20);
        b51=(ImageButton)findViewById(R.id.imageButton21);
        b52=(ImageButton)findViewById(R.id.imageButton22);
        b53=(ImageButton)findViewById(R.id.imageButton23);
        b54=(ImageButton)findViewById(R.id.imageButton24);
        b55=(ImageButton)findViewById(R.id.imageButton25);
        b11.setMinimumHeight(bwidth);
        b12.setMinimumHeight(bwidth);
        b13.setMinimumHeight(bwidth);
        b14.setMinimumHeight(bwidth);
        b15.setMinimumHeight(bwidth);
        b21.setMinimumHeight(bwidth);
        b22.setMinimumHeight(bwidth);
        b23.setMinimumHeight(bwidth);
        b24.setMinimumHeight(bwidth);
        b25.setMinimumHeight(bwidth);
        b31.setMinimumHeight(bwidth);
        b32.setMinimumHeight(bwidth);
        b33.setMinimumHeight(bwidth);
        b34.setMinimumHeight(bwidth);
        b35.setMinimumHeight(bwidth);
        b41.setMinimumHeight(bwidth);
        b42.setMinimumHeight(bwidth);
        b43.setMinimumHeight(bwidth);
        b44.setMinimumHeight(bwidth);
        b45.setMinimumHeight(bwidth);
        b51.setMinimumHeight(bwidth);
        b52.setMinimumHeight(bwidth);
        b53.setMinimumHeight(bwidth);
        b54.setMinimumHeight(bwidth);
        b55.setMinimumHeight(bwidth);
        b11.setAdjustViewBounds(true);
        b11.setMaxWidth(bwidth);
        b11.setBackgroundResource(R.drawable.icon1);
        b12.setBackgroundResource(R.drawable.icon1);
        b13.setBackgroundResource(R.drawable.icon1);
        b14.setBackgroundResource(R.drawable.icon1);
        b15.setBackgroundResource(R.drawable.icon1);
    }

    public static int dip2px(Context context, float dipValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale + 0.5f);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
