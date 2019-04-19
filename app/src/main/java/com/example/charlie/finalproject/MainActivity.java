package com.example.charlie.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.charlie.finalproject.Characters.Character;

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

    public void rollActivity(View view){
        Intent intent = new Intent(this, DiceActivity.class);
        startActivity(intent);
    }
    public void charactersActivity(View view){
        Intent intent = new Intent(this, CharacterListActivity.class);
        startActivity(intent);
    }
}
//TODO:
//- check race stuff at end of the thing

//- character sheet
    //- Spells
//- make quiz look good and finished
    //- take out racial options
    //- introduction
    //- class description
//- save characters locally
//- navigation
//- pregens
//- database