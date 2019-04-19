package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Dwarf extends Race {

    public static final int RACE=1;

    public Dwarf(){
        String tool="Smith’s tools";
        setAge("Dwarves mature at the same rate as humans, but they’re considered young until " +
                "they reach the age of 50. On average, they live about 350 years.");
        setAlignment("Most dwarves are lawful, believing firmly in the benefits of a well-ordered" +
                " society. They tend toward good as well, with a strong sense of fair play and a " +
                "belief that everyone deserves to share in the benefits of a just order.");
        int[] arr={0,0,2,0,1,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Dwarves stand between 4 and 5 feet tall and average about 150 pounds.");
        setSpeed(25);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Constitution score increases by 2, and your Wisdom score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Dwarvish. " +
                "Dwarvish is full of hard consonants and guttural sounds, and those characteristics" +
                " spill over into whatever other language a dwarf might speak.\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Accustomed to life underground, you have superior " +
                "vision in dark and dim conditions. You can see in dim light within 60 feet of you as" +
                " if it were bright light, and in darkness as if it were dim light. You can’t discern" +
                " color in darkness, only shades of gray.\n"};
        features.add(featureDarkvision);
        String[] feature1={"Dwarven resilience","You have advantage on saving throws against poison, and you have resistance against poison damage.\n"};
        features.add(feature1);
        String[] feature2={"Dwarven Combat training","You have proficiency with the battleaxe, handaxe, light hammer, and warhammer\n"};
        features.add(feature2);
        String[] feature3={"Tool Proficiency","You gain proficiency with "+tool+"\n"};
        features.add(feature3);
        String[] feature4={"StoneCunning","Whenever you make an Intelligence (History) check related " +
                "to the origin of stonework, you are considered proficient in the History skill and add " +
                "4 to the check, instead of your normal  bonus.\n"};
        features.add(feature4);
        String[] feature5={"Dwarven Toughness","Your hit point maximum increases by 1, and it increases by 1 every time you gain a level."};
        features.add(feature5);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Dwarvish");
        setLanguages(lang);
        setResistance("Poison");
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Dwarf()).getSizeDescription();
        desc+="\n\n"+(new Dwarf()).getAge();
//        desc+="\n\nTool Proficiency. You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or mason’s tools.";
        return desc;
    }

    public static String[] toolOptions(){
        String[] arr=new String[3];
        arr[0]= Character.tools[14];
        arr[1]= Character.tools[2];
        arr[2]= Character.tools[11];
        return arr;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
