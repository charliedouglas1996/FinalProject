package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RaceDescriptionFragment extends Fragment {

    TextView raceName;
    TextView raceDescription;
    Button backButton;
    Button classButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_race_description, container, false);
        raceName=(TextView)v.findViewById(R.id.raceName);
        raceDescription=(TextView)v.findViewById(R.id.raceDescription);
        backButton=(Button)v.findViewById(R.id.backRace);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CreatorActivity)getActivity()).setViewPager(1);
            }
        });
        classButton=(Button)v.findViewById(R.id.classButton);
        classButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CreatorActivity)getActivity()).setViewPager(3);
            }
        });
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            if(CreatorActivity.getRace()<Race.raceDescriptions.length){
                raceName.setText(Race.raceDescriptions[CreatorActivity.getRace()][0]);
            }
            if(CreatorActivity.getRace()<Race.raceDescriptions.length){
                raceDescription.setText(Race.raceDescriptions[CreatorActivity.getRace()][1]);
            }
        }
    }
}
