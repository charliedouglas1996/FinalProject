package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Classs;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClassDescriptionFragment extends Fragment {

    TextView className;
    TextView classDescription;
    Button backButton;
    Button endButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_class_description, container, false);
        className=(TextView)v.findViewById(R.id.className);
        classDescription=(TextView)v.findViewById(R.id.classDescription);
        backButton=(Button)v.findViewById(R.id.backClass);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getPage()==4)
                    ((CreatorActivity)getActivity()).decPage();
            }
        });
        endButton=(Button)v.findViewById(R.id.endButton);
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getPage()==4)
                    ((CreatorActivity)getActivity()).incPage();
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
            if(CreatorActivity.getClasss()< Classs.classDescriptions.length){
                className.setText(Classs.classDescriptions[CreatorActivity.getClasss()][0]);
            }
            if(CreatorActivity.getClasss()< Classs.classDescriptions.length){
                classDescription.setText(Classs.classDescriptions[CreatorActivity.getClasss()][1]);
            }
        }
    }
}
