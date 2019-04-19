package com.example.charlie.finalproject.Characters;

import java.util.ArrayList;

public abstract class Classs {

    private int level=1;
    private int proficiencyBonus=2;
    private int hitDice;
    private int[] abilityScores;
    private int[] savingThrows;
    private int[] skills;
    private ArrayList<String[]> features;
    private ArrayList<String[]> spells;
    private int spellSlots;
    private ArrayList<String[]> cantrips;
    private ArrayList<String> weaponProficiencies;
    private ArrayList<String> armorProficiencies;
    private ArrayList<String> toolProficiencies;
    private ArrayList<String> equipment;

    public int getLevel() {
        return level;
    }

    public int getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(int spellSlots) {
        this.spellSlots = spellSlots;
    }

    public abstract String getName();

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public ArrayList<String[]> getCantrips() {
        return cantrips;
    }

    public void setCantrips(ArrayList<String[]> cantrips) {
        this.cantrips = cantrips;
    }

    public ArrayList<String> getToolProficiencies() {
        return toolProficiencies;
    }

    public void setToolProficiencies(ArrayList<String> toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
    }

    public ArrayList<String[]> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<String[]> spells) {
        this.spells = spells;
    }

    public ArrayList<String> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public void setWeaponProficiencies(ArrayList<String> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public int[] getSkills() {
        return skills;
    }

    public void setSkills(int[] skills) {
        this.skills = skills;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<String> getArmorProficiencies() {
        return armorProficiencies;
    }

    public void setArmorProficiencies(ArrayList<String> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public int[] getAbilityScores() {
        return abilityScores;
    }

    public void setAbilityScores(int[] abilityScores) {
        this.abilityScores = abilityScores;
    }

    public int[] getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(int[] savingThrows) {
        this.savingThrows = savingThrows;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public ArrayList<String[]> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<String[]> features) {
        this.features = features;
    }

    public static final String[][] classQuestionString={
            {"How do you react to danger?", "I don't mind charging in","I deal with it from a safe distance"},//0
            {"Are you more strong or nimble?","Strong","Nimble"},//1
            {"What do you rely on most?","Skills","Magic"},//2
            {"Are you good with the gods?","I've got 'em on speed dial","Meh"},//3
            {"Do you live for Kung-Fu movies?","Bruce Lee is my idol","Not so much"},//4
            {"How good are you at keeping quiet?","*silence*","I don't know, I've never tried it!"},//5
            {"I want...","Flexibility","One or two supernatural nukes","Magical stamina for days"},//6
            {"I live my faith by...","Delivering righteous justice", "Channeling the nature and power of my god"},//7
            {"Are you prone to flying into a rage?","Raaaaaahhhhrrr!!!","No more than the next adventurer"},//8
            {"MONK","MONK","MONK"},//9 MONK
            {"Would you risk your life for a good story?","I think not","You know it!"},//10
            {"Do you keep any pets?","My best friends are ferocious beasts","What, like a gerbil?"},//11
            {"BARD","BARD","BARD"},//12 BARD
            {"Are you the academic type?","I'm a bookworm","Not necessarily"},//13
            {"SORCERER","SORCERER","SORCERER"},//14 SORCERER
            {"WARLOCK","WARLOCK","WARLOCK"},//15 WARLOCK
            {"PALADIN","PALADIN","PALADIN"},//16 PALADIN
            {"CLERIC","CLERIC","CLERIC"},//17 CLERIC
            {"BARBARIAN","BARBARIAN","BARBARIAN"},//18 BARBARIAN
            {"How cool would it be to turn into a bear?","So cool!","I have allergies"},//19
            {"I'm deadly because...","I'm a born schemer","I'm a master hunter","I'm experienced in the art of combat"},//20
            {"RANGER","RANGER","RANGER"},//21 RANGER
            {"I'm trained to kill using...","My brain. And maybe poison","Anything that slices, skewers, or smashes"},//22
            {"WIZARD","WIZARD","WIZARD"},//23 WIZARD
            {"Are you religious?","Define religious","No, my power comes from righteous lute solos","No, my power comes from within"},//24
            {"DRUID","DRUID","DRUID"},//25 DRUID
            {"FIGHTER","FIGHTER","FIGHTER"},//26 FIGHTER
            {"My schemes usually involve...","Cloak and dagger tactics","Allying myself with dark and strange elements"},//27
            {"ROGUE","ROGUE","ROGUE"},//28 ROGUE
            {"Where does your power come from?","My connection with nature","The gods","A creepy, otherworldly pact"}//29
    };

    public static final int[][] classQuestionsInt={
            {1,2},//0
            {3,4},//1
            {5,6},//2
            {7,8},//3
            {9,10},//4
            {11,12},//5
            {13,14,15},//6
            {16,17},//7
            {18,19},//8
            {0,0},//9 MONK
            {20,12},//10
            {21,22},//11
            {0,0},//12 BARD
            {23,24},//13
            {0,0},//14 SORCERER
            {0,0},//15 WARLOCK
            {0,0},//16 PALADIN
            {0,0},//17 CLERIC
            {0,0},//18 BARBARIAN
            {25,26},//19
            {27,21,26},//20
            {0,0},//21 RANGER
            {28,26},//22
            {0,0},//23 WIZARD
            {29,12,14},//24
            {0,0},//25 DRUID
            {0,0},//26 FIGHTER
            {28,15},//27
            {0,0},//28 ROGUE
            {25,17,15}//29
    };

    public static final String[][] classDescriptions={
            {"Barbarian","A fierce warrior of a primitive background who can enter a battle rage. " +
                    "\n\nBarbarians wear little to no armour, are savage and brutal melee combatants that are incredibly tough to take down when they fly into a combat rage." +
                    "\n\nAn example of a barbarian is Marvel's 'The Incredible Hulk'"},
            {"Bard","An inspiring magician whose power echoes the music of creation. " +
                    "\n\nBards are magical minstrels. They cast spells that buff the party or hinder enemies and are generally the most adapt at both high and low social situations due to their musical entertaining skills." +
                    "\n\nAn example of a bard is Marvel's 'Starlord'"},
            {"Cleric","A priestly champion who wields divine magic in service of a higher power. " +
                    "\n\nClerics are holy healers. Generally clerics are heavily armoured party healers that also serve as melee combatants. Useful in all parties." +
                    "\n\nAn example of a cleric is Game of Thrones' 'Melisandre'"},
            {"Druid","A priest of the Old Faith, wielding the powers of nature - moonlight and plant growth, fire and lightning - and adopting animal forms. " +
                    "\n\nDruids are natural healers or vicious shape shifters. In tune with the wild druids can serve as party healers or take the form of animals to engage in combat. " +
                    "\n\nAn example of a druid is DC's 'Beast Boy'"},
            {"Fighter","A master of martial combat, skilled with a variety of weapons and armors. " +
                    "\n\nFighters are heavily armed and armoured melee or ranged combatants. Trained in all weapons, armour and shields fighters can deal damage, take damage and defend the party. " +
                    "\n\nAn example of a fighter is Marvel's 'Captain America'"},
            {"Monk","A master of martial arts, skilled with fighting hands and martial monk weapons. " +
                    "\n\nMonks are incredibly skilled spiritual warriors that can engage in melee combat. While they won't be doing as much damage as say a Paladin or Fighter they have a massive array of debilitating effects to disrupt enemies." +
                    "\n\nAn example of a monk is Avatar's 'Aang'"},
            {"Paladin","A holy warrior bound to a sacred oath. " +
                    "\n\nHeavily clad in armour Paladins can do some modest healing like a lite-Cleric but focus more on smiting evil through holy spells and melee combat. Additionally, Paladins command respect for many classes in society and make excellent social characters." +
                    "\n\nAn example of a paladin is Marvel's 'Thor'"},
            {"Ranger","A master of ranged combat, one with nature. " +
                    "\n\nRangers are ranged or melee hunters adept at surviving in the wilds. They can cast moderate amount of spells and are especially knowledgable about specific creatures and types of terrain." +
                    "\n\nAn example of a ranger is Lord of the Ring's 'Aragorn'"},
            {"Rogue","A scoundrel and agile warrior who uses stealth and trickery to overcome obstacles and enemies. " +
                    "\n\nRogues are trained (self or otherwise) in underhanded tactics such as sneaking, stealing, picking pockets and locks, disable and setting traps. They fight with guile rather than strength. They can also be a smooth-talker depending on how they are made. Nobody will have a set of skills as diverse as the Rogue." +
                    "\n\nAn example of a rogue is Star Wars' 'Han Solo'"},
            {"Sorcerer","A spellcaster who draws on inherent magic from a gift or bloodline. " +
                    "\n\nSorcerers are natural spell-casters. Where Wizards train Sorcerers have spellcasting in their blood. Their natural abilities also make them naturally good in dealing socially with people." +
                    "\n\nAn example of a sorcerer is Marvel's 'Doctor Strange'"},
            {"Warlock","A wielder of magic that is derived from a bargain with an extraplanar entity. " +
                    "\n\nWhile Sorcerers have spellcasting as a natural ability and Wizards train Warlocks make a pact with a powerful being in exchange for power. This pact is often for good but can also be for evil." +
                    "\n\nAn example of a warlock is DC's 'Green Lantern'"},
            {"Wizard","A scholarly magic-user capable of manipulating the structures of reality. " +
                    "\n\nNobody can match the diversity of a wizards spellbook and years of training. Their spells often make them the most powerful burst damage dealers in combat and their knowledge of Arcane lore and History are useful in many situations." +
                    "\n\nAn example of a wizard is 'Harry Potter'"}
    };
}
