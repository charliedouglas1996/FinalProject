package com.example.charlie.finalproject;

public class Classes {
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
            {"barbarian","barb description"},
            {"bard","bard escription"},
            {"cleric","c description"},
            {"druid","d escription"},
            {"fighter","f description"},
            {"monk","m description"},
            {"paladin","p description"},
            {"ranger","ra description"},
            {"rogue","ro description"},
            {"sorcerer","s description"},
            {"warlock","wa description"},
            {"wizard","wi description"}
    };
}