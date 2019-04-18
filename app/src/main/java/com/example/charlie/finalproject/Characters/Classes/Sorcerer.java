package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Sorcerer extends Classs {
    public static final int CLASS=9;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Sorcerer(){
        setHitDice(6);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Dagger" );
        wProfs.add("Dart" );
        wProfs.add("Quarterstaff" );
        wProfs.add("Sling" );
        wProfs.add("Crossbow, light");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,1,0,0,1};
        setSavingThrows(saves);
        int[] abScores={8,13,14,12,10,15};
        setAbilityScores(abScores);
        int[] skills={
                0,//0 acrobatics
                0,//1 animal handling
                1,//2 arcana
                0,//3 athletics
                0,//4 deception
                0,//5 history
                0,//6 insight
                1,//7 intimidation
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
        equipment.add("Explorer's pack");
        equipment.add("Crossbow, light");
        equipment.add("Dagger");
        equipment.add("Dagger");
        equipment.add("Component pouch");
        setEquipment(equipment);
        //Features: Spellcasting, Sorcerous Origin
        //Spells:

        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Spellcasting","An event in your past, or in the life of a parent or ancestor, left an indelible mark on you, infusing you with arcane magic. This font of magic, whatever its origin, fuels your spells" +
                "\n" +
                "Cantrips: You know four cantrips, Chill Touch, Dancing Lights, Minor Illusion, and Prestidigitation. Cantrips can be cast as many times as you would like and do not expend spell slots" +
                "\n" +
                "Spell Slots: You have two spell slots to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest." +
                "\n" +
                "Spells: You know two 1st‑level spells, Shield, and Magic Missile." +
                "Spellcasting Ability: Charisma is your spellcasting ability for your sorcerer spells, since the power of your magic relies on your ability to project your will into the world. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a sorcerer spell you cast and when making an attack roll with one\n" +
                "Spellcasting Focus: You can use a Component pouch as a spellcasting focus for your sorcerer spells"};
        features.add(feature1);
        String[] feature2={"Sorcerous Origin","Your innate magic comes from draconic magic that was mingled with your blood or that of your ancestors. Most often, sorcerers with this origin trace their descent back to a mighty sorcerer of ancient times who made a bargain with a dragon or who might even have claimed a dragon parent. Some of these bloodlines are well established in the world, but most are obscure. Any given sorcerer could be the first of a new bloodline, as a result of a pact or some other exceptional circumstance" +
                "You can speak, read, and write Draconic. Additionally, whenever you make a Charisma check when interacting with dragons, add 2 if you are proficient with the skill"};
        features.add(feature2);
        setFeatures(features);

        // Chill Touch, Dancing Lights, Minor Illusion, and Prestidigitation
        ArrayList<String[]> cantrips=new ArrayList<>();
        String[] cantrip1={spellList[0][1],"Necromancy cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 120 feet\n" +
                "Components: V, S \n" +
                "Duration: 1 round\n" +
                "You create a ghostly, skeletal hand in the space of a creature within range. Make a ranged spell attack against the creature to assail it with the chill of the grave. On a hit, the target takes 1d8 necrotic damage, and it can’t regain hit points until the start of your next turn. Until then, the hand clings to the target.\n" +
                "If you hit an undead target, it also has disadvantage on attack rolls against you until the end of your next turn"};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][2],"Evocation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 120 feet\n" +
                "Components: V, S, M (a bit of phosphorus or wychwood, or a glowworm) \n" +
                "Duration: Concentration, up to 1 minute\n" +
                "You create up to four torch-sized lights within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius.\n" +
                "As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within 20 feet of another light created by this spell, and a light winks out if it exceeds the spell’s range."};
        cantrips.add(cantrip2);
        String[] cantrip3={spellList[0][8],"Illusion cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 30 feet\n" +
                "Components: S, M (a bit of fleece) \n" +
                "Duration: 1 minute\n" +
                "You create a sound or an image of an object within range that lasts for the duration. The illusion also ends if you dismiss it as an action or cast this spell again.\n" +
                "If you create a sound, its volume can range from a whisper to a scream. It can be your voice, someone else’s voice, a lion’s roar, a beating of drums, or any other sound you choose. The sound continues unabated throughout the duration, or you can make discrete sounds at different times before the spell ends.\n" +
                "If you create an image of an object—such as a chair, muddy footprints, or a small chest—it must be no larger than a 5-foot cube. The image can’t create sound, light, smell, or any other sensory effect. Physical interaction with the image reveals it to be an illusion, because things can pass through it.\n" +
                "If a creature uses its action to examine the sound or image, the creature can determine that it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a creature discerns the illusion for what it is, the illusion becomes faint to the creature."};
        cantrips.add(cantrip3);
        String[] cantrip4={spellList[0][10],"Transmutation cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 10 feet \n" +
                "Components: V, S \n" +
                "Duration: Up to 1 hour\n" +
                "This spell is a minor magical trick that novice spellcasters use for practice. You create one of the following magical effects within range:" +
                "• You create an instantaneous, harmless sensory effect, such as a shower of sparks, a puff of wind, faint musical notes, or an odd odor.\n" +
                "• You instantaneously light or snuff out a candle, a torch, or a small campfire.\n" +
                "• You instantaneously clean or soil an object no larger than 1 cubic foot.\n" +
                "• You chill, warm, or flavor up to 1 cubic foot of nonliving material for 1 hour.\n" +
                "• You make a color, a small mark, or a symbol appear on an object or a surface for 1 hour.\n" +
                "• You create a nonmagical trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.\n" +
                "If you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action."};
        cantrips.add(cantrip4);
        setCantrips(cantrips);

        //Spells: Disguise Self, and Magic Missile
        ArrayList<String[]> spells=new ArrayList<>();
        String[] spell2={spellList[1][5],"1st-level illusion\n" +
                "Casting Time: 1 action \n" +
                "Range: Self \n" +
                "Components: V, S \n" +
                "Duration: 1 hour\n" +
                "You make yourself—including your clothing, armor, weapons, and other belongings on your person— look different until the spell ends or until you use your action to dismiss it. You can seem 1 foot shorter or taller and can appear thin, fat, or in between. You can’t change your body type, so you must adopt a form that has the same basic arrangement of limbs. Otherwise, the extent of the illusion is up to you.\n" +
                "The changes wrought by this spell fail to hold up to physical inspection. For example, if you use this spell to add a hat to your outfit, objects pass through the hat, and anyone who touches it would feel nothing or would feel your head and hair. If you use this spell to appear thinner than you are, the hand of someone who reaches out to touch you would bump into you while it was seemingly still in midair.\n" +
                "To discern that you are disguised, a creature can use its action to inspect your appearance and must succeed on an Intelligence (Investigation) check against your spell save DC."};
        spells.add(spell2);
        String[] spell1={spellList[1][12],"1st-level evocation\n" +
                "Casting Time: 1 action \n" +
                "Range: 120 feet \n" +
                "Components: V, S " +
                "\nDuration: Instantaneous\n" +
                "You create three glowing darts of magical force. Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several."};
        spells.add(spell1);
        setSpells(spells);
    }
    public final static String[][] spellList={
            {
                "Acid Splash" ,
                "Chill Touch" ,
                "Dancing Lights" ,
                "Fire Bolt" ,
                "Light" ,
                "Mage Hand" ,
                "Mending" ,
                "Message" ,
                "Minor Illusion" ,
                "Poison Spray" ,
                "Prestidigitation" ,
                "Ray of Frost" ,
                "Shocking Grasp" ,
                "True Strike"
            },
            {
                "Burning Hands" ,
                "Charm Person" ,
                "Color Spray" ,
                "Comprehend Languages" ,
                "Detect Magic" ,
                "Disguise Self" ,
                "Expeditious Retreat" ,
                "False Life" ,
                "Feather Fall" ,
                "Fog Cloud" ,
                "Jump" ,
                "Mage Armor" ,
                "Magic Missile" ,
                "Shield" ,
                "Silent Image" ,
                "Sleep" ,
                "Thunderwave"
            }
    };
}
