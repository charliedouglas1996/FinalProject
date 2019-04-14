package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Human extends Race {

    private static final int RACE=7;
    public Human(String language){
        setAge("Humans reach adulthood in their late teens and live less than a century.");
        setAlignment("Humans tend toward no particular alignment. The best and the worst are found among them.");
        int[] arr={1,1,1,1,1,1};
        setaSI(arr);
        setDarkvision(false);
        setSize("Medium");
        setSizeDescription("Humans vary widely in height and build, from barely 5 feet to well over 6 feet tall.");
        setSpeed(30);
        ArrayList<String> features=new ArrayList<>();
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add(language);
        setLanguages(lang);
    }

    @Override
    public void updateRace() {
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Human("")).getSizeDescription();
        desc+="\n\n"+(new Human("")).getAge();
        desc+="\n\nLanguages: You can speak, read, and write Common and one extra language of your choice:";
        return desc;
    }

    public static String[] getLanguageList(){
        String[] arr=new String[Character.langauges.length-1];
        for(int i=0, j=0;i<arr.length;i++,j++){
            if(i==0){
                arr[i]=Character.langauges[++j];
            }
            else arr[i]=Character.langauges[j];
        }
        return arr;
    }
}
