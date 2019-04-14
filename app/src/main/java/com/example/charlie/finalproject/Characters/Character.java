package com.example.charlie.finalproject.Characters;

import java.util.ArrayList;

public class Character {
    private Race race;
    private Classs classs;
    private int armourClass;
    private int hitPointMax;
    private int hitPointCurrent;
    private int hitPointTemp;
    private int[] abilityScores;
    private int[] savingThrows;
    private int[] skill;
    private int[] deathSaves;
    private String name;
    private String alignment;
    private ArrayList<String> proficiencies;
    private ArrayList<String> languages;
    private int age;
    //attacks
    //inventory
    //features
    private ArrayList<String> spells;

    public void Character(Race r,Classs c,String n,int[] ab){
        race=r;
        classs=c;
        name=n;
        abilityScores=ab;
    }

    public static int[] addArrays(int[] ar1, int[] ar2){
        int[] result=new int[ar1.length];
        if(ar1.length!=ar2.length) return result;
        for(int i=0;i<result.length;i++){
            result[i]=ar1[i]+ar2[i];
        }
        return result;
    }


    public static final String[] langauges={
            "Common" ,// 0
            "Dwarvish" ,// 1
            "Elvish" ,// 2
            "Giant" ,// 3
            "Gnomish" ,// 4
            "Goblin" ,// 5
            "Halfling" ,// 6
            "Orc" ,// 7
            "Abyssal" ,// 8
            "Celestial" ,// 9
            "Draconic" ,// 10
            "Deep Speech" ,// 11
            "Infernal" ,// 12
            "Primordial" ,// 13
            "Sylvan", // 14
            "Undercommon"// 15
    };

    public static final String[] tools={
            "Alchemist’s supplies" ,// 1
            "Brewer’s supplies" ,// 2
            "Calligrapher's Supplies" ,// 3
            "Carpenter’s tools" ,// 4
            "Cartographer’s tools" ,// 5
            "Cobbler’s tools" ,// 6
            "Cook’s utensilsn" ,// 7
            "Glassblower’s tools" ,// 8
            "Jeweler’s tools" ,// 9
            "Leatherworker’s tools" ,// 10
            "Mason’s tools" ,// 11
            "Painter’s supplies" ,// 12
            "Potter’s tools" ,// 13
            "Smith’s tools" ,// 14
            "Tinker’s tools",// 15
            "Weaver’s tools" ,// 16
            "Woodcarver’s tools" ,// 17
            "Dice set" ,// 18
            "Playing Card Set" ,// 19
            "Bagpipes" ,// 20
            "Drum" ,// 21
            "Dulcimer" ,// 22
            "Flute" ,// 23
            "Lute" ,// 24
            "Lyre" ,// 25
            "Horn" ,// 26
            "Pan flute" ,// 27
            "Shawm" ,// 28
            "Viol" ,// 29
            "Navigator’s tools" ,// 30
            "Thieves’ tools" ,// 31
            "Vehicles (land or water)"// 32
    };

    public static final String[] abilityScoreNames={
            "Strength",
            "Dexterity",
            "Constitution",
            "Intelligence",
            "Wisdom",
            "Charisma"
    };

    public static final String[] skills={
            "Acrobatics",
            "Animal Handling",
            "Arcana",
            "Athletics",
            "Deception",
            "History",
            "Insight",
            "Intimidation",
            "Investigation",
            "Medicine",
            "Nature",
            "Perception",
            "Performance",
            "Persuasion",
            "Religion",
            "Sleight of Hand",
            "Stealth",
            "Survival"
    };

    // dwarves have +1 to hp
    // dwarves have extra weapon and tool proficiencies
    // elves are proficient in perception, and some weapons
    // elves know 1 wizard cantrip
    // gnomes are proficient in tinker's tools
    // half elves are proficient in 2 skills
    // half-orcs are proficient in intimidation
    // tieflings know thaumaturgy
}
