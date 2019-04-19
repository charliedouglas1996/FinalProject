package com.example.charlie.finalproject.Characters;

import com.example.charlie.finalproject.Characters.Classes.Barbarian;
import com.example.charlie.finalproject.Characters.Classes.Bard;
import com.example.charlie.finalproject.Characters.Classes.Cleric;
import com.example.charlie.finalproject.Characters.Classes.Druid;
import com.example.charlie.finalproject.Characters.Classes.Fighter;
import com.example.charlie.finalproject.Characters.Classes.Monk;
import com.example.charlie.finalproject.Characters.Classes.Paladin;
import com.example.charlie.finalproject.Characters.Classes.Ranger;
import com.example.charlie.finalproject.Characters.Classes.Rogue;
import com.example.charlie.finalproject.Characters.Classes.Sorcerer;
import com.example.charlie.finalproject.Characters.Classes.Wizard;
import com.example.charlie.finalproject.Characters.Races.Dragonborn;
import com.example.charlie.finalproject.Characters.Races.Dwarf;
import com.example.charlie.finalproject.Characters.Races.Elf;
import com.example.charlie.finalproject.Characters.Races.Gnome;
import com.example.charlie.finalproject.Characters.Races.HalfElf;
import com.example.charlie.finalproject.Characters.Races.HalfOrc;
import com.example.charlie.finalproject.Characters.Races.Halfling;
import com.example.charlie.finalproject.Characters.Races.Human;
import com.example.charlie.finalproject.Characters.Races.Tiefling;
import com.example.charlie.finalproject.MainActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class Character implements Serializable {
    private Race race;
    private Classs classs;
    private int armorClass;
    private int hitPointMax;
    private int hitPointCurrent;
    private int hitPointTemp;
    private int[] abilityScores;
    private int[] skill;
    private String name;
    private ArrayList<String> languages;
    private ArrayList<String> weaponProficiencies;
    private ArrayList<String> armorProficiencies;
    private ArrayList<String> toolProficiencies;
    private ArrayList<String[]> spells;
    private ArrayList<String[]> cantrips;
    int spellcastingAbility;

    private static Character character;
    private static ArrayList<Character> characters;

    public static Character getCharacter() {
        return character;
    }
    public static Character getCharacter(int i) {
        return characters.get(i);
    }

    public static ArrayList<Character> getCharacters() {
        if(characters==null){
            ArrayList<Character> list=new ArrayList<>();
            list.add(new Character(new Dwarf(),new Barbarian(),"Gorg"));
            list.add(new Character(new Gnome(),new Bard(),"Lanscan"));
            list.add(new Character(new Tiefling(),new Cleric(),"Rejest"));
            list.add(new Character(new Elf(),new Druid(),"Leyketh"));
            list.add(new Character(new Human(),new Fighter(),"Cerpy"));
            list.add(new Character(new Human(),new Monk(),"Ob"));
            list.add(new Character(new Halfling(),new Paladin(),"Mika"));
            list.add(new Character(new HalfElf(),new Ranger(),"Vix'Olio"));
            list.add(new Character(new HalfElf(),new Rogue(),"Vox'Aldin"));
            list.add(new Character(new Dragonborn(),new Sorcerer(),"Biterius"));
            list.add(new Character(new HalfOrc(),new Barbarian(),"Djof"));
            list.add(new Character(new Human(),new Wizard(),"Laceb"));
            characters=list;
        }
        return characters;
    }

    public static ArrayList<String> getCharacterStrings() {
        if(characters==null){
            getCharacters();
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<characters.size();i++){
            list.add(characters.get(i).getName()+" - "+characters.get(i).getRace().getName()+" "+characters.get(i).getClasss().getName());
        }
        return list;
    }
    public static void addCharacter(Character c){
        getCharacters();
        characters.add(0,c);
    }

    public static void setCharacter(Character character) {
        Character.character = character;
    }


    public void setHitPointCurrent(int hitPointCurrent) {
        this.hitPointCurrent = hitPointCurrent;
    }

    public Character(Race r, Classs c, String n){
        race=r;
        classs=c;
        name=n;
        abilityScores=addArrays(race.getaSI(),classs.getAbilityScores());
        hitPointMax=c.getHitDice()+this.getConstitution();
        hitPointTemp=0;
        languages=race.getLanguages();
        weaponProficiencies=classs.getWeaponProficiencies();
        armorProficiencies=classs.getArmorProficiencies();
        toolProficiencies=classs.getToolProficiencies();
        if(classs.getName().equals("Barbarian")){
            armorClass=10+getDexterity()+getConstitution();
        } else if(classs.getName().equals("Bard")){
            armorClass=11+getDexterity();
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=CHARISMA;
        } else if(classs.getName().equals("Cleric")){
            armorClass=16+2;
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=WISDOM;
        } else if(classs.getName().equals("Druid")){
            armorClass=11+2+getDexterity();
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=WISDOM;
        } else if(classs.getName().equals("Fighter")){
            armorClass=16+2+1;
        } else if(classs.getName().equals("Monk")){
            armorClass=10+getDexterity()+getWisdom();
        } else if(classs.getName().equals("Paladin")){
            armorClass=16+2;
        } else if(classs.getName().equals("Ranger")){
            armorClass=11+getDexterity();
            languages.add(langauges[10]);
        } else if(classs.getName().equals("Rogue")){
            armorClass=11+getDexterity();
        } else if(classs.getName().equals("Sorcerer")){
            armorClass=10+getDexterity();
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=CHARISMA;
            languages.add(langauges[10]);
        } else if(classs.getName().equals("Warlock")){
            armorClass=11+getDexterity();
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=CHARISMA;
        } else if(classs.getName().equals("Wizard")){
            armorClass=10+getDexterity();
            spells=classs.getSpells();
            cantrips=classs.getCantrips();
            spellcastingAbility=INTELLIGENCE;
        }
        skill=classs.getSkills();
        if(race.getName().equals("Dwarf")){
            hitPointMax++;
            if(!getWeaponProficiencies().contains("Battleaxes")&&!getWeaponProficiencies().contains("Martial Weapons"))
                weaponProficiencies.add("Battleaxes");
            if(!getWeaponProficiencies().contains("Handaxes")&&!getWeaponProficiencies().contains("Simple Weapons"))
                weaponProficiencies.add("Handaxes");
            if(!getWeaponProficiencies().contains("Light Hammers")&&!getWeaponProficiencies().contains("Simple Weapons"))
                weaponProficiencies.add("Light Hammers");
            if(!getWeaponProficiencies().contains("Warhammers")&&!getWeaponProficiencies().contains("Martial Weapons"))
                weaponProficiencies.add("Warhammers");
            if(toolProficiencies==null)
                toolProficiencies= new ArrayList<>();
            toolProficiencies.add("Smith's tools");
        } else if(race.getName().equals("Elf")){
            if(skill[7]==0)
                skill[7]=1;
            if(cantrips==null)
                cantrips=new ArrayList<>();
            String[] cantrip1={"Fire Bolt","Evocation cantrip\n" +
                    "Casting Time: 1 action\n" +
                    "Range: 120 feet\n" +
                    "Components: V, S\n" +
                    "Duration: Instantaneous\n" +
                    "You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. " +
                    "On a hit, the target takes 1d10 fire damage. A flammable object hit by this spell ignites if it isn't being " +
                    "worn or carried."};
            cantrips.add(cantrip1);
            if(spellcastingAbility==0)
                spellcastingAbility=INTELLIGENCE;
            if(!getWeaponProficiencies().contains("Longswords")&&!getWeaponProficiencies().contains("Martial Weapons"))
                weaponProficiencies.add("Longswords");
            if(!getWeaponProficiencies().contains("Shortswords")&&!getWeaponProficiencies().contains("Martial Weapons"))
                weaponProficiencies.add("Shortswords");
            if(!getWeaponProficiencies().contains("Longbows")&&!getWeaponProficiencies().contains("Martial Weapons"))
                weaponProficiencies.add("Longbows");
            if(!getWeaponProficiencies().contains("Shortbows")&&!getWeaponProficiencies().contains("Simple Weapons"))
                weaponProficiencies.add("Shortbows");
        } else if(race.getName().equals("Gnome")){
            if(toolProficiencies==null)
                toolProficiencies= new ArrayList<>();
            toolProficiencies.add("Tinker's tools");
        } else if(race.getName().equals("Half-elf")){
            if(skill[9]==0)
                skill[9]=1;
            if(skill[15]==0)
                skill[15]=1;
            languages.add("Sylvan");
        } else if(race.getName().equals("Half-orc")){
            if(skill[11]==0)
                skill[11]=1;
        } else if(race.getName().equals("Tiefling")){
            if(cantrips==null)
                cantrips=new ArrayList<>();
            String[] cantrip1={"Thaumaturgy","Transmutation cantrip\n" +
                    "Casting Time: 1 action \n" +
                    "Range: 30 feet \n" +
                    "Components: V \n" +
                    "Duration: Up to 1 minute\n" +
                    "You manifest a minor wonder, a sign of supernatural power, within range. You create one of the following magical effects within range:\n" +
                    "• Your voice booms up to three times as loud as normal for 1 minute.\n" +
                    "• You cause flames to flicker, brighten, dim, or change color for 1 minute.\n" +
                    "• You cause harmless tremors in the ground for 1 minute.\n" +
                    "• You create an instantaneous sound that originates from a point of your choice within range, such as a rumble of thunder, the cry of a raven, or ominous whispers.\n" +
                    "• You instantaneously cause an unlocked door or window to fly open or slam shut.\n" +
                    "• You alter the appearance of your eyes for 1 minute.\n" +
                    "If you cast this spell multiple times, you can have up to three of its 1-minute effects active at a time, and you can dismiss such an effect as an action."};
            cantrips.add(cantrip1);
            if(spellcastingAbility==0)
                spellcastingAbility=CHARISMA;
        }
        hitPointCurrent=hitPointMax;

        // elves know 1 wizard cantrip - "Fire Bolt"
        // tieflings know thaumaturgy
    }

    public static int[] addArrays(int[] ar1, int[] ar2){
        int[] result=new int[ar1.length];
        if(ar1.length!=ar2.length) return result;
        for(int i=0;i<result.length;i++){
            result[i]=ar1[i]+ar2[i];
        }
        return result;
    }

    public int getSpellcastingAbility() {
        return spellcastingAbility;
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


    public int[] getSkill() {
        return skill;
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
        return getModifier(abilityScores[STRENGTH]);
    }

    public int getIntelligence(){
        return getModifier(abilityScores[INTELLIGENCE]);
    }

    public int getDexterity(){
        return getModifier(abilityScores[DEXTERITY]);
    }

    public int getConstitution(){
        return getModifier(abilityScores[CONSTITUTION]);
    }

    public int getWisdom(){
        return getModifier(abilityScores[WISDOM]);
    }

    public int getCharisma(){
        return getModifier(abilityScores[CHARISMA]);
    }

    public ArrayList<String[]> getSpells() {
        return spells;
    }

    public ArrayList<String[]> getCantrips() {
        return cantrips;
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

    public static final String[] skillsMod={
            "DEX",//0
            "WIS",//1
            "INT",//2
            "STR",//3
            "CHA",//4
            "INT",//5
            "WIS",//6
            "CHA",//7
            "INT",//8
            "WIS",//9
            "INT",//10
            "WIS",//11
            "CHA",//12
            "CHA",//13
            "INT",//14
            "DEX",//15
            "DEX",//16
            "WIS"//17
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
}
