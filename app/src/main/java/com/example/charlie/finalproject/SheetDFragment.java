package com.example.charlie.finalproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SheetDFragment extends Fragment {


    TextView equipmentTV;
    Character character;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_sheet_d, container, false);

        equipmentTV=(TextView)v.findViewById(R.id.equipmentTV);
        character=((SheetActivity)getActivity()).getCharacter();

        ArrayList<String> equipment= new ArrayList<>();
        ArrayList<String> e1=character.getClasss().getEquipment();
        for(int i=0;i<e1.size();i++){
            boolean inInventory=false;
            for (int j=0;j<equipment.size();j++){
                if(equipment.get(j).equals(e1.get(i))){
                    inInventory=true;
                }
            }
            if(!inInventory){
                equipment.add(e1.get(i));
            }
        }

        //change packs
        for (int i=0;i<equipment.size();i++){
            if(equipment.get(i).contains("Pack")){
                if(equipment.get(i).equals("Explorer's Pack")){
                    equipment.remove(i--);
                    equipment.add("Explorer's Pack:\n" +
                            "• backpack\n" +
                            "• bedroll\n"+
                            "• mess kit\n" +
                            "• tinderbox\n" +
                            "• torches (10)\n" +
                            "• rations (10 days)\n" +
                            "• waterskin\n" +
                            "• 50 feet of hempen rope\n");
                }
                if(equipment.get(i).equals("Entertainer's Pack")){
                    equipment.remove(i--);
                    equipment.add("Entertainer's Pack:\n" +
                            "• backpack\n" +
                            "• bedroll\n"+
                            "• costume (2)\n" +
                            "• candle (5)\n" +
                            "• rations (5 days)\n" +
                            "• waterskin\n" +
                            "• disguise kit\n");
                }
                if(equipment.get(i).equals("Scholar's Pack")){
                    equipment.remove(i--);
                    equipment.add("Scholar's Pack:\n" +
                            "• backpack\n" +
                            "• book of lore\n"+
                            "• bottle of ink\n" +
                            "• ink pen\n" +
                            "• parchment (10 sheets)\n" +
                            "• little bag of sand\n" +
                            "• small knife\n");
                }
            }
        }

        for(int i=0;i<equipment.size();i++){
            int count=0;
            for(int j=0;j<e1.size();j++){
                if(e1.get(j).equals(equipment.get(i)))
                    count++;
            }
            if(count>1){
                equipment.set(i,equipment.get(i)+" ("+count+")");
            }
        }

        String tab="       - ";
        int prof=character.getClasss().getProficiencyBonus();
        int strDam=character.getStrength();
        int dexDam=character.getDexterity();
        for(int i=0;i<equipment.size()-1;i++){
            if(equipment.get(i).contains("Greataxe")){
                int finDam=strDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Martial melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d12+" +finDam+" slashing\n"+
                        tab+"5ft. reach");
            } else
            if(equipment.get(i).contains("Handaxe")){
                int finDam=strDam;
                if(character.getClasss().equals("Monk"))
                    finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d6+" +finDam+" slashing\n"+
                        tab+"5ft. reach\n"+
                        tab+"20/60 ft. range");

            } else
            if(equipment.get(i).contains("Javelin")){
                int finDam=strDam;
                if(character.getClasss().equals("Monk"))
                    finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d8+" +finDam+" piercing\n"+
                        tab+"5ft. reach\n"+
                        tab+"30/120 ft. range");

            } else
            if(equipment.get(i).contains("Rapier")){
                int finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Martial melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d8+" +finDam+" piercing\n"+
                        tab+"5ft. reach");

            } else
            if(equipment.get(i).contains("Dagger")){
                int finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d4+" +finDam+" piercing\n"+
                        tab+"5ft. reach\n"+
                        tab+"20/60 ft. range");

            } else
            if(equipment.get(i).contains("Mace")){
                int finDam=strDam;
                if(character.getClasss().equals("Monk"))
                    finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d6+" +finDam+" bludgeoning\n"+
                        tab+"5ft. reach");

            } else
            if(equipment.get(i).contains("Light Crossbow")){
                int finDam=dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple ranged weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d8+" +finDam+" piercing\n"+
                        tab+"80/320 ft. range");

            } else
            if(equipment.get(i).contains("Quarterstaff")){
                int finDam=strDam;
                if(character.getClasss().equals("Monk"))
                    finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"One-handed: 1d8+" +finDam+" bludgeoning\n"+
                        tab+"Two-handed: 1d10+" +finDam+" bludgeoning\n"+
                        tab+"5ft. reach");

            } else
            if(equipment.get(i).contains("Longsword")){
                int finDam=strDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Martial melee weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"One-handed: 1d8+" +finDam+" slashing\n"+
                        tab+"Two-handed: 1d10+" +finDam+" slashing\n"+
                        tab+"5ft. reach");

            } else
            if(equipment.get(i).contains("Dart")){
                int finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple ranged weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d4+" +finDam+" piercing\n"+
                        tab+"20/60 ft. range");

            } else
            if(equipment.get(i).contains("Shortsword")){
                int finDam=(strDam>dexDam)?strDam:dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple martial weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d6+" +finDam+" piercing\n"+
                        tab+"5ft. reach");

            } else
            if(equipment.get(i).contains("Longbow")){
                int finDam=dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Martial ranged weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d8+" +finDam+" piercing\n"+
                        tab+"150/600 ft. range");

            } else
            if(equipment.get(i).contains("Shortbow")){
                int finDam=dexDam;
                int finHit=finDam+prof;
                equipment.set(i,equipment.get(i)+"\n" +
                        tab+"Simple ranged weapon\n"+
                        tab+"1d20+"+finHit+" to hit\n" +
                        tab+"1d6+" +finDam+" piercing\n"+
                        tab+"80/320 ft. range");
            } else
            if(equipment.get(i).contains("Chainmail")){
                equipment.set(i,equipment.get(i)+" - (Armor class = 16)");

            } else
            if(equipment.get(i).contains("Leather")){
                equipment.set(i,equipment.get(i)+" - (Armor class = "+(11+character.getDexterity())+")");

            } else
            if(equipment.get(i).contains("Shield")){
                equipment.set(i,equipment.get(i)+" - (Armor class+2)");

            }
        }

        String equip="";
        for(int i=0;i<equipment.size();i++){
            equip+=equipment.get(i)+"\n\n";
        }
        equipmentTV.setText(equip);
        return v;
    }

}
