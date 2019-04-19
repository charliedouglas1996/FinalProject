package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;
import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Barbarian extends Classs {
    public static final int CLASS=0;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Barbarian(){
        setHitDice(12);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        aProfs.add("Medium Armor");
        aProfs.add("Shields");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Simple Weapons");
        wProfs.add("Martial Weapons");
        setWeaponProficiencies(wProfs);
        ArrayList<String> tProfs=new ArrayList<>();
        int[] saves={1,0,1,0,0,0};
        setSavingThrows(saves);
        int[] abScores={15,13,14,8,12,10};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                1,//3 athletics
                0,//4 deception
                0,//5 history
                0,//6 insight
                1,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                0,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Greataxe");
        equipment.add("Handaxe");
        equipment.add("Handaxe");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Rage","In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. " +
                "While raging, you gain the following benefits if you aren’t wearing heavy armor:\n" +
                "• You have advantage on Strength checks and Strength saving throws.\n" +
                "• When you make a melee weapon attack using Strength, you gain a +2 bonus to the damage roll.\n" +
                "• You have resistance to bludgeoning, piercing, and slashing damage.\n" +
                "If you are able to cast spells, you can’t cast them or concentrate on them while raging. " +
                "Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. " +
                "Once you have raged twice you must finish a long rest before you can rage again."};
        features.add(feature1);
        String[] feature2={"Unarmoured Defense","While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit."};
        features.add(feature2);
        setFeatures(features);
//        int[] skills={
//                0,//0 acrobatics
//                0,//1 animal handling
//                0,//2 arcana
//                0,//3 athletics
//                0,//4 deception
//                0,//5 history
//                0,//6 insight
//                0,//7 intimidation
//                0,//8 investigation
//                0,//9 medicine
//                0,//10 nature
//                0,//11 perception
//                0,//12 performance
//                0,//13 persuasion
//                0,//14 religion
//                0,//15 sleight of hand
//                0,//16 stealth
//                0,//17 survival
//        };
    }
}
