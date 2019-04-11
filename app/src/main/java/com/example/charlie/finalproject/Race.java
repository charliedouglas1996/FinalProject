package com.example.charlie.finalproject;

public class Race {
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
            {"dragonborn","dr description"},
            {"dwarf","dw escription"},
            {"Elf","e description"},
            {"Gnome","g description"},
            {"Halfling","ha description"},
            {"Half-elf","h-e description"},
            {"Half-Orc","h-o description"},
            {"Human","hu description"},
            {"Tiefling","t description"}
    };
}
