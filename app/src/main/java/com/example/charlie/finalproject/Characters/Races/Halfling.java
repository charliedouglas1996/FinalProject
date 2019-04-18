package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Halfling extends Race {


    public static final int RACE=4;
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
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Dexterity score increases by 2, and your Charisma score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Halfling. The " +
                "Halfling language isn’t secret, but halflings are loath to share it with others. They " +
                "write very little, so they don’t have a rich body of literature. Their oral tradition, " +
                "however, is very strong. Almost all halflings speak Common to converse with the people in " +
                "whose lands they dwell or through which they are traveling.\n"};
        features.add(featureLanguage);
        String[] feature1={"Lucky","When you roll a 1 on the d20 for an attack roll, ability check, or " +
                "saving throw, you can reroll the die and must use the new roll.\n"};
        features.add(feature1);
        String[] feature2={"Brave","You have advantage on saving throws against being frightened\n"};
        features.add(feature2);
        String[] feature3={"Halfling Nimbleness","You can move through the space of any creature that is of a size larger than yours\n"};
        features.add(feature3);
        String[] feature4={"Naturally Stealthy","You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you\n"};
        features.add(feature4);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Halfling");
        setLanguages(lang);
    }


    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Halfling()).getSizeDescription();
        desc+="\n\n"+(new Halfling()).getAge();
        return desc;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
