package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class HalfOrc extends Race {

    private static final int RACE=6;
    public HalfOrc(){
        setAge("Half-orcs mature a little faster than humans, reaching adulthood around age " +
                "14. They age noticeably faster and rarely live longer than 75 years.");
        setAlignment("Half-orcs inherit a tendency toward chaos from their orc parents and " +
                "are not strongly inclined toward good. Half-orcs raised among orcs and willing to " +
                "live out their lives among them are usually evil.");
        int[] arr={2,0,1,0,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Half-orcs are somewhat larger and bulkier than humans, and they range " +
                "from 5 to well over 6 feet tall.");
        setSpeed(30);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Menacing");
//        features.add("Relentless Endurance");
//        features.add("Savage Attacks");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Orc");
        setLanguages(lang);
    }

    @Override
    public void updateRace() {
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new HalfOrc()).getSizeDescription();
        desc+="\n\n"+(new HalfOrc()).getAge();
        return desc;
    }
}
