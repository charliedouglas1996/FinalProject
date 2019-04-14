package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Classes.Wizard;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Elf extends Race {

    private static final int RACE=2;
    public Elf(int cantrip, String language){
        setAge("Although elves reach physical maturity at about the same age as humans, the elven " +
                "understanding of adulthood goes beyond physical growth to encompass worldly " +
                "experience. An elf typically claims adulthood and an adult name around the age of " +
                "100 and can live to be 750 years old.");
        setAlignment("Elves love freedom, variety, and self-expression, so they lean strongly " +
                "toward the gentler aspects of chaos. They value and protect others’ freedom as " +
                "well as their own, and they are more often good than not.");
        int[] arr={0,2,0,1,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Elves range from under 5 to over 6 feet tall and have slender builds.");
        setSpeed(30);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Fey Ancestry");
//        features.add("Keen senses");
//        features.add("Trance");
//        features.add("Elf Weapon Training");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Elvish");
        lang.add(language);
        setLanguages(lang);
        ArrayList<String> spells=new ArrayList<>();
        spells.add(Wizard.spellList[0][cantrip]);
        setSpells(spells);
    }

    @Override
    public void updateRace() {
        // cantrip is int based
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Elf(0,"")).getSizeDescription();
        desc+="\n\n"+(new Elf(0,"")).getAge();
        desc+="\n\nLanguages: You can speak, read, and write Common, Elvish, and one extra language of your choice.";
        return desc;
    }

    public static String[] getLanguageList(){
        String[] arr=new String[Character.langauges.length-2];
        for(int i=0, j=0;i<arr.length;i++,j++){
            if(j==0||j==2){
                arr[i]=Character.langauges[++j];
            }
            else arr[i]=Character.langauges[j];
        }
        return arr;
    }

    public static String cantrip(){
        String can= "Cantrip: You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.";
        return can;
    }

}
