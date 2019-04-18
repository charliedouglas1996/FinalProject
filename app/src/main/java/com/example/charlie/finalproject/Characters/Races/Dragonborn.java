package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Dragonborn extends Race {

    public static final int RACE=0;
    private int ancestry;

    public Dragonborn(int ancestry){
        setAge("Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of " +
                "a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80.");
        setAlignment("Dragonborn tend to extremes, making a conscious choice for one side or the other in the cosmic war " +
                "between good and evil. Most dragonborn are good, but those who side with evil can be terrible villains.");
        int[] arr={2,0,0,0,0,1};
        setaSI(arr);
        setDarkvision(false);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Strength score increases by 2, and your Charisma score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Draconic. Draconic is thought to be " +
                "one of the oldest languages and is often used in the study of magic. The language sounds harsh to most other " +
                "creatures and includes numerous hard consonants and sibilants\n"};
        features.add(featureLanguage);
        String[] feature1={"Draconic Ancestry","Your ancestors were "+ancestries[ancestry][0]+" dragons\n"};
        features.add(feature1);
        String[] feature2={"Breath Weapon","You can use your action to exhale destructive energy. " +
                "When you use your breath weapon, each creature in a"+ancestries[ancestry][2]+"  make " +
                "a "+ancestries[ancestry][3]+" saving throw. The DC for this saving throw equals 10 +" +
                " your Constitution modifier. A creature takes 2d6 "+ancestries[ancestry][1]+"damage" +
                " on a failed save, and half as much damage on a successful one" +
                ". After you use your breath weapon, you can’t use it again until you complete a short or long rest.\n"};
        features.add(feature2);
        String[] feature3={"Damage Resistance","You have resistance to "+ancestries[ancestry][1]+" damage. (Damage is halved)"};
        features.add(feature3);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Draconic");
        setLanguages(lang);
        setSize("Medium");
        setSizeDescription("Dragonborn are taller and heavier than humans, standing well over 6 feet tall and averaging almost 250 pounds.");
        setSpeed(30);
        setResistance(ancestries[ancestry][1]);
        this.ancestry=ancestry;
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Dragonborn(0)).getSizeDescription();
        desc+="\n\n"+(new Dragonborn(0)).getAge();
        desc+="\n\nDraconic Ancestry- You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry list. Your breath weapon and damage resistance are determined by the dragon type";
        return desc;
    }

    public static final String[][] ancestries={
            {"Black","Acid","5 by 30 ft. line","Dexterity"},
            {"Blue","Lightning","5 by 30 ft. line","Dexterity"},
            {"Brass","Fire","5 by 30 ft. line","Dexterity"},
            {"Bronze","Lightning","5 by 30 ft. line","Dexterity"},
            {"Copper","Acid","5 by 30 ft. line","Dexterity"},
            {"Gold","Fire","15 ft. cone","Dexterity"},
            {"Green","Poison","15 ft. cone","Constitution"},
            {"Red","Fire","15 ft. cone","Dexterity"},
            {"Silver","Cold","15 ft. cone","Constitution"},
            {"White","Cold","15 ft. cone","Constitution"}
    };

    public int getAncestry() {
        return ancestry;
    }

    public static String[] getAncestries(){
        String[] arr=new String[ancestries.length];
        for(int i=0;i<ancestries.length;i++){
            arr[i]=ancestries[i][0]+" - "+ancestries[i][1];
        }
        return arr;
    }

    public void setAncestry(int ancestry) {
        this.ancestry = ancestry;
    }

    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
