package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Monk extends Classs {
    public static final int CLASS=5;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Monk(){
        setHitDice(8);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("SimpleWeapon");
        wProfs.add("Shortsword");
        setWeaponProficiencies(wProfs);
        int[] saves={1,1,0,0,0,0};
        setSavingThrows(saves);
        int[] skills={
                1,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                0,//4 deception
                0,//5 history
                0,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                0,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                1,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Shortsword");
        equipment.add("Explorer's Pack");
        for(int i=0;i<10;i++)
            equipment.add("Dart");
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Unarmored Defense","While you are wearing no armor and not wielding a shield, your AC equals 10 + your Dexterity modifier + your Wisdom modifier."};
        features.add(feature1);
        String[] feature2={"Martial Arts","Your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don’t have the two-handed or heavy property.\n" +
                "You gain the following benefits while you are unarmed or wielding only monk weapons and you aren’t wearing armor or wielding a shield:\n" +
                "• You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes and monk weapons.\n" +
                "• You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon.\n" +
                "• When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action, assuming you haven’t already taken a bonus action this turn"};
        features.add(feature2);
        setFeatures(features);
        int[] abScores={12,15,14,10,13,8};
        setAbilityScores(abScores);
    }
}
