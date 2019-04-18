package com.example.charlie.finalproject.Characters.Races;

import com.example.charlie.finalproject.Characters.Race;

import java.util.ArrayList;

public class Gnome extends Race {

    public static final int RACE=3;
    public Gnome(){
        setAge("Gnomes mature at the same rate humans do, and most are expected to settle down into " +
                "an adult life by around age 40. They can live 350 to almost 500 years.");
        setAlignment("Gnomes are most often good. Those who tend toward law are sages, engineers, " +
                "researchers, scholars, investigators, or inventors. Those who tend toward chaos " +
                "are minstrels, tricksters, wanderers, or fanciful jewelers. Gnomes are " +
                "good-hearted, and even the tricksters among them are more playful than vicious.");
        int[] arr={0,0,1,2,0,0};
        setaSI(arr);
        setDarkvision(true);
        setSize("Small");
        setSizeDescription("Gnomes are between 3 and 4 feet tall and average about 40 pounds");
        setSpeed(25);
        ArrayList<String[]> features=new ArrayList<>();
        String[] featureASI={"Ability Score Increase","Your Intelligence score increases by 2, and your Constitution score increases by 1.\n"};
        features.add(featureASI);
        String[] featureLanguage={"Languages","You can speak, read, and write Common and Gnomish. The Gnomish language, which uses the " +
                "Dwarvish script, is renowned for its technical treatises and its catalogs of knowledge about the natural world.\n"};
        features.add(featureLanguage);
        String[] featureDarkvision={"Darkvision","Accustomed to life underground, you have superior vision in dark and dim " +
                "conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as " +
                "if it were dim light. You can’t discern color in darkness, only shades of gray.\n"};
        features.add(featureDarkvision);
        String[] feature1={"Gnome Cunning","You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.\n"};
        features.add(feature1);
        String[] feature2={"Gnome Cunning","Whenever you make an Intelligence (History) check related " +
                "to magic items, alchemical objects, or technological devices, you can add 4, instead of your regular modifier.\n"};
        features.add(feature2);
        String[] feature3={"Tinker","You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend " +
                "1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases to " +
                "function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use " +
                "your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to " +
                "three such devices active at a time. When you create a device, choose one of the following options: \nClockwork " +
                "Toy: This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When " +
                "placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It " +
                "makes noises as appropriate to the creature it represents. \nFire Starter: The device produces a miniature flame, " +
                "which you can use to light a candle, torch, or campfire. Using the device requires your action. \nMusic Box: When " +
                "opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches the song’s " +
                "end or when it is closed.\n"};
        features.add(feature3);
        setFeatures(features);
        ArrayList<String> lang=new ArrayList<>();
        lang.add("Common");
        lang.add("Gnomish");
        setLanguages(lang);
    }

    public static String raceDescription() {
        String desc="";
        desc+=Race.raceDescriptions[RACE][1];
        desc+="\n\n"+(new Gnome()).getSizeDescription();
        desc+="\n\n"+(new Gnome()).getAge();
        return desc;
    }
    @Override
    public String getName() {
        return Race.raceDescriptions[RACE][0];
    }
}
