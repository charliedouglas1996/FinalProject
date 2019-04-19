package com.example.charlie.finalproject.Characters.Classes;

import com.example.charlie.finalproject.Characters.Classs;

import java.util.ArrayList;

public class Wizard extends Classs {
    public static final int CLASS=11;
    @Override
    public String getName() {
        return Classs.classDescriptions[CLASS][0];
    }

    public Wizard(){
        setHitDice(6);
        ArrayList<String> wProfs=new ArrayList<>();
        wProfs.add("Daggers" );
        wProfs.add("Darts" );
        wProfs.add("Quarterstaves" );
        wProfs.add("Slings" );
        wProfs.add("Light Crossbows");
        setWeaponProficiencies(wProfs);
        int[] saves={0,0,0,1,1,0};
        setSavingThrows(saves);
        int[] abScores={8,13,14,15,12,10};
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
        equipment.add("Dagger");
        equipment.add("Explorer's Pack");
        equipment.add("Component pouch");
        equipment.add("Spellbook");
        setEquipment(equipment);

        ArrayList<String[]> features= new ArrayList<>();
        String[] feature1={"Spellcasting","As a student of arcane magic, you have a spellbook containing spells that show the first glimmerings of your true power\n" +
                "Cantrips: You know three cantrips, Ray of Frost, Message, and Prestidigitation. Cantrips can be cast as many times as you would like and do not expend spell slots" +
                "\n" +
                "Spell Slots: You have two spell slots to cast your spells of 1st level (non-cantrips). To cast one of these spells, you must expend a slot of the spell’s level. You regain all expended spell slots when you finish a long rest." +
                "\n" +
                "Spellbook: You have a spellbook containing 4 prepared 1st-level wizard spells, Detect Magic, Mage Armor, Magic Missile, and Sleep. Your spellbook is the repository of the wizard spells you know, except your cantrips, which are fixed in your mind.\n" +
                "Spellcasting Ability: Intelligence is your spellcasting ability for your wizard spells, since you learn your spells through dedicated study and memorization. You use your Intelligence whenever a spell refers to your spellcasting ability. In addition, you use your Intelligence modifier when setting the saving throw DC for a wizard spell you cast and when making an attack roll with one.\n" +
                "Spellcasting Focus: You can use a Component pouch as a spellcasting focus for your wizard spells"};
        features.add(feature1);
        String[] feature2={"Arcane Recovery","You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can recover one expended spell slot."};
        features.add(feature2);
        setFeatures(features);
        ArrayList<String[]> cantrips=new ArrayList<>();
        // Ray of Frost, Message, and Prestidigitation
        String[] cantrip1={spellList[0][11],"Evocation cantrip\n" +
                "Casting Time: 1 action \n" +
                "Range: 60 feet Components: V, S \n" +
                "Duration: Instantaneous\n" +
                "A frigid beam of blue-white light streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, it takes 1d8 cold damage, and its speed is reduced by 10 feet until the start of your next turn."};
        cantrips.add(cantrip1);
        String[] cantrip2={spellList[0][7],"Transmutation cantrip\n" +
                "Casting Time: 1 action\n" +
                "Range: 120 feet\n" +
                "Components: V, S, M (a short piece of copper wire) \n" +
                "Duration: 1 round\n" +
                "You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear.\n" +
                "You can cast this spell through solid objects if you are familiar with the target and know it is beyond the barrier. Magical silence, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn’t have to follow a straight line and can travel freely around corners or through openings."};
        cantrips.add(cantrip2);
        String[] cantrip3={spellList[0][10],"Transmutation cantrip\n" +
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
        cantrips.add(cantrip3);
        setCantrips(cantrips);

        //Spells: Detect Magic, Mage Armor, Magic Missile, and Sleep
        ArrayList<String[]> spells=new ArrayList<>();
        String[] spell1={spellList[1][5],"1st-level divination (ritual)\n" +
                "Casting Time: 1 action\n" +
                "Range: Self\n" +
                "Components: V, S\n" +
                "Duration: Concentration, up to 10 minutes\n" +
                "For the duration, you sense the presence of magic within 30 feet of you. If you sense magic in this way, you can use your action to see a faint aura around any visible creature or object in the area that bears magic, and you learn its school of magic, if any.\n" +
                "The spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt."};
        spells.add(spell1);
        String[] spell2={spellList[1][19],"1st-level abjuration\n" +
                "Casting Time: 1 action\n" +
                "Range: Touch\n" +
                "Components: V, S, M (a piece of cured leather) \n" +
                "Duration: 8 hours\n" +
                "You touch a willing creature who isn’t wearing armor, and a protective magical force surrounds it until the spell ends. The target’s base AC becomes 13 + its Dexterity modifier. The spell ends if the target dons armor or if you dismiss the spell as an action"};
        spells.add(spell2);
        String[] spell3={spellList[1][20],"1st-level evocation\n" +
                "Casting Time: 1 action \n" +
                "Range: 120 feet \n" +
                "Components: V, S " +
                "\nDuration: Instantaneous\n" +
                "You create three glowing darts of magical force. Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several."};
        spells.add(spell3);
        String[] spell4={spellList[1][24],"1st-level enchantment\n" +
                "Casting Time: 1 action\n" +
                "Range: 90 feet\n" +
                "Components: V, S, M (a pinch of fine sand, rose petals, or a cricket)\n" +
                "Duration: 1 minute\n" +
                "This spell sends creatures into a magical slumber. Roll 5d8; the total is how many hit points of creatures this spell can affect. Creatures within 20 feet of a point you choose within range are affected in ascending order of their current hit points (ignoring unconscious creatures).\n" +
                "Starting with the creature that has the lowest current hit points, each creature affected by this spell falls unconscious until the spell ends, the sleeper takes damage, or someone uses an action to shake or slap the sleeper awake. Subtract each creature’s hit points from the total before moving on to the creature with the next lowest hit points. A creature’s hit points must be equal to or less than the remaining total for that creature to be affected.\n" +
                "Undead and creatures immune to being charmed aren’t affected by this spell."};
        spells.add(spell4);
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
                "Alarm" ,
                "Burning Hands" ,
                "Charm Person" ,
                "Color Spray" ,
                "Comprehend Languages" ,
                "Detect Magic" ,
                "Disguise Self" ,
                "Expeditious Retreat" ,
                "False Life" ,
                "Feather Fall" ,
                "Find Familiar" ,
                "Floating Disk",
                "Fog Cloud" ,
                "Grease" ,
                "Hideous Laughter" ,
                "Identify" ,
                "Illusory Script" ,
                "Jump" ,
                "Longstrider" ,
                "Mage Armor" ,
                "Magic Missile" ,
                "Protection from Evil and Good" ,
                "Shield" ,
                "Silent Image" ,
                "Sleep" ,
                "Thunderwave" ,
                "Unseen Servant"
            }
    };
}
