package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Bard extends Classs {
    public static final int CLASS=1;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Bard(){
        setHitDice(8);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("LightArmor");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("SimpleWeapon");
        wProfs.add("Crossbow, hand");
        wProfs.add("Longsword");
        wProfs.add("Rapier");
        wProfs.add("Shortsword");
        setWeaponProficiencies(wProfs);
        ArrayList<String> tProfs=new ArrayList<>();
        tProfs.add("Bagpipes");
        tProfs.add("Drum");
        tProfs.add("Lute");
        setToolProficiencies(tProfs);
        int[] saves={0,1,0,0,0,1};
        setSavingThrows(saves);
        int[] abScores={8,14,13,12,10,15};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                0,//4 deception
                1,//5 history
                0,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                0,//10 nature
                0,//11 perception
                1,//12 performance
                1,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Leather armor");
        equipment.add("Rapier");
        equipment.add("Dagger");
        equipment.add("Lute");
        equipment.add("Entertainer's pack");
        setEquipment(equipment);
        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Spellcasting","You have learned to untangle and reshape the fabric of reality in harmony with your wishes and music. " +
                "Your spells are part of your vast repertoire, magic that you can tune to different situations.\n" +
                "Cantrips: You know two cantrips, Vicious Mockery, and Message. Cantrips can be cast as many times as you would like and do not expend spell slots\n" +
                "Spell Slots: You have two spell slots to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest.\n" +
                "Spells: You know four 1st‑level spells, Bane, Charm Person, Hideous Laughter, and Healing Word.\n" +
                "Spellcasting Ability: Charisma is your spellcasting ability for your bard spells. Your magic comes from the heart and soul you pour into the performance of your music or oration. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a bard spell you cast and when making an attack roll with one" +
                "Spellcasting Focus: You can use a musical instrument as a spellcasting focus for your bard spells"};
        features.add(feature1);
        String[] feature2={"Bardic Inspiration","You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.\n" +
                "Once within the next 10 minutes, the creature can roll the die and add the number rolled to one ability check, attack roll, or saving throw it makes. The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the GM says whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time.\n" +
                "You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a long rest."};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String[]> cantrips=new ArrayList<>();
        // Cantrips: Vicious mockery, Message
        String[] cantrip1={spellList[0][8],"Enchantment cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 60 feet \n" +
                "Components: V\n" +
                "Duration: Instantaneous\n" +
                "You unleash a string of insults laced with subtle enchantments at a creature you can see within range. If the target can hear you (though it need not understand you), it must succeed on a Wisdom saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its next turn"};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][4],"Transmutation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 120 feet\n" +
                "Components: V, S, M (a short piece of copper wire) \n" +
                "Duration: 1 round\n" +
                "You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear.\n" +
                "You can cast this spell through solid objects if you are familiar with the target and know it is beyond the barrier. Magical silence, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn’t have to follow a straight line and can travel freely around corners or through openings."};
        cantrips.add(cantrip2);
        setCantrips(cantrips);

        ArrayList<String[]> spells=new ArrayList<>();
        //Spells: Bane, Charm Person, Hideous Laughter, Healing Word
        String[] spell1={spellList[1][1],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: V, S, M (a drop of blood) \n" +
                "Duration: Concentration, up to 1 minute\n" +
                "Up to three creatures of your choice that you can see within range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the spell ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw"};
        spells.add(spell1);
        String[] spell2={spellList[1][2],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet \n" +
                "Components: V, S \n" +
                "Duration: 1 hour\n" +
                "You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you"};
        spells.add(spell2);
        String[] spell3={spellList[1][9],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: V, S, M (tiny tarts and a feather that is waved in the air)\n" +
                "Duration: Concentration, up to 1 minute\n" +
                "A creature of your choice that you can see within range perceives everything as hilariously funny and falls into fits of laughter if this spell affects it. The target must succeed on a Wisdom saving throw or fall prone, becoming incapacitated and unable to stand up for the duration. A creature with an Intelligence score of 4 or less isn’t affected.\n" +
                "At the end of each of its turns, and each time it takes damage, the target can make another Wisdom saving throw. The target has advantage on the saving throw if it’s triggered by damage. On a success, the spell ends."};
        spells.add(spell3);
        String[] spell4={spellList[1][11],"1st-level evocation\n" +
                "Casting Time: 1 bonus action \n" +
                "Range: 60 feet\n" +
                "Components: V\n" +
                "Duration: Instantaneous\n" +
                "A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs."};
        spells.add(spell4);
        setSpells(spells);
    }
    public final static String[][] spellList={
            {
                "Dancing Lights" ,
                "Light" ,
                "Mage Hand" ,
                "Mending" ,
                "Message" ,
                "Minor Illusion" ,
                "Prestidigitation" ,
                "True Strike" ,
                "Vicious Mockery"
            },
            {
                "Animal Friendship" ,
                "Bane" ,
                "Charm Person" ,
                "Comprehend Languages" ,
                "Cure Wounds" ,
                "Detect Magic" ,
                "Disguise Self" ,
                "Faerie Fire" ,
                "Feather Fall" ,
                "Healing Word" ,
                "Heroism" ,
                "Hideous Laughter" ,
                "Identify" ,
                "Illusory Script" ,
                "Longstrider" ,
                "Silent Image" ,
                "Sleep" ,
                "Speak with Animals" ,
                "Thunderwave" ,
                "Unseen Servant"
            }
    };
}
