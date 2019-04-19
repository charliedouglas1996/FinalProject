package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SheetEFragment extends Fragment {
    Character character;
    TextView armorTitle, armorTV,weaponTitle ,weaponTV,toolTitle,toolTV,languageTitle,languageTV,sensesTitle,sensesTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_e, container, false);

        character=((SheetActivity)getActivity()).getCharacter();
        armorTitle=(TextView)v.findViewById(R.id.armorTitle);
        armorTV=(TextView)v.findViewById(R.id.armorTV);
        weaponTitle=(TextView)v.findViewById(R.id.weaponTitle);
        weaponTV=(TextView)v.findViewById(R.id.weaponTV);
        toolTitle=(TextView)v.findViewById(R.id.toolTitle);
        armorTitle=(TextView)v.findViewById(R.id.armorTitle);
        toolTV=(TextView)v.findViewById(R.id.toolTV);
        languageTitle=(TextView)v.findViewById(R.id.languageTitle);
        languageTV=(TextView)v.findViewById(R.id.languageTV);
        sensesTitle=(TextView)v.findViewById(R.id.sensesTitle);
        sensesTV=(TextView)v.findViewById(R.id.sensesTV);

        ArrayList<String> strings;
        String string;
        if(character.getArmorProficiencies()!=null){
            armorTitle.setText("Armor:");
            strings=character.getArmorProficiencies();
            string="";
            for(int i=0;i<strings.size()-1;i++){
                string+=strings.get(i)+", ";
            }
            armorTV.setText(string+strings.get(strings.size()-1));
        }
        else {
            armorTitle.setVisibility(View.GONE);
            armorTV.setVisibility(View.GONE);
        }

        if(character.getWeaponProficiencies()!=null){
            weaponTitle.setText("Weapons:");
            strings=character.getWeaponProficiencies();

            string="";
            for(int i=0;i<strings.size()-1;i++){
                string+=strings.get(i)+", ";
            }
            weaponTV.setText(string+strings.get(strings.size()-1));
        }
        else {
            weaponTitle.setVisibility(View.GONE);
            weaponTV.setVisibility(View.GONE);
        }
        if(character.getToolProficiencies()!=null){
            toolTitle.setText("Tools:");
            strings=character.getToolProficiencies();
            string="";
            for(int i=0;i<strings.size()-1;i++){
                string+=strings.get(i)+", ";
            }
            toolTV.setText(string+strings.get(strings.size()-1));
        }
        else {
            toolTitle.setVisibility(View.GONE);
            toolTV.setVisibility(View.GONE);
        }
        if(character.getLanguages()!=null){
            languageTitle.setText("Languages:");
            strings=character.getLanguages();
            string="";
            for(int i=0;i<strings.size()-1;i++){
                string+=strings.get(i)+", ";
            }
            languageTV.setText(string+strings.get(strings.size()-1));
        }
        else {
            languageTitle.setVisibility(View.GONE);
            languageTV.setVisibility(View.GONE);
        }
        if(character.getRace().isDarkvision()){
            sensesTitle.setText("Senses:");
            sensesTV.setText("Darkvision - 60ft.");
        }
        else {
            sensesTitle.setVisibility(View.GONE);
            sensesTV.setVisibility(View.GONE);
        }

        return v;
    }

}
