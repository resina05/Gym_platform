package com.example.gym_platform;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.tsengvn.typekit.TypekitContextWrapper;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase)
    { super.attachBaseContext(TypekitContextWrapper.wrap(newBase));

    }

}
