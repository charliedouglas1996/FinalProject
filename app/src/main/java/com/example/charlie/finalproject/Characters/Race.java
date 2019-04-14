package com.example.charlie.finalproject.Characters;

import java.util.ArrayList;

public abstract class Race {

    private int speed;
    private int[] aSI;
    private String age;
    private String alignment;
    private String size;
    private String sizeDescription;
    private ArrayList<String> languages;
    private ArrayList<String> features;
    private ArrayList<String> spells;
    private boolean darkvision;
    private String resistance;

    public abstract void updateRace();

    public static final String[][] raceQuestionString={
            {"Do your people have strong sense of community?", "Yes, we are very close ","No, my people are very disjointed"},//0
            {"Do your people value order or personal freedom?","Order","Freedom"},//1
            {"Are your people of a proud heritage, albeit a relatively difficult to define one?","Yes","No"},//2
            {"Are your people known for great empires or tight-knit communities?","Empires","Communities"},//3
            {"Do your people pursue this freedom at the expense of others?","Yes","No"},//4
            {"Does this pride come from what your people have achieved or acts that your ancestors have done?","Achievements","Ancestors"},//5
            {"TIEFLING","TIEFLING","TIEFLING"},//6 TIEFLING
            {"DWARF","DWARF", "DWARF"},//7 DWARF
            {"HALFLING","HALFLING","HALFLING"},//8 HALFLING
            {"HALF-ORC","HALF-ORC","HALF-ORC"},//9 HALF-ORC
            {"Is illusory magic a cultural staple?","Yes","No"},//10
            {"Are your people social outcasts?","Yes","No"},//11
            {"DRAGONBORN","DRAGONBORN","DRAGONBORN"},//12 DRAGONBORN
            {"GNOME","GNOME","GNOME"},//13 GNOME
            {"ELF","ELF","ELF"},//14 ELF
            {"HALF-ELF","HALF-ELF","HALF-ELF"},//15 HALF-ELF
            {"HUMAN","HUMAN","HUMAN"},//16 HUMAN
    };

    public static final int[][] raceQuestionsInt={
            {1,2},//0
            {3,4},//1
            {5,6},//2
            {7,8},//3
            {9,10},//4
            {11,12},//5
            {0,0},//6 TIEFLING
            {0,0},//7 DWARF
            {0,0},//8 HALFLING
            {0,0},//9 HALF-ORC
            {13,14},//10
            {15,16},//11
            {0,0},//12 DRAGONBORN
            {0,0},//13 GNOME
            {0,0},//14 ELF
            {0,0},//15 HALF-ELF
            {0,0},//16 HUMAN
    };

    public static final String[][] raceDescriptions={
            {"Dragonborn","Dragonborn look very much like dragons standing erect in humanoid form, " +
                    "though they lack wings or a tail."},
            {"Dwarf","Bold and hardy, dwarves are known as skilled warriors, miners, and workers of " +
                    "stone and metal. Dwarves have keen senses, deep intuition, and remarkable resilience."},
            {"Elf","Elves are a magical people of otherworldly grace, living in the world but not entirely part of it." +
                    "Elves have a keen mind and a mastery of at least the basics of magic."},
            {"Gnome","A gnome’s energy and enthusiasm for living shines through every inch of his or her tiny body." +
                    "Gnomes have a natural inventiveness and hardiness."},
            {"Halfling","The diminutive halflings survive in a world full of larger creatures by " +
                    "avoiding notice or, barring that, avoiding offense. Halflings can easily hide " +
                    "from notice, even using other people as cover."},
            {"Half-elf","Half-elves combine what some say are the best qualities of their elf and " +
                    "human parents. Many half-elves, unable to fit into either society, choose lives " +
                    "of solitary wandering or join with other misfits and outcasts in the adventuring life."},
            {"Half-Orc","Half-orcs’ grayish pigmentation, sloping foreheads, jutting jaws, prominent " +
                    "teeth, and towering builds make their orcish heritage plain for all to see."},
            {"Human","Humans are the most adaptable and ambitious people among the common races. " +
                    "Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds."},
            {"Tiefling","Tieflings are derived from human bloodlines, and they still look human. However, " +
                    "their infernal heritage is clear  in their appearance. Tieflings have large horns, " +
                    "thick tails, their canine teeth are sharply pointed, and their eyes are solid . " +
                    "Their skin tones cover the full range of human coloration, but also include various shades of red. "}
    };

    // 0 dragonborn
    // 1 dwarf
    // 2 elf
    // 3 gnome
    // 4 halfling
    // 5 half-elf
    // 6 half-orc
    // 7 human
    // 8 tiefling


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getaSI() {
        return aSI;
    }

    public void setaSI(int[] aSI) {
        this.aSI = aSI;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

    public boolean isDarkvision() {
        return darkvision;
    }

    public void setDarkvision(boolean darkvision) {
        this.darkvision = darkvision;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<String> spells) {
        this.spells = spells;
    }
}
