package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Rogue extends Classs {
    public static final int CLASS=8;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Rogue(){
        setHitDice(8);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Simple Weapons");
        wProfs.add("Hand Crossbows");
        wProfs.add("Longswords");
        wProfs.add("Rapiers");
        wProfs.add("Shortswords");
        setWeaponProficiencies(wProfs);
        ArrayList<String> tProfs=new ArrayList<>();
        tProfs.add("Thieves’ tools");
        setToolProficiencies(tProfs);
        int[] saves={0,1,0,1,0,0};
        setSavingThrows(saves);
        int[] skills={
                1,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                1,//4 deception
                0,//5 history
                0,//6 insight
                0,//7 intimidation
                2,//8 investigation
                0,//9 medicine
                0,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                2,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Rapier");
        equipment.add("Dagger");
        equipment.add("Dagger");
        equipment.add("Shortbow");
        equipment.add("Leather armor");
        equipment.add("Thieves’ tools");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Thieves’ Cant","During your rogue training you learned thieves’ cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves’ cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly.\n" +
                "In addition, you understand a set of secret signs and symbols used to convey short, simple messages,such as whether an area is dangerous or the territory of a thieves’ guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run."};
        features.add(feature1);
        String[] feature2={"Sneak Attack","you know how to strike subtly and exploit a foe’s distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll.\n" +
                "You don’t need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn’t incapacitated, and you don’t have disadvantage on the attack roll.."};
        features.add(feature2);
        setFeatures(features);
        int[] abScores={8,15,14,10,13,12};
        setAbilityScores(abScores);
    }
}
