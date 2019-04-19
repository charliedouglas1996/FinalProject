package com.example.charlie.finalproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Classes.Barbarian;
import com.example.charlie.finalproject.Characters.Classes.Bard;
import com.example.charlie.finalproject.Characters.Classes.Cleric;
import com.example.charlie.finalproject.Characters.Classes.Druid;
import com.example.charlie.finalproject.Characters.Classes.Fighter;
import com.example.charlie.finalproject.Characters.Classes.Monk;
import com.example.charlie.finalproject.Characters.Classes.Paladin;
import com.example.charlie.finalproject.Characters.Classes.Ranger;
import com.example.charlie.finalproject.Characters.Classes.Rogue;
import com.example.charlie.finalproject.Characters.Classes.Sorcerer;
import com.example.charlie.finalproject.Characters.Classes.Warlock;
import com.example.charlie.finalproject.Characters.Classes.Wizard;
import com.example.charlie.finalproject.Characters.Classs;
import com.example.charlie.finalproject.Characters.Race;
import com.example.charlie.finalproject.Characters.Races.Dragonborn;
import com.example.charlie.finalproject.Characters.Races.Dwarf;
import com.example.charlie.finalproject.Characters.Races.Elf;
import com.example.charlie.finalproject.Characters.Races.Gnome;
import com.example.charlie.finalproject.Characters.Races.HalfElf;
import com.example.charlie.finalproject.Characters.Races.HalfOrc;
import com.example.charlie.finalproject.Characters.Races.Halfling;
import com.example.charlie.finalproject.Characters.Races.Human;
import com.example.charlie.finalproject.Characters.Races.Tiefling;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatorEndFragment extends Fragment {

    TextView endText;
    Button saveButton,restartCreatorButton,backToClassButton;
    EditText nameET;

    public CreatorEndFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_creator_end, container, false);
        endText=(TextView)v.findViewById(R.id.endTextView);
        saveButton=(Button)v.findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCharacter();
            }
        });
        restartCreatorButton=(Button)v.findViewById(R.id.restartCreatorButton);
        restartCreatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreatorActivity.setPage(0);
                ((CreatorActivity)getActivity()).setViewPager(0);
            }
        });
        backToClassButton=(Button)v.findViewById(R.id.backToClassButton);
        backToClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getPage()==5)
                    ((CreatorActivity)getActivity()).decPage();
            }
        });
        nameET=(EditText)v.findViewById(R.id.nameET);
        return v;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            String additionalText="You have created a";
            if(CreatorActivity.getRace()< Race.raceDescriptions.length){
                if(CreatorActivity.getRace()==2){
                    additionalText+="n";
                }
                additionalText+=" "+Race.raceDescriptions[CreatorActivity.getRace()][0];
                additionalText+=" "+ Classs.classDescriptions[CreatorActivity.getClasss()][0];
                endText.setText(additionalText);
            }
        }
    }

    private void saveCharacter(){
        String name=nameET.getText().toString();
        Classs classs;
        switch (CreatorActivity.getClasss()){
            case 0:
                classs=new Barbarian();
                break;
            case 1:
                classs=new Bard();
                break;
            case 2:
                classs=new Cleric();
                break;
            case 3:
                classs=new Druid();
                break;
            case 4:
                classs=new Fighter();
                break;
            case 5:
                classs=new Monk();
                break;
            case 6:
                classs=new Paladin();
                break;
            case 7:
                classs=new Ranger();
                break;
            case 8:
                classs=new Rogue();
                break;
            case 9:
                classs=new Sorcerer();
                break;
            case 10:
                classs=new Warlock();
                break;
            case 11:
                classs=new Wizard();
                break;
            default:
                classs=new Barbarian();
        }
        Race race;
        switch(CreatorActivity.getRace()){
            case 0:
                race=new Dragonborn();
                break;
            case 1:
                race=new Dwarf();
                break;
            case 2:
                race=new Elf();
                break;
            case 3:
                race=new Gnome();
                break;
            case 4:
                race=new Halfling();
                break;
            case 5:
                race=new HalfElf();
                break;
            case 6:
                race=new HalfOrc();
                break;
            case 7:
                race=new Human();
                break;
            case 8:
                race=new Tiefling();
                break;
            default:
                race=new Dragonborn();
        }
        Character character = new Character(race,classs,name);
        Character.setCharacter(character);
        Character.addCharacter(character);
        Intent i = new Intent(getActivity(), SheetActivity.class);
        i.putExtra(SheetActivity.EXTRA, 0);
        startActivity(i);
    }

}
