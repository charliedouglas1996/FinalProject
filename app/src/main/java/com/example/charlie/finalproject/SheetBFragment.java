package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Classs;


/**
 * A simple {@link Fragment} subclass.
 */
public class SheetBFragment extends Fragment {

    GridLayout griddy;
    Character character;

    public SheetBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_b, container, false);

        griddy=(GridLayout)v.findViewById(R.id.gridBoi);
        character=((SheetActivity)getActivity()).getCharacter();
        TextView tv;
        for(int i = 0; i<character.getSkill().length; i++){
            int j=(i+1)*4;
            tv=(TextView)((ViewGroup)griddy).getChildAt(j);
            if(character.getSkill()[i]==0)
                tv.setText("     ⦾");
            else
                tv.setText("     ⦿");
            tv=(TextView)((ViewGroup)griddy).getChildAt(j+1);
            tv.setText("   "+Character.skillsMod[i]);
            tv=(TextView)((ViewGroup)griddy).getChildAt(j+2);
            tv.setText(Character.skills[i]);
            tv.setTextSize(18);
            tv=(TextView)((ViewGroup)griddy).getChildAt(j+3);
            int bonus;
            if(Character.skillsMod[i].equals("DEX")){
                bonus=character.getDexterity();
            } else if(Character.skillsMod[i].equals("CHA")){
                bonus=character.getCharisma();
            } else if(Character.skillsMod[i].equals("STR")){
                bonus=character.getStrength();
            } else if(Character.skillsMod[i].equals("WIS")){
                bonus=character.getWisdom();
            } else {
                bonus=character.getIntelligence();
            }
            if(character.getSkill()[i]!=0)
                bonus+=character.getClasss().getProficiencyBonus();
            if(bonus>=0)
                tv.setText("      +"+bonus);
            else
                tv.setText("      "+bonus);

// ⦾⦿
        }

        return v;
    }

}
