package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.charlie.finalproject.Characters.Classes.Wizard;
import com.example.charlie.finalproject.Characters.Race;
import com.example.charlie.finalproject.Characters.Races.Dragonborn;
import com.example.charlie.finalproject.Characters.Races.Dwarf;
import com.example.charlie.finalproject.Characters.Races.Elf;
import com.example.charlie.finalproject.Characters.Races.HalfElf;
import com.example.charlie.finalproject.Characters.Races.Human;


/**
 * A simple {@link Fragment} subclass.
 */
public class RaceDescriptionFragment extends Fragment {

    TextView raceName;
    TextView raceDescription;
    TextView featureTextView;
    TextView featureTextView2;
    Button backButton;
    Button classButton;
//    Spinner spinner1;
//    Spinner spinner2;
//    Spinner spinner3;
//    Spinner spinner4;
//    Spinner spinner5;
//    Spinner spinner6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_race_description, container, false);
        raceName=(TextView)v.findViewById(R.id.raceName);
        raceDescription=(TextView)v.findViewById(R.id.raceDescription);
        featureTextView=(TextView)v.findViewById(R.id.featureTextView);
        featureTextView2=(TextView)v.findViewById(R.id.featureTextView2);
        backButton=(Button)v.findViewById(R.id.backRace);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getPage()==2)
                    ((CreatorActivity)getActivity()).decPage();
            }
        });
        classButton=(Button)v.findViewById(R.id.classButton);
        classButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getSkill1()==CreatorActivity.getSkill2()){
                    Toast.makeText(getContext(),"Cannot add same skill twice",Toast.LENGTH_SHORT).show();
                }
                else if(CreatorActivity.getAbility1()==CreatorActivity.getAbility2()){
                    Toast.makeText(getContext(),"Cannot add same ability twice",Toast.LENGTH_SHORT).show();
                }
                else if(CreatorActivity.getPage()==2)
                    ((CreatorActivity)getActivity()).incPage();
            }
        });
//        spinner1=(Spinner)v.findViewById(R.id.spinner1);
//        spinner2=(Spinner)v.findViewById(R.id.spinner2);
//        spinner3=(Spinner)v.findViewById(R.id.spinner3);
//        spinner4=(Spinner)v.findViewById(R.id.spinner4);
//        spinner5=(Spinner)v.findViewById(R.id.spinner5);
//        spinner6=(Spinner)v.findViewById(R.id.spinner6);
        return v;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            if(CreatorActivity.getRace()< Race.raceDescriptions.length){
                raceName.setText(Race.raceDescriptions[CreatorActivity.getRace()][0]);
            }
            if(CreatorActivity.getRace()<Race.raceDescriptions.length){
                raceDescription.setText(Race.raceDescriptions[CreatorActivity.getRace()][1]);
            }
            int race=CreatorActivity.getRace();
            raceName.setText(Race.raceDescriptions[race][0]);
            ArrayAdapter<String> adapter,adapter2,adapter3;
            switch(race){
                case 0://Dragonborn
                    raceDescription.setText(Dragonborn.raceDescription());
//                    spinner1.setVisibility(View.VISIBLE);
//                    String[] ancestries=Dragonborn.getAncestries();
//                    adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,ancestries);
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner1.setAdapter(adapter);
//                    spinner1.setSelection(CreatorActivity.getDraconicAncesty());
//                    spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                        CreatorActivity.setDraconicAncesty(position);
//                    }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
                    break;
                case 1://Dwarf
                    raceDescription.setText(Dwarf.raceDescription());
//                    spinner1.setVisibility(View.VISIBLE);
//                    String[] tools=Dwarf.toolOptions();
//                    adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,tools);
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner1.setAdapter(adapter);
//                    spinner1.setSelection(CreatorActivity.getDwarfTool());
//                    spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setDwarfTool(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
                    break;
                case 2://Elf
                    raceDescription.setText(Elf.raceDescription());
//                    spinner1.setVisibility(View.VISIBLE);
//                    final String[] elfLanguages= Elf.getLanguageList();
//                    adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,elfLanguages);
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner1.setAdapter(adapter);
//                    spinner1.setSelection(adapter.getPosition(CreatorActivity.getLanguage()));
//                    spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setLanguage(elfLanguages[position]);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
//                    featureTextView.setVisibility(View.VISIBLE);
//                    featureTextView.setText(Elf.cantrip());
//                    final String[] wizList= Wizard.spellList[0];
//                    spinner6.setVisibility(View.VISIBLE);
//                    adapter2 = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,wizList);
//                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner6.setAdapter(adapter2);
//                    spinner6.setSelection(CreatorActivity.getCantrip());
//                    spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setCantrip(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
                    break;
                case 5://Half-elf
                    raceDescription.setText(HalfElf.raceDescription());
//                    spinner1.setVisibility(View.VISIBLE);
//                    final String[] halfElfLanguages= HalfElf.getLanguageList();
//                    adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,halfElfLanguages);
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner1.setAdapter(adapter);
//                    spinner1.setSelection(adapter.getPosition(CreatorActivity.getLanguage()));
//                    spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setLanguage(halfElfLanguages[position]);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
////                    });
//                    featureTextView.setVisibility(View.VISIBLE);
//                    featureTextView.setText(HalfElf.skillsDescription());
//                    final String[] skills= HalfElf.skills();
//                    spinner2.setVisibility(View.VISIBLE);
//                    adapter2 = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,skills);
//                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner2.setAdapter(adapter2);
//                    spinner2.setSelection(CreatorActivity.getSkill1());
//                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setSkill1(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
//                    spinner3.setVisibility(View.VISIBLE);
//                    spinner3.setAdapter(adapter2);
//                    spinner3.setSelection(CreatorActivity.getSkill2());
//                    spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setSkill2(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
//                    spinner3.setSelection(CreatorActivity.getSkill2());

//                    featureTextView2.setVisibility(View.VISIBLE);
//                    featureTextView2.setText(HalfElf.abilityScoreDescription());
//                    final String[] abilities=HalfElf.abilityScores();
//                    spinner4.setVisibility(View.VISIBLE);
//                    adapter3=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,abilities);
//                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner4.setAdapter(adapter3);
//                    spinner4.setSelection(CreatorActivity.getAbility1());
//                    spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setAbility1(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
//                    spinner5.setVisibility(View.VISIBLE);
//                    spinner5.setAdapter(adapter3);
//                    spinner5.setSelection(CreatorActivity.getAbility2());
//                    spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setAbility2(position);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
                    break;
                case 7://Human
                    raceDescription.setText(Human.raceDescription());
//                    spinner1.setVisibility(View.VISIBLE);
//                    final String[] humanLanguages= Human.getLanguageList();
//                    adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,humanLanguages);
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spinner1.setAdapter(adapter);
//                    spinner1.setSelection(adapter.getPosition(CreatorActivity.getLanguage()));
//                    spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                            CreatorActivity.setLanguage(humanLanguages[position]);
//                        }@Override public void onNothingSelected(AdapterView<?> parent) {}
//                    });
                    break;
            }
        }
    }
}
