package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;

import static com.example.charlie.finalproject.Characters.Character.abilityScoreNames;
import static com.example.charlie.finalproject.Characters.Character.getModifier;


/**
 * A simple {@link Fragment} subclass.
 */
public class SheetAFragment extends Fragment {
    LinearLayout strengthTV, dexterityTV, constitutionTV, intelligenceTV, wisdomTV, charismaTV;
    LinearLayout savesL;
    Character character;
    TextView savesTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_a, container, false);

        character=((SheetActivity)getActivity()).getCharacter();
        strengthTV=(LinearLayout) v.findViewById(R.id.strengthTV);
        dexterityTV=(LinearLayout) v.findViewById(R.id.dexterityTV);
        constitutionTV=(LinearLayout) v.findViewById(R.id.constitutionTV);
        intelligenceTV=(LinearLayout) v.findViewById(R.id.intelligenceTV);
        wisdomTV=(LinearLayout) v.findViewById(R.id.wisdomTV);
        charismaTV=(LinearLayout) v.findViewById(R.id.charismaTV);
        savesL=v.findViewById(R.id.savesTV);
        savesTV=(TextView)((ViewGroup)savesL).getChildAt(0);

        LinearLayout[] linearLayouts={strengthTV, dexterityTV, constitutionTV, intelligenceTV, wisdomTV, charismaTV};
        for(int i=0;i<linearLayouts.length;i++){
            TextView nextChild = (TextView)((ViewGroup)linearLayouts[i]).getChildAt(0);
            nextChild.setText(Character.abilityScoreNames[i]);
            nextChild = (TextView)((ViewGroup)linearLayouts[i]).getChildAt(1);
            int mod=Character.getModifier(character.getAbilityScore(i));
            String add="";
            if (mod>0) add="+";
            nextChild.setText(add+mod);
            nextChild = (TextView)((ViewGroup)linearLayouts[i]).getChildAt(2);
            nextChild.setText(character.getAbilityScore(i)  +"");
        }
        String saves=savesTV.getText().toString()+"\n";
        savesTV.setText(saves);

        for(int i=0;i<character.getAbilityScores().length;i++){
            if((character.getClasss().getSavingThrows()[i])==0)
                saves="⦾ ";
            else saves="⦿ ";
            savesTV=(TextView)((ViewGroup)savesL).getChildAt(i+1);
            saves+=abilityScoreNames[i]+": ";
            int save=(getModifier(character.getAbilityScores()[i])+(character.getClasss().getSavingThrows()[i])*character.getClasss().getProficiencyBonus());
            if(save>0)saves+="+";
            saves+=save+"";
            savesTV.setText(saves);

        }
        return v;
    }
}
