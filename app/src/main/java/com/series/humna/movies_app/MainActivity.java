package com.series.humna.movies_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {                         //OnButtonClick method
        if(v.getId() == R.id.FirstButton);
        Intent i = new Intent(MainActivity.this, NewWorld.class);
        startActivity(i);

    }
}
