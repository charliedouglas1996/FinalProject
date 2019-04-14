package com.example.charlie.finalproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Classs;
import com.example.charlie.finalproject.Characters.Race;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatorEndFragment extends Fragment {

    TextView endText;
    Button saveButton,restartCreatorButton,backToClassButton;

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

    }

}
