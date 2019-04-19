package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SheetDFragment extends Fragment {

    Character character;
    TextView featuresTV1, featuresTV2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_d, container, false);

        featuresTV1=(TextView)v.findViewById(R.id.featuresTV1);
        featuresTV2=(TextView)v.findViewById(R.id.featuresTV2);
        character=((SheetActivity)getActivity()).getCharacter();

        String features="\n";
        ArrayList<String[]> featureList=character.getClasss().getFeatures();
        for(int i=0;i<featureList.size();i++){
            features+=featureList.get(i)[0]+":\n"+featureList.get(i)[1]+"\n\n";
        }

        featuresTV1.setText(features);

        features="\n";
        featureList=character.getRace().getFeatures();
        for(int i=0;i<featureList.size();i++){
            features+=featureList.get(i)[0]+":\n"+featureList.get(i)[1]+"\n";
        }

        featuresTV2.setText(features);

        return v;
    }

}
