package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Paladin extends Classs {
    public static final int CLASS=6;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Paladin(){
        setHitDice(10);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        aProfs.add("Medium Armor");
        aProfs.add("Heavy Armor");
        aProfs.add("Shields");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Simple Weapons");
        wProfs.add("Martial Weapons");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,0,0,1,1};
        setSavingThrows(saves);
        int[] abScores={15,8,13,10,12,14};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                1,//3 athletics
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
                1,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Longsword");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Javelin");
        equipment.add("Chainmail");
        equipment.add("Shield");
        equipment.add("Holy Symbol");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Divine Sense","The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces. Until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity. Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated, as with the hallow spell. " +
                "You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses."};
        features.add(feature1);
        String[] feature2={"Lay on Hands","Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal 5. " +
                "As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool. " +
                "Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one. " +
                "This feature has no effect on undead and constructs"};
        features.add(feature2);
        setFeatures(features);
    }
}
