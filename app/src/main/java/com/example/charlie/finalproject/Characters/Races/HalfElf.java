package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Race;
import static com.example.charlie.finalproject.Characters.Character.addArrays;

import java.util.ArrayList;


public class HalfElf extends Race {

    public static final int RACE=5;
    public HalfElf(){
        int skill1=9;
        int skill2=15;
        int bonus2=1;
        int bonus1=2;
        String language="Sylvan";
        setAge("Half-elves mature at the same rate humans do and reach adulthood around the " +
                "age of 20. They live much longer than humans, however, often exceeding 180 years.");
        setAlignment("Half-elves share the chaotic bent of their elven heritage. They value " +
                "both personal freedom and creative expression, demonstrating neither love of " +
                "leaders nor desire for followers. They chafe at rules, resent others’ demands, " +
                "and sometimes prove unreliable, or at least unpredictable.");
        int[] arr={0,0,0,0,0,2};
        arr[bonus1]+=1;
        arr[bonus2]+=1;
        setaSI(arr);
        setDarkvision(true);
        setSize("Medium");
        setSizeDescription("Half-elves are about the same size as humans, ranging from 5 to 6 feet tall.");
        setSpeed(30);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Charisma score increases by 2, "+
                Character.abilityScoreNames[bonus1]+" and "+Character.abilityScoreNames[bonus2]+" increase by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common, Elvish, and "+language+".\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Thanks to your elf blood, you have superior vision in dark and dim conditions. " +
                "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim " +
                "light. You can’t discern color in darkness, only shades of gray.\n"};
        features.add(featureDarkvision);
        String[] feature1={"Fey Ancestry","You have advantage on saving throws against being charmed, and magic can’t put you to sleep.\n"};
        features.add(feature1);
        String[] feature2={"Skill Versatility","You gain proficiency in "+Character.skills[skill1]+" and "+Character.skills[skill2]+".\n"};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Elvish");
        lang.add(language);
        setLanguages(lang);
    }


    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new HalfElf()).getSizeDescription();
        desc+="\n\n"+(new HalfElf()).getAge();
//        desc+="\n\nLanguages: You can speak, read, and write Common, Elvish, and one extra language of your choice.";
        return desc;
    }

    public static String[] getLanguageList(){
        String[] arr=new String[Character.langauges.length-2];
        for(int i=0, j=0;i<arr.length;i++,j++){
            if(j==0||j==2){
                arr[i]=Character.langauges[++j];
            }
            else arr[i]=Character.langauges[j];
        }
        return arr;
    }

    public static String skillsDescription(){
        String words;
        words="Skill Versatility: You gain proficiency in two skills of your choice";
        return words;
    }

    public static String[] skills(){
        return Character.skills;
    }

    public static String abilityScoreDescription(){
        String words;
        words="Ability Score Increase: Your Charisma score increases by 2, and two other ability scores of your choice increase by 1.";
        return words;
    }

    public static String[] abilityScores(){
        String[] arr=new String[Character.abilityScoreNames.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=Character.abilityScoreNames[i];
        }
        return arr;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}


