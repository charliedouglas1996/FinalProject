package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Gnome extends Race {

    private static final int RACE=3;
    public Gnome(){
        setAge("Gnomes mature at the same rate humans do, and most are expected to settle down into " +
                "an adult life by around age 40. They can live 350 to almost 500 years.");
        setAlignment("Gnomes are most often good. Those who tend toward law are sages, engineers, " +
                "researchers, scholars, investigators, or inventors. Those who tend toward chaos " +
                "are minstrels, tricksters, wanderers, or fanciful jewelers. Gnomes are " +
                "good-hearted, and even the tricksters among them are more playful than vicious.");
        int[] arr={0,0,1,2,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Small");
        setSizeDescription("Gnomes are between 3 and 4 feet tall and average about 40 pounds");
        setSpeed(25);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Gnome Cunning");
//        features.add("Artificer's Lore");
//        features.add("Tinker");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Gnomish");
        setLanguages(lang);
    }

    @Override
    public void updateRace() {
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Gnome()).getSizeDescription();
        desc+="\n\n"+(new Gnome()).getAge();
        return desc;
    }
}
