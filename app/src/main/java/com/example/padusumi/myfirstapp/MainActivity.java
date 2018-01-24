package com.example.padusumi.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import java.io.File;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private static final String TAG = "MainActivity";

    private Button Browse;
    private File selectedFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Browse = (Button)findViewById(R.id.browse);
        Browse.setOnClickListener(this);
    }

    public void onClick(View v){
        Log.d(TAG, "onClick: event triggered");
    }
}
