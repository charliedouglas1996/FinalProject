package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Tiefling extends Race {

    private static final int RACE=8;
    public Tiefling(){
        setAge("Tieflings mature at the same rate as humans but live a few years longer.");
        setAlignment("Tieflings might not have an innate tendency toward evil, but many of them " +
                "end up there. Evil or not, an independent nature inclines many tieflings toward a " +
                "chaotic alignment.");
        int[] arr={0,0,0,1,0,2};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Tieflings are about the same size and build as humans.");
        setSpeed(30);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Hellish Resistance");
//        features.add("Infernal Legacy");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Infernal");
        setLanguages(lang);
        setResistance("Fire");
    }

    @Override
    public void updateRace() {
//  thaumaturgy
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Tiefling()).getSizeDescription();
        desc+="\n\n"+(new Tiefling()).getAge();
        return desc;
    }
}
