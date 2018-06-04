package com.series.humna.movies_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class NewWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_world);
    }
    public void onButtonClick(View v) {                              //OnButtonClick method
        if(v.getId() == R.id.SecondButton);
        Intent i = new Intent(NewWorld.this, MainActivity.class);
        startActivity(i);

    }
}
