package com.example.charlie.finalproject;

import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.charlie.finalproject.Characters.Character;
import com.example.charlie.finalproject.Characters.Classes.Barbarian;
import com.example.charlie.finalproject.Characters.Classs;
import com.example.charlie.finalproject.Characters.Race;
import com.example.charlie.finalproject.Characters.Races.Human;

import java.util.Random;

import static com.example.charlie.finalproject.Characters.Character.getModifier;

public class SheetActivity extends AppCompatActivity {

    TextView tv;
    ViewPager viewPager;
    Button button;
    private Character character;
    EditText num1,num3, currentHPTV;
    boolean isPlus;
    TextView plusMinus,resultNumber, nameTV, hitPMaxTV;
    Button rollButton;
    Spinner num2;
    ConstraintLayout bar2;

    public Character getCharacter() {
        return character;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet);
//        num1=(EditText) findViewById(R.id.num1);

        num2=(Spinner)findViewById(R.id.spinnerN);
        num1=(EditText) findViewById(R.id.num1);
        num3=(EditText) findViewById(R.id.num3);
        num2.setSelection(5);
        num1.setText(1+"");
        isPlus=true;
        plusMinus=(TextView)findViewById(R.id.plusMinus);
        resultNumber=(TextView)findViewById(R.id.resultNumber);
        nameTV=(TextView)findViewById(R.id.nameTV);
        rollButton=(Button) findViewById(R.id.rollButton);
        currentHPTV=(EditText)findViewById(R.id.currentHPTV);
        hitPMaxTV=(TextView)findViewById(R.id.hitPMaxTV);
        bar2=(ConstraintLayout)findViewById(R.id.layout2);

        Race race=new Human("Deep speech");
        Classs classs=new Barbarian();
        character=new Character(race,classs,"charles");
        String raceName=race.getName();
        String classsName=classs.getName();
        nameTV.setText(character.getName()+" - "+raceName+" "+classsName);
        int hpMax=character.getHitPointMax();
        hitPMaxTV.setText("/"+hpMax);
        currentHPTV.setText(character.getHitPointCurrent()+"");
        currentHPTV.addTextChangedListener(new TextWatcher() {

            // the user's changes are saved here
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                String chars=c.toString();
                if(chars.equals(""))
                    character.setHitPointCurrent(0);
                else if(Integer.parseInt(chars)<character.getHitPointMax())
                    character.setHitPointCurrent(Integer.parseInt(chars));
                else
                    character.setHitPointCurrent(character.getHitPointMax());
            }

            public void beforeTextChanged(CharSequence c, int start, int count, int after) {
                // this space intentionally left blank
            }

            public void afterTextChanged(Editable c) {
                // this one too
            }
        });

        LinearLayout layoutLi=(LinearLayout) ((ViewGroup)bar2).getChildAt(0);
        TextView tv=(TextView)((ViewGroup)layoutLi).getChildAt(0);
        tv.setText("+"+character.getClasss().getProficiencyBonus());
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(1);
        tv.setText("Proficiency\nbonus");
        layoutLi=(LinearLayout) ((ViewGroup)bar2).getChildAt(1);
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(0);
        tv.setText(""+character.getRace().getSpeed()+" ft.");
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(1);
        tv.setText("Walking\nspeed");
        layoutLi=(LinearLayout) ((ViewGroup)bar2).getChildAt(2);
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(0);
        String add="";
        if(character.getDexterity()<0)
            add="-";
        if(character.getDexterity()>0)
            add="+";
        tv.setText(add+character.getDexterity()+"");
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(1);
        tv.setText("Initiative");
        layoutLi=(LinearLayout) ((ViewGroup)bar2).getChildAt(3);
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(0);
        tv.setText(""+character.getArmorClass()+"");
        tv=(TextView)((ViewGroup)layoutLi).getChildAt(1);
        tv.setText("Armor\nclass");

        viewPager=(ViewPager) findViewById(R.id.sheetPager);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SheetAFragment(),"sheet A");//0
        adapter.addFragment(new SheetBFragment(),"sheet B");//1
        adapter.addFragment(new SheetAFragment(),"sheet A");//2
        viewPager.setAdapter(adapter);
    }

    public void reset(View view){
        viewPager.setCurrentItem(0);
    }
    public void roll(View view){
        int number1;
        if(num1.getText().toString().equals("")) number1=0;
        else number1=Integer.parseInt(num1.getText().toString());
        int number2;
        if(num2.getSelectedItem().toString().equals("")) number2=0;
        else number2=Integer.parseInt(num2.getSelectedItem().toString());
        int number3;
        if(num3.getText().toString().equals("")) number3=0;
        else number3=Integer.parseInt(num3.getText().toString());
        int result=0;
        String pm;
        if(isPlus) pm="+";
        else pm="-";
        for(int i=0;i<number1;i++){
            int roll= (new Random().nextInt(number2)) + 1;
            result+=roll;
        }
        if(number3!=0){
            if(isPlus){
                result+=number3;
            }
            else {
                result-=number3;
            }
        }
        else if(isPlus){
            result+=number3;
        }
        else {
            result-=number3;
        }
        resultNumber.setText(""+result);
    }

    public void minus(View view)
    {
        if(isPlus)
            plusMinus.setText("-");
        else plusMinus.setText("+");
        isPlus=!isPlus;

    }
}
