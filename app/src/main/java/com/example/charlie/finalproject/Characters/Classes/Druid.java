package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Druid extends Classs {
    public static final int CLASS=3;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Druid(){
        setHitDice(8);

        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        aProfs.add("Medium Armor");
        aProfs.add("Shields");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Clubs");
        wProfs.add("Daggers" );
        wProfs.add("Darts" );
        wProfs.add("Javelins" );
        wProfs.add("Maces" );
        wProfs.add("Quarterstaves" );
        wProfs.add("Scimitars" );
        wProfs.add("Sickles" );
        wProfs.add("Slings" );
        wProfs.add("Spears");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,0,1,1,0};
        setSavingThrows(saves);
        int[] abScores={10,13,14,12,15,8};
        setAbilityScores(abScores);

        int[] skills={
                0,//0 acrobatics
                1,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                0,//4 deception
                0,//5 history
                0,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                1,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                0,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Quarterstaff");
        equipment.add("Leather armor");
        equipment.add("Shield");
        equipment.add("Druidic focus");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        //Features: Spellcasting, Druidic
        //Spells:

        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Spellcasting","Drawing on the divine essence of nature itself, you can cast spells to shape that essence to your will." +
                "\n" +
                "Cantrips: You know two cantrips, Druidcraft, and Shillelagh. Cantrips can be cast as many times as you would like and do not expend spell slots" +
                "\n" +
                "Spell Slots: You have two spell slots to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest." +
                "\n" +
                "Spells: You know four 1st‑level spells, Goodberry, Charm Person, Animal Friendship, and Healing Word.\n" +
                "Spellcasting Ability: Wisdom is your spellcasting ability for your druid spells, since your magic draws upon your devotion and attunement to nature. You use your Wisdom whenever a spell refers to your spellcasting ability. In addition, you use your Wisdom modifier when setting the saving throw DC for a druid spell you cast and when making an attack roll with one." +
                "\n" +
                "Spellcasting Focus: You can use a druidic focus as a spellcasting focus for your druid spells"};
        features.add(feature1);
        String[] feature2={"Druidic","You know Druidic, the secret language of druids. You can speak the language and use it to leave hidden" +
                "messages. You and others who know this language automatically spot such a message. " +
                "Others spot the message’s presence with a successful DC 15 Wisdom (Perception) check but can’t decipher it without magic."};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String[]> cantrips=new ArrayList<>();
        // Druidcraft, and Shillelagh
        String[] cantrip1={spellList[0][0],"Transmutation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: V, S\n" +
                "Duration: Instantaneous\n" +
                "Whispering to the spirits of nature, you create one of the following effects within range:\n" +
                "• You create a tiny, harmless sensory effect that predicts what the weather will be at your location for the next 24 hours. The effect might manifest as a golden orb for clear skies, a cloud for rain, falling snowflakes for snow, and so on. This effect persists for 1 round.\n" +
                "• You instantly make a flower blossom, a seed pod open, or a leaf bud bloom." +
                "• You create an instantaneous, harmless sensory effect, such as falling leaves, a puff of wind, the sound of a small animal, or the faint odor of skunk. The effect must fit in a 5-foot cube.\n" +
                "• You instantly light or snuff out a candle, a torch, or a small campfire."};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][6],"Transmutation cantrip\n" +
                "Casting Time: 1 bonus action\n" +
                "Range: Touch\n" +
                "Components: V, S, M (mistletoe, a shamrock leaf, and a club or quarterstaff) \n" +
                "Duration: 1 minute\n" +
                "The wood of a club or quarterstaff you are holding is imbued with nature’s power. For the duration, you can use your spellcasting ability instead of Strength for the attack and damage rolls of melee attacks using that weapon, and the weapon’s damage die becomes a d8. The weapon also becomes magical, if it isn’t already. The spell ends if you cast it again or if you let go of the weapon."};
        cantrips.add(cantrip2);
        setCantrips(cantrips);
//
        ArrayList<String[]> spells=new ArrayList<>();
//        Spells: Goodberry, Charm Person, Animal Friendship, and Healing Word
        String[] spell1={spellList[1][9],"1st-level transmutation\n" +
                "Casting Time: 1 action\n" +
                "Range: Touch\n" +
                "Components: V, S, M (a sprig of mistletoe) \n" +
                "Duration: Instantaneous\n" +
                "Up to ten berries appear in your hand and are infused with magic for the duration. A creature can use its action to eat one berry. Eating a berry restores 1 hit point, and the berry provides enough nourishment to sustain a creature for one day.\n" +
                "The berries lose their potency if they have not been consumed within 24 hours of the casting of this spell."};
        spells.add(spell1);
        String[] spell2={spellList[1][1],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet \n" +
                "Components: V, S \n" +
                "Duration: 1 hour\n" +
                "You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you"};
        spells.add(spell2);
        String[] spell3={spellList[1][0],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: V, S, M (a morsel of food)\n" +
                "Duration: 24 hours\n" +
                "This spell lets you convince a beast that you mean it no harm. Choose a beast that you can see within range. It must see and hear you. If the beast's Intelligence is 4 or higher, the spell fails. Otherwise, the beast must succeed on a Wisdom saving throw or be charmed by you for the spell's duration. If you or one of your companions harms the target, the spells ends."};
        spells.add(spell3);
        String[] spell4={spellList[1][10],"1st-level evocation\n" +
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
                "Druidcraft" ,
                "Guidance" ,
                "Mending" ,
                "Poison Spray" ,
                "Produce Flame" ,
                "Resistance" ,
                "Shillelagh"
            },
            {
                "Animal Friendship" ,
                "Charm Person" ,
                "Create or Destroy Water" ,
                "Cure Wounds" ,
                "Detect Magic" ,
                "Detect Poison and Disease" ,
                "Entangle" ,
                "Faerie Fire" ,
                "Fog Cloud" ,
                "Goodberry" ,
                "Healing Word" ,
                "Jump" ,
                "Longstrider" ,
                "Purify Food and Drink" ,
                "Speak with Animals" ,
                "Thunderwave"
            }
    };
}
