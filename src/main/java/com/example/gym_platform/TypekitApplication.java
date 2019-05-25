package com.example.gym_platform;

import android.app.Application;
import android.content.Context;

import com.tsengvn.typekit.Typekit;

public class TypekitApplication extends Application {
    @Override
   public void onCreate(){
        super.onCreate();

        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this,"기본 적용 폰트"))
                .addCustom2(Typekit.createFromAsset(this,"Light 속성을 위한 폰트"))
                .addBold(Typekit.createFromAsset(this,"Bold 속성을 위한 폰트"))
                .addCustom1(Typekit.createFromAsset(this,"Extra Bold 속성을 위한 폰트"));


    }


}


