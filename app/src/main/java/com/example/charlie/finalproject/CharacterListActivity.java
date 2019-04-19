package com.example.charlie.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.charlie.finalproject.Characters.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterListActivity extends AppCompatActivity {

    ArrayList<String> list;
    ListView characterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);
        list= Character.getCharacterStrings();
        characterListView=(ListView)findViewById(R.id.characterListView);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                    Intent i = new Intent(CharacterListActivity.this, SheetActivity.class);
                    i.putExtra(SheetActivity.EXTRA, (int) id);
                    startActivity(i);
            }
        };
        characterListView.setOnItemClickListener(itemClickListener);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                R.layout.list_characters,
                list );

        characterListView.setAdapter(arrayAdapter);
    }
}
