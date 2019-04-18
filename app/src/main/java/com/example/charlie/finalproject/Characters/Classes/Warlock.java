package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Warlock extends Classs {
    public static final int CLASS=10;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Warlock(){
        setHitDice(8);
        ArrayList<String> profs=new ArrayList<>();
        profs.add("LightArmor");
        setWeaponProficiencies(profs);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("SimpleWeapon");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,0,0,1,1};
        setSavingThrows(saves);
        int[] abScores={8,13,14,12,10,15};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                1,//2 arcana
                0,//3 athletics
                0,//4 deception
                1,//5 history
                0,//6 insight
                0,//7 intimidation
                0,//8 investigation
                0,//9 medicine
                0,//10 nature
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
        equipment.add("Scholar's pack");
        equipment.add("Dagger");
        equipment.add("Dagger");
        equipment.add("Shortsword");
        equipment.add("Crossbow, light");
        equipment.add("Component pouch");
        equipment.add("Leather armor");
        setEquipment(equipment);
        //Features: Otherworldly Patron, Pact Magic

        ArrayList<String[]> features= new ArrayList<>();
        String[] feature2={"Otherworldly Patron","You have made a pact with a fiend from the lower planes of existence, a being whose aims are evil, even if you strive against those aims. Such beings desire the corruption or destruction of all things, ultimately including you. " +
                "Fiends powerful enough to forge a pact include demon lords, archdevils, pit fiends and, balors that are especially mighty"};
        features.add(feature2);
        String[] feature1={"Pact Magic","Your arcane research and the magic bestowed on you by your patron have given you facility with spells" +
                "\n" +
                "Cantrips: You know two cantrips, Eldritch Blast, and Mage Hand. Cantrips can be cast as many times as you would like and do not expend spell slots" +
                "\n" +
                "Spell Slots: You have one spell slot to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest." +
                "\n" +
                "Spells: You know two 1st‑level spells, Charm Person, and Burning Hands." +
                "Spellcasting Ability: Charisma is your spellcasting ability for your warlock spells, so you use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a warlock spell you cast and when making an attack roll with one" +
                "\n" +
                "Spellcasting Focus: You can use your component pouch as a spellcasting focus for your warlock spells"};
        features.add(feature1);

        setFeatures(features);

        //Spells: Eldritch Blast, and Mage Hand
        ArrayList<String[]> cantrips=new ArrayList<>();
        String[] cantrip1={spellList[0][1],"Evocation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 120 feet\n" +
                "Components: V, S\n" +
                "Duration: Instantaneous\n" +
                "A beam of crackling energy streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 force damage.\n"};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][2],"Conjuration cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 30 feet \n" +
                "Components: V, S \n" +
                "Duration: 1 minute\n" +
                "A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand vanishes if it is ever more than 30 feet away from you or if you cast this spell again.\n" +
                "You can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each time you use it.\n" +
                "The hand can’t attack, activate magic items, or carry more than 10 pounds."};
        cantrips.add(cantrip2);
        setCantrips(cantrips);

        //Spells: Charm Person, and Burning Hands
        ArrayList<String[]> spells=new ArrayList<>();
        String[] spell1={spellList[1][1],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet \n" +
                "Components: V, S \n" +
                "Duration: 1 hour\n" +
                "You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you"};
        spells.add(spell1);
        String[] spell2={spellList[1][0],"1st-level evocation\n" +
                "Casting Time: 1 action \n" +
                "Range: Self (15-foot cone) \n" +
                "Components: V, S \n" +
                "Duration: Instantaneous\n" +
                "As you hold your hands with thumbs touching and fingers spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 fire damage on a failed save, or half as much damage on a successful one.\n" +
                "The fire ignites any flammable objects in the area that aren’t being worn or carried."};
        spells.add(spell2);
        setSpells(spells);
    }
    public final static String[][] spellList={
            {
                "Chill Touch" ,
                "Eldritch Blast" ,
                "Mage Hand" ,
                "Minor Illusion" ,
                "Poison Spray" ,
                "Prestidigitation" ,
                "True Strike"
            },
            {
                "Burning Hands",
                "Charm Person" ,
                "Command",
                "Comprehend Languages" ,
                "Expeditious Retreat" ,
                "Hellish Rebuke" ,
                "Illusory Script" ,
                "Protection from Evil and Good" ,
                "Unseen Servant"
            }
    };
}
