package com.rohantaneja.googledrivesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonGetFiles;
    TextView textViewFileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetFiles = (Button) findViewById(R.id.b_get_files);
        textViewFileName = (TextView) findViewById(R.id.tv_file_name);



    }
}
