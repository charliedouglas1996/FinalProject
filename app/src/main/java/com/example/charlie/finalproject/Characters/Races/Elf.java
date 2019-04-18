package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Classes.Wizard;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Elf extends Race {

    public static final int RACE=2;
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
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Dexterity score increases by 2, your Intelligence score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common, "+language+", and Elvish. " +
                "Elvish is fluid, with subtle intonations and intricate grammar. Elven literature is rich and varied, " +
                "and their songs and poems are famous among other races. Many bards learn their language so they can " +
                "add Elvish ballads to their repertoires.\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Accustomed to twilit forests and the night sky, you have " +
                "superior vision in dark and dim conditions. You can see in dim light within 60 feet of you " +
                "as if it were bright light, and in darkness as if it were dim light. You can’t discern " +
                "color in darkness, only shades of gray\n"};
        features.add(featureDarkvision);
        String[] feature1={"Fey Ancestry","You have advantage on saving throws against being charmed, and magic can’t put you to sleep.\n"};
        features.add(feature1);
        String[] feature2={"Keen senses","You have proficiency in the Perception skill.\n"};
        features.add(feature2);
        String[] feature3={"Trance","Elves don’t need to sleep. Instead, they meditate deeply, remaining " +
                "semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) " +
                "While meditating, you can dream after a fashion; such dreams are actually mental " +
                "exercises that have become reflexive through years of practice. After resting in this" +
                " way, you gain the same benefit that a human does from 8 hours of sleep.\n"};
        features.add(feature3);
        String[] feature4={"Elf Weapon Training","You have proficiency with the longsword, shortsword, shortbow, and longbow\n"};
        features.add(feature4);
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
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }

}
