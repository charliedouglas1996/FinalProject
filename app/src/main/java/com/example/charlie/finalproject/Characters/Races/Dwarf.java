package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Dwarf extends Race {

    private static final int RACE=1;
    public final int hpIncrease=1;

    public Dwarf(){
        setAge("Dwarves mature at the same rate as humans, but they’re considered young until " +
                "they reach the age of 50. On average, they live about 350 years.");
        setAlignment("Most dwarves are lawful, believing firmly in the benefits of a well-ordered" +
                " society. They tend toward good as well, with a strong sense of fair play and a " +
                "belief that everyone deserves to share in the benefits of a just order.");
        int[] arr={0,0,2,0,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Dwarves stand between 4 and 5 feet tall and average about 150 pounds.");
        setSpeed(25);
        ArrayList<String> features=new ArrayList<>();
//        features.add("Dwarven resilience");
//        features.add("Dwarven Combat training");
//        features.add("Tool Proficiency");
//        features.add("StoneCunning");
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Dwarvish");
        setLanguages(lang);
        setResistance("Poison");
    }

    @Override
    public void updateRace() {
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Dwarf()).getSizeDescription();
        desc+="\n\n"+(new Dwarf()).getAge();
        desc+="\n\nTool Proficiency. You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or mason’s tools.";
        return desc;
    }

    public static String[] toolOptions(){
        String[] arr=new String[3];
        arr[0]= Character.tools[14];
        arr[1]= Character.tools[2];
        arr[2]= Character.tools[11];
        return arr;
    }
}
