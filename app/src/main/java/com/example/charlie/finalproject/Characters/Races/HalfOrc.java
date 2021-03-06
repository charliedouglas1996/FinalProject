package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class HalfOrc extends Race {

    public static final int RACE=6;
    public HalfOrc(){
        setAge("Half-orcs mature a little faster than humans, reaching adulthood around age " +
                "14. They age noticeably faster and rarely live longer than 75 years.");
        setAlignment("Half-orcs inherit a tendency toward chaos from their orc parents and " +
                "are not strongly inclined toward good. Half-orcs raised among orcs and willing to " +
                "live out their lives among them are usually evil.");
        int[] arr={2,0,1,0,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Half-orcs are somewhat larger and bulkier than humans, and they range " +
                "from 5 to well over 6 feet tall.");
        setSpeed(30);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Strength score increases by 2, and your Constitution score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Orc. Orc is a harsh, grating " +
                "language with hard consonants. It has no script of its own but is written in the Dwarvish script.\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Thanks to your orc blood, you have superior vision in dark and dim conditions. " +
                "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim " +
                "light. You can’t discern color in darkness, only shades of gray.\n"};
        features.add(featureDarkvision);
        String[] feature1={"Menacing","You gain proficiency in the Intimidation skill.\n"};
        features.add(feature1);
        String[] feature2={"Relentless Endurance","When you are reduced to 0 hit points but not " +
                "killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.\n"};
        features.add(feature2);
        String[] feature3={"Savage Attacks","When you score a critical hit with a melee weapon attack, " +
                "you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit\n"};
        features.add(feature3);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Orc");
        setLanguages(lang);
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new HalfOrc()).getSizeDescription();
        desc+="\n\n"+(new HalfOrc()).getAge();
        return desc;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
