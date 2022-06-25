package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class ColorPicker extends View {

    public ColorPicker (Context context){

        super(context);//Получение activity

    }
    public ColorPicker(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);//Получение activity и атрибута

    }
}

