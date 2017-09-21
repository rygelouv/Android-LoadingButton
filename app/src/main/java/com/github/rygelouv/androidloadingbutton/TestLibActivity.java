package com.github.rygelouv.androidloadingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.rygelouv.androidloadingbuttonlib.LoadingButton;

public class TestLibActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lib);

        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ((LoadingButton)findViewById(R.id.button_test))
                        .stopLoading("Done!");
            }
        });
    }
}
