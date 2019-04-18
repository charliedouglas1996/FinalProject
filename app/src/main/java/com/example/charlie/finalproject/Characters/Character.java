package com.example.charlie.finalproject.Characters;

import java.util.ArrayList;

public class Character {
    private Race race;
    private Classs classs;
    private int armorClass;
    private int hitPointMax;
    private int hitPointCurrent;
    private int hitPointTemp;
    private int[] abilityScores;
    private int[] savingThrows;
    private int[] skill;
    private String name;
    private ArrayList<String[]> features;
    private ArrayList<String> languages;
    private ArrayList<String> weaponProficiencies;
    private ArrayList<String> armorProficiencies;
    private ArrayList<String> toolProficiencies;
    private ArrayList<String> equipment;
    private ArrayList<String> spells;
    private ArrayList<String> cantrips;

    public Character(Race r,Classs c,String n){
        race=r;
        classs=c;
        name=n;
        abilityScores=addArrays(race.getaSI(),classs.getAbilityScores());
    }

    public static int[] addArrays(int[] ar1, int[] ar2){
        int[] result=new int[ar1.length];
        if(ar1.length!=ar2.length) return result;
        for(int i=0;i<result.length;i++){
            result[i]=ar1[i]+ar2[i];
        }
        return result;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPointMax() {
        return hitPointMax;
    }

    public int getHitPointCurrent() {
        return hitPointCurrent;
    }

    public int getHitPointTemp() {
        return hitPointTemp;
    }

    public int[] getSavingThrows() {
        return savingThrows;
    }

    public int[] getSkill() {
        return skill;
    }

    public ArrayList<String[]> getFeatures() {
        return features;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public ArrayList<String> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public ArrayList<String> getArmorProficiencies() {
        return armorProficiencies;
    }

    public ArrayList<String> getToolProficiencies() {
        return toolProficiencies;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    public ArrayList<String> getCantrips() {
        return cantrips;
    }

    public String getName() {
        return name;
    }

    public static int getModifier(int a){
        if(a<10)
            a--;
        return (a-10)/2;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }

    public int[] getAbilityScores() {
        return abilityScores;
    }
    public int getAbilityScore(int i) {
        if(i<abilityScores.length)
            return abilityScores[i];
        else return -100;
    }

    public int getStrength(){
        return (abilityScores[STRENGTH]-10)/2;
    }

    public int getIntelligence(){
        return abilityScores[INTELLIGENCE]-10;
    }

    public int getDexterity(){
        return abilityScores[DEXTERITY]-10;
    }

    public int getConstitution(){
        return abilityScores[CONSTITUTION]-10;
    }

    public int getWisdom(){
        return abilityScores[WISDOM]-10;
    }

    public int getCharisma(){
        return abilityScores[CHARISMA]-10/2;
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
            "Acrobatics",//0
            "Animal Handling",//1
            "Arcana",//2
            "Athletics",//3
            "Deception",//4
            "History",//5
            "Insight",//6
            "Intimidation",//7
            "Investigation",//8
            "Medicine",//9
            "Nature",//10
            "Perception",//11
            "Performance",//12
            "Persuasion",//13
            "Religion",//14
            "Sleight of Hand",//15
            "Stealth",//16
            "Survival"//17
    };//

    public static final String[] armor={
            "LightArmor",
            "MediumArmor",
            "HeavyArmor",
            "Shield"
    };

    public static final String[][][] Weapons={// Weapons[0:Simple,1:Martial][0:Melee,1:Ranged][Weapon]
            {//Simple Weapons
                {//Simple Melee
                    "Club" ,
                    "Dagger" ,
                    "Greatclub" ,
                    "Handaxe" ,
                    "Javelin" ,
                    "Light hammer" ,
                    "Mace" ,
                    "Quarterstaff" ,
                    "Sickle" ,
                    "Spear"
                },
                {//Simple Ranged
                    "Crossbow, light" ,
                    "Dart" ,
                    "Shortbow" ,
                    "Sling"
                },
            },
            {//Martial Weapons
                {//Martial Melee
                    "Battleaxe" ,
                    "Flail" ,
                    "Glaive" ,
                    "Greataxe" ,
                    "Greatsword" ,
                    "Halberd" ,
                    "Lance" ,
                    "Longsword" ,
                    "Maul" ,
                    "Morningstar" ,
                    "Pike" ,
                    "Rapier" ,
                    "Scimitar" ,
                    "Shortsword" ,
                    "Trident" ,
                    "War pick" ,
                    "Warhammer" ,
                    "Whip"
                },
                {//Martial Ranged
                    "Blowgun" ,
                    "Crossbow, hand" ,
                    "Crossbow, heavy" ,
                    "Longbow" ,
                    "Net"
                }
            }
    };
    public final int STRENGTH=0;
    public final int DEXTERITY=1;
    public final int CONSTITUTION=2;
    public final int INTELLIGENCE=3;
    public final int WISDOM=4;
    public final int CHARISMA=5;

    // dwarves have +1 to hp
    // dwarves have extra weapon and tool proficiencies
    // elves are proficient in perception, and some weapons
    // elves know 1 wizard cantrip
    // gnomes are proficient in tinker's tools
    // half elves are proficient in 2 skills
    // half-orcs are proficient in intimidation
    // tieflings know thaumaturgy

    // Barbarians and Monks have different AC
    // Fighters have +1 AC
    // Monks can use dex instead of STR for monk weapons
    // rangers and sorcerers know draconic
}
