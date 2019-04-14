package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Dragonborn extends Race {

    private static final int RACE=0;
    private int ancestry;

    public Dragonborn(int ancestry){
        setAge("Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of " +
                "a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80.");
        setAlignment("Dragonborn tend to extremes, making a conscious choice for one side or the other in the cosmic war " +
                "between good and evil. Most dragonborn are good, but those who side with evil can be terrible villains.");
        int[] arr={2,0,0,0,0,1};
        setaSI(arr);
        setDarkvision(false);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Draconic Ancestry");
//        features.add("Breath Weapon");
//        features.add("Damage Resistance");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Draconic");
        setLanguages(lang);
        setSize("Medium");
        setSizeDescription("Dragonborn are taller and heavier than humans, standing well over 6 feet tall and averaging almost 250 pounds.");
        setSpeed(30);
        setResistance(ancestries[ancestry][1]);
        this.ancestry=ancestry;
    }

    @Override
    public void updateRace() {
        //breath weapon save DC is based on Constitution
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Dragonborn(0)).getSizeDescription();
        desc+="\n\n"+(new Dragonborn(0)).getAge();
        desc+="\n\nDraconic Ancestry- You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry list. Your breath weapon and damage resistance are determined by the dragon type";
        return desc;
    }

    public static final String[][] ancestries={
            {"Black","Acid","5 by 30 ft. line","Dexterity"},
            {"Blue","Lightning","5 by 30 ft. line","Dexterity"},
            {"Brass","Fire","5 by 30 ft. line","Dexterity"},
            {"Bronze","Lightning","5 by 30 ft. line","Dexterity"},
            {"Copper","Acid","5 by 30 ft. line","Dexterity"},
            {"Gold","Fire","15 ft. cone","Dexterity"},
            {"Green","Poison","15 ft. cone","Constitution"},
            {"Red","Fire","15 ft. cone","Dexterity"},
            {"Silver","Cold","15 ft. cone","Constitution"},
            {"White","Cold","15 ft. cone","Constitution"}
    };

    public int getAncestry() {
        return ancestry;
    }

    public static String[] getAncestries(){
        String[] arr=new String[ancestries.length];
        for(int i=0;i<ancestries.length;i++){
            arr[i]=ancestries[i][0]+" - "+ancestries[i][1];
        }
        return arr;
    }

    public void setAncestry(int ancestry) {
        this.ancestry = ancestry;
    }
}
