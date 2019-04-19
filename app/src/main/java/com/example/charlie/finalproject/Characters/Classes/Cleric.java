package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Cleric extends Classs {
    public static final int CLASS=2;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Cleric(){
        setHitDice(8);
        ArrayList<String> aProfs=new ArrayList<>();
        aProfs.add("Light Armor");
        aProfs.add("Medium Armor");
        aProfs.add("Heavy Armor");
        aProfs.add("Shields");
        setArmorProficiencies(aProfs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Simple Weapons");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,0,0,1,1};
        setSavingThrows(saves);
        int[] abScores={13,8,14,12,15,10};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                0,//2 arcana
                0,//3 athletics
                0,//4 deception
                0,//5 history
                1,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                0,//10 nature
                0,//11 perception
                0,//12 performance
                0,//13 persuasion
                1,//14 religion
                0,//15 sleight of hand
                0,//16 stealth
                0,//17 survival
        };
        setSkills(skills);
        ArrayList<String> equipment=new ArrayList<>();
        equipment.add("Mace");
        equipment.add("Light Crossbow");
        equipment.add("Chainmail");
        equipment.add("Shield");
        equipment.add("Holy Symbol");
        equipment.add("Explorer's Pack");
        setEquipment(equipment);
        setSpellSlots(2);

        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Spellcasting","As a conduit for divine power, you can cast cleric spells\n" +
                "Cantrips: You know three cantrips, Light, Mending, and Sacred Flame. Cantrips can be cast as many times as you would like and do not expend spell slots\n" +
                "Spell Slots: You have two spell slots to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest.\n" +
                "Spells: You have six 1st‑level spells prepared, Bless, Cure Wounds, Guiding Bolt, Inflict wounds, Healing Word and Sanctuary.\n" +
                "Spellcasting Ability: Wisdom is your spellcasting ability for your cleric spells. The power of your spells comes from your devotion to your deity. You use your Wisdom whenever a cleric spell refers to your spellcasting ability. In addition, you use your Wisdom modifier when setting the saving throw DC for a cleric spell you cast and when making an attack roll with one\n" +
                "Spellcasting Focus: You can use a holy symbol as a spellcasting focus for your cleric spells"};
        features.add(feature1);
        String[] feature2={"Divine Domain","The god you worship is of the Life domain. The Life domain focuses on the vibrant positive energy—one of the fundamental forces of the universe—that sustains all life. The gods of life promote vitality and health through healing the sick and wounded, caring for those in need, and driving away the forces of death and undeath."};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String[]> cantrips=new ArrayList<>();
        // Light, Mending, and Sacred Flame
        String[] cantrip1={spellList[0][1],"Evocation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: Touch\n" +
                "Components: V, M (a firefly or phosphorescent moss) \n" +
                "Duration: 1 hour\n" +
                "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.\n" +
                "If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the spell."};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][2],"Transmutation cantrip\n" +
                "Casting Time: 1 minute\n" +
                "Range: Touch\n" +
                "Components: V, S, M (two lodestones) \n" +
                "Duration: Instantaneous\n" +
                "This spell repairs a single break or tear in an object you touch, such as a broken chain link, two halves of a broken key, a torn cloak, or a leaking wineskin. As long as the break or tear is no larger than 1 foot in any dimension, you mend it, leaving no trace of the former damage.\n" +
                "This spell can physically repair a magic item or construct, but the spell can’t restore magic to such an object."};
        cantrips.add(cantrip2);
        String[] cantrip3={spellList[0][4],"Evocation cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 60 feet \n" +
                "Components: V, S \n" +
                "Duration: Instantaneous\n" +
                "Flame-like radiance descends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving throw."};
        cantrips.add(cantrip3);
        setCantrips(cantrips);

        ArrayList<String[]> spells=new ArrayList<>();
        //Spells: Bless, Cure Wounds, Guiding Bolt, and Sanctuary
        String[] spell1={spellList[1][1],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: V, S, M (a sprinkling of holy water) \n" +
                "Duration: Concentration, up to 1 minute\n" +
                "You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw."};
        spells.add(spell1);
        String[] spell2={spellList[1][4],"1st-level evocation\n" +
                "Casting Time: 1 action \n" +
                "Range: Touch \n" +
                "Components: V, S \n" +
                "Duration: Instantaneous\n" +
                "A creature you touch regains a number of hit points equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs."};
        spells.add(spell2);
        String[] spell3={spellList[1][8],"1st-level evocation\n" +
                "Casting Time: 1 action \n" +
                "Range: 120 feet \n" +
                "Components: V, S \n" +
                "Duration: 1 round\n" +
                "A flash of light streaks toward a creature of your choice within range. Make a ranged spell attack against the target. On a hit, the target takes 4d6 radiant damage, and the next attack roll made against this target before the end of your next turn has advantage, thanks to the mystical dim light glittering on the target until then"};
        spells.add(spell3);
        String[] spell4={spellList[1][13],"1st-level abjuration\n" +
                "Casting Time: 1 bonus action\n" +
                "Range: 30 feet\n" +
                "Components: V, S, M (a small silver mirror) \n" +
                "Duration: 1 minute\n" +
                "You ward a creature within range against attack. Until the spell ends, any creature who targets the warded creature with an attack or a harmful spell must first make a Wisdom saving throw. On a failed save, the creature must choose a new target or lose the attack or spell. This spell doesn’t protect the warded creature from area effects, such as the explosion of a fireball.\n" +
                "If the warded creature makes an attack or casts a spell that affects an enemy creature, this spell ends."};
        spells.add(spell4);
        setSpells(spells);
    }
    public final static String[][] spellList={
            {
                "Guidance" ,
                "Light" ,
                "Mending" ,
                "Resistance" ,
                "Sacred Flame" ,
                "Spare the Dying" ,
                "Thaumaturgy"
            },
            {
                "Bane" ,
                "Bless" ,
                "Command" ,
                "Create or Destroy Water" ,
                "Cure Wounds" ,
                "Detect Evil and Good" ,
                "Detect Magic" ,
                "Detect Poison and Disease" ,
                "Guiding Bolt" ,
                "Healing Word" ,
                "Inflict Wounds" ,
                "Protection from Evil and Good" ,
                "Purify Food and Drink" ,
                "Sanctuary" ,
                "Shield of Faith"
            }
    };
}
