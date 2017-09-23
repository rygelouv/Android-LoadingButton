package com.github.rygelouv.androidloadingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.rygelouv.androidloadingbuttonlib.LoadingButton;

public class TestLibActivity extends AppCompatActivity
{

    LoadingButton buton;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lib);
        buton = findViewById(R.id.button_test);
        stop = findViewById(R.id.stop);

        stop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buton.stopLoading("Done!");
            }
        });

        buton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buton.startLoading("Loading...");
            }
        });
    }
}
