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
//- add synopsis page
//- add confirm button

//- ability scores
//- class options
//- race options
//- database
//- character sheet
//- dice rolling