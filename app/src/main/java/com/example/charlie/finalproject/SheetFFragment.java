package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Spell;

import java.util.ArrayList;

import static com.example.charlie.finalproject.Characters.Character.abilityScoreNames;
import static com.example.charlie.finalproject.Characters.Character.getModifier;

public class SheetFFragment extends Fragment {


    Character character;
    TextView cantripTV,cantripTitle, spellTV,spellTitle,abilityN,saveN,attackN;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_f, container, false);
        character=((SheetActivity)getActivity()).getCharacter();
        cantripTV=(TextView)v.findViewById(R.id.cantripTV);
        cantripTitle=(TextView)v.findViewById(R.id.cantripTitle);
        spellTV=(TextView)v.findViewById(R.id.spellTV);
        spellTitle=(TextView)v.findViewById(R.id.spellTitle);
        abilityN=(TextView)v.findViewById(R.id.abilityN);
        saveN=(TextView)v.findViewById(R.id.saveN);
        attackN=(TextView)v.findViewById(R.id.attackN);

        abilityN.setText(abilityScoreNames[character.getSpellcastingAbility()]);
        attackN.setText("+"+(character.getClasss().getProficiencyBonus()+getModifier(character.getAbilityScore(character.getSpellcastingAbility())))+"");
        saveN.setText(8+character.getClasss().getProficiencyBonus()+getModifier(character.getAbilityScore(character.getSpellcastingAbility()))+"");

        String string="";
        ArrayList<String[]> list=character.getCantrips();
        for(int i=0;i<list.size();i++){
            string+=list.get(i)[0]+":\n\n"+list.get(i)[1]+"\n\n\n";
        }
        cantripTV.setText(string);//+list.get(list.size()-1)[0]+"\n\n"+list.get(list.size()-1)[1]);

        if(character.getSpells()==null){
            spellTitle.setVisibility(View.GONE);
        }
        else{
            string="("+character.getClasss().getSpellSlots()+" Spell slot";
            if(character.getClasss().getSpellSlots()>1) string+="s";
            string+=")\n";
            spellTitle.setText(spellTitle.getText()+"\n"+string);
            string="";
            list=character.getSpells();
            for(int i=0;i<list.size();i++){
                string+=list.get(i)[0]+":\n\n"+list.get(i)[1]+"\n\n\n";
            }
            spellTV.setText(string);//+list.get(list.size()-1)[0]+"\n\n"+list.get(list.size()-1)[1]);
        }
        return v;
    }

}
