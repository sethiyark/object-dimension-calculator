package com.example.raunaksethiya.dimcal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int width = 0;
        int height = 0;
        int c = 0;

        ImageView iv = (ImageView) findViewById(R.id.iv);
        Bitmap theBitmap = ((BitmapDrawable)iv.getDrawable()).getBitmap();


        for(int x = 0; x < theBitmap.getWidth(); x++){
            int pixelvalue = theBitmap.getPixel(x, theBitmap.getHeight()/2);
            int redv = Color.red(pixelvalue);
            int bluev = Color.blue(pixelvalue);
            int greenv = Color.green(pixelvalue);
            if(redv > 200 && bluev > 200 && greenv > 200){
                if(s){
                    c++;
                    s = false;
                }
                width++;
            }
        }

        width = width/c;

        for(int y = 0; y < theBitmap.getHeight(); y++){
            int pixelvalue = theBitmap.getPixel(x, y);
            int redv = Color.red(pixelvalue);
            int bluev = Color.blue(pixelvalue);
            int greenv = Color.green(pixelvalue);
            if(redv > 200 && bluev > 200 && greenv > 200){
                if(s){
                    c++;
                    s = false;
                }
                height++;
            }
        }


        height = height / c;
        int twidth = 150;
        int theight = 200;
        float h = theight / theBitmap.getHeight();
        float w = twidth / theBitmap.getWidth();
        width = (int)w*width;
        height = (int)h*height;

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("Width = "+ width + "\nHeight = "+ height);
    }
}
