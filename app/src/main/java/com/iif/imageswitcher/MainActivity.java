package com.iif.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImageButton(View view){

        ImageView firstImageView = (ImageView) findViewById(R.id.firstImageView);
        firstImageView.setImageResource(R.drawable.superbike2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}