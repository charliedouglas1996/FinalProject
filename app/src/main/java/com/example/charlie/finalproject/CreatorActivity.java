package com.example.charlie.finalproject;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.charlie.finalproject.Characters.Classs;
import com.example.charlie.finalproject.Characters.Race;

public class CreatorActivity extends AppCompatActivity {

    SectionsStatePagerAdapter sectionsStatePagerAdapter;
    ViewPager viewPager;
    private static int classs= Classs.classDescriptions.length;
    private static int race= Race.raceDescriptions.length;
    private static int page;
    private static int draconicAncesty=0;
    private static int dwarfTool=0;
    private static String language="Dwarvish";
    private static int cantrip=0;
    private static int skill1=0;
    private static int skill2=1;
    private static int ability1=0;
    private static int ability2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator);
        page=0;
        sectionsStatePagerAdapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        viewPager=(ViewPager) findViewById(R.id.container);
        viewPager.beginFakeDrag();
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CreatorStartFragment(),"creatorStart");//0
        adapter.addFragment(new RaceQuizFragment(),"race quiz");//1
        adapter.addFragment(new RaceDescriptionFragment(),"race description");//2
        adapter.addFragment(new ClassQuizFragment(),"class quiz");//3
        adapter.addFragment(new ClassDescriptionFragment(),"class description");//4
        adapter.addFragment(new CreatorEndFragment(),"Creator end");//5
        viewPager.setAdapter(adapter);
    }



    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }

    public static int getClasss() {
        return classs;
    }

    public static void setClasss(int c) {
        classs = c;
    }

    public static int getRace() {
        return race;
    }

    public static void setRace(int r) {
        race = r;
    }

    public int incPage(){
        setViewPager(++page);
        return page;
    }
    public int decPage(){
        setViewPager(--page);
        return page;
    }

    public static int getPage(){
        return page;
    }

    public static void setPage(int p) {
        page = p;
    }

    public static int getDraconicAncesty() {
        return draconicAncesty;
    }

    public static void setDraconicAncesty(int draconicAncesty) {
        CreatorActivity.draconicAncesty = draconicAncesty;
    }

    public static int getDwarfTool() {
        return dwarfTool;
    }

    public static void setDwarfTool(int dwarfTool) {
        CreatorActivity.dwarfTool = dwarfTool;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        CreatorActivity.language = language;
    }

    public static int getCantrip() {
        return cantrip;
    }

    public static void setCantrip(int cantrip) {
        CreatorActivity.cantrip = cantrip;
    }

    public static int getSkill1() {
        return skill1;
    }

    public static void setSkill1(int skill1) {
        CreatorActivity.skill1 = skill1;
    }

    public static int getSkill2() {
        return skill2;
    }

    public static void setSkill2(int skill2) {
        CreatorActivity.skill2 = skill2;
    }

    public static int getAbility1() {
        return ability1;
    }

    public static void setAbility1(int ability1) {
        CreatorActivity.ability1 = ability1;
    }

    public static int getAbility2() {
        return ability2;
    }

    public static void setAbility2(int ability2) {
        CreatorActivity.ability2 = ability2;
    }
}
