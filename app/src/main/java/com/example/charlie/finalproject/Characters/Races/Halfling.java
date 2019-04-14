package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Halfling extends Race {


    private static final int RACE=4;
    public Halfling(){
        setAge("A halfling reaches adulthood at the age of 20 and generally lives into the middle " +
                "of his or her second century.");
        setAlignment("Most halflings are lawful good. As a rule, they are good-hearted and kind, " +
                "hate to see others in pain, and have no tolerance for oppression. They are also " +
                "very orderly and traditional, leaning heavily on the support of their community " +
                "and the comfort of their old ways.");
        int[] arr={0,2,0,0,0,1};
        setaSI(arr);
        setDarkvision(false);
        setSize("Small");
        setSizeDescription("Halflings average about 3 feet tall and weigh about 40 pounds.");
        setSpeed(25);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Lucky");
//        features.add("Brave");
//        features.add("Halfling Nimbleness");
//        features.add("Naturally Stealthy");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Halfling");
        setLanguages(lang);
    }

    @Override
    public void updateRace() {
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Halfling()).getSizeDescription();
        desc+="\n\n"+(new Halfling()).getAge();
        return desc;
    }
}
