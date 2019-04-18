package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Tiefling extends Race {

    public static final int RACE=8;
    public Tiefling(){
        setAge("Tieflings mature at the same rate as humans but live a few years longer.");
        setAlignment("Tieflings might not have an innate tendency toward evil, but many of them " +
                "end up there. Evil or not, an independent nature inclines many tieflings toward a " +
                "chaotic alignment.");
        int[] arr={0,0,0,1,0,2};
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Tieflings are about the same size and build as humans.");
        setSpeed(30);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Intelligence score increases by 1, and your Charisma score increases by 2.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Infernal.\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Thanks to your infernal heritage, you have superior vision in dark " +
                "and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and " +
                "in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.\n"};
        features.add(featureDarkvision);
        String[] feature1={"Hellish Resistance","You have resistance to fire damage\n"};
        features.add(feature1);
        String[] feature2={"Infernal Legacy","You know the thaumaturgy cantrip.\n"};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Infernal");
        setLanguages(lang);
        setResistance("Fire");
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Tiefling()).getSizeDescription();
        desc+="\n\n"+(new Tiefling()).getAge();
        return desc;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
