package com.example.charlie.finalproject;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreatorActivity extends AppCompatActivity {

    SectionsStatePagerAdapter sectionsStatePagerAdapter;
    ViewPager viewPager;
    private static int classs=Classes.classDescriptions.length;
    private static int race=Race.raceDescriptions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator);
        sectionsStatePagerAdapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        viewPager=(ViewPager) findViewById(R.id.container);
        viewPager.beginFakeDrag();
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CreatorStartFragment(),"creatorStart");
        adapter.addFragment(new RaceQuizFragment(),"race quiz");
        adapter.addFragment(new RaceDescriptionFragment(),"race description");
        adapter.addFragment(new ClassQuizFragment(),"class quiz");
        adapter.addFragment(new ClassDescriptionFragment(),"class description");
//        adapter.addFragment(new CharacterOverviewFragment(),"character overview");
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
}
