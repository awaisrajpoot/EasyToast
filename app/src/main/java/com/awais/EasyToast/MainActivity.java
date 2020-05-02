package com.awais.EasyToast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.awais.easyToast.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CustomToast(this,"working....").setIcon(CustomToast.HAPPY_ICON);

    }
}
