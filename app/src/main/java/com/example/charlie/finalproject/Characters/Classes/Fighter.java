package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Fighter extends Classs {
    public static final int CLASS=4;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Fighter(){
        setHitDice(10);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("LightArmor");
        aProfs.add("MediumArmor");
        aProfs.add("HeavyArmor");
        aProfs.add("Shield");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("SimpleWeapon");
        wProfs.add("MartialWeapon");
        setWeaponProficiencies(wProfs);
        int[] saves={1,0,1,0,0,0};
        setSavingThrows(saves);
        int[] abScores={15,8,14,10,13,12};
        setAbilityScores(abScores);
        int[] skills={
                1,//0 acrobatics
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
                0,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("ChainMail");
        equipment.add("Longsword");
        equipment.add("Shield");
        equipment.add("Explorer's Pack");
        equipment.add("Crossbow, light");
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Fighting Style","You adopt a particular style of fighting as your specialty. Your fighting style is Defense:\n" +
                "While you are wearing armor, you gain a +1 bonus to AC."};
        features.add(feature1);
        String[] feature2={"Second Wind","You have a limited well of stamina that you can draw on to protect yourself from harm. " +
                "On your turn, you can use a bonus action to regain hit points equal to 1d10 + 1." +
                " Once you use this feature, you must finish a short or long rest before you can use it again."};
        features.add(feature2);
        setFeatures(features);
    }
}
