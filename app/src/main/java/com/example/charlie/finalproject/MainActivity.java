package com.example.charlie.finalproject;

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

    public void newCharacter(View view) {
        Intent intent = new Intent(this, CreatorActivity.class);
        startActivity(intent);
    }
}
//TODO:
//- check race stuff at end of the thing

//- class options
//- race features and finish races
//- make quiz look good and finished
//- save characters locally

//- database
//- pregens
//- character sheet