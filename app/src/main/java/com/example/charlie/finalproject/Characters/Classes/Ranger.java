package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Ranger extends Classs {
    public static final int CLASS=7;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Ranger(){
        setHitDice(10);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        aProfs.add("Medium Armor");
        aProfs.add("Shields");

        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Simple Weapons");
        wProfs.add("Martial Weapons");
        setWeaponProficiencies(wProfs);
        int[] saves={1,1,0,0,0,0};
        setSavingThrows(saves);
        int[] skills={
                0,//0 acrobatics
                1,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                0,//4 deception
                0,//5 history
                0,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                1,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                1,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Shortsword");
        equipment.add("Shortsword");
        equipment.add("Longbow");
        equipment.add("Leather armor");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Favored Enemy","You have significant experience studying, tracking, hunting, and even talking to a certain type of enemy.\n" +
                "The type of your favored enemy is dragons. You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence checks to recall information about them.\n" +
                "You also learn Draconic"};
        features.add(feature1);
        String[] feature2={"Natural Explorer","You are particularly familiar with one type of natural environment and are adept at traveling and surviving in such regions. Your favoured terrain is forest." +
                " When you make an Intelligence or Wisdom check related to your favored terrain, add 2 to your roll if you are already proficient in that skill.\n" +
                "While traveling for an hour or more in your favored terrain, you gain the following benefits:\n" +
                "• Difficult terrain doesn’t slow your group’s travel.\n" +
                "• Your group can’t become lost except by magical\n" +
                "means.\n" +
                "• Even when you are engaged in another activity\n" +
                "while traveling (such as foraging, navigating, or\n" +
                "tracking), you remain alert to danger.\n" +
                "• If you are traveling alone, you can move stealthily\n" +
                "at a normal pace.\n" +
                "• When you forage, you find twice as much food as\n" +
                "you normally would.\n" +
                "• While tracking other creatures, you also learn\n" +
                "their exact number, their sizes, and how long ago they passed through the area."};
        features.add(feature2);

        setFeatures(features);
        int[] abScores={8,15,14,10,15,8};
        setAbilityScores(abScores);
    }
}
