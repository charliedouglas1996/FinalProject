package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Human extends Race {

    public static final int RACE=7;
    public Human(String language){
        setAge("Humans reach adulthood in their late teens and live less than a century.");
        setAlignment("Humans tend toward no particular alignment. The best and the worst are found among them.");
        int[] arr={1,1,1,1,1,1};
        setaSI(arr);
        setDarkvision(false);
        setSize("Medium");
        setSizeDescription("Humans vary widely in height and build, from barely 5 feet to well over 6 feet tall.");
        setSpeed(30);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your ability scores each increase by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and "+language+"\n"};
        features.add(featureLanguage);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add(language);
        setLanguages(lang);
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
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
