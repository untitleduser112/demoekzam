package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // объявление элементов дизайна
    ImageView imgView;
    View mColorView;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.colorPickers);
        mColorView = findViewById(R.id.displayColors);

        imgView.setDrawingCacheEnabled(true);
        imgView.buildDrawingCache(true);
//Объявление элемента ImageView на изменение цвета по клику
        imgView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE) {
                    bitmap = imgView.getDrawingCache();
                    int pixels = bitmap.getPixel((int)event.getX(),(int)event.getY());

                    int r = Color.red(pixels);
                    int g = Color.green(pixels);
                    int b = Color.blue(pixels);

                    String hex = "#"+ Integer.toHexString(pixels);
                    mColorView.setBackgroundColor(Color.rgb(r,g,b));

                }
                return  true;
            }
        });
    }
}