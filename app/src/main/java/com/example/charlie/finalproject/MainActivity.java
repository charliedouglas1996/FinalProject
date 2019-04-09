package com.example.charlie.finalproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView question;
    private Button answer1;
    private Button answer2;
    private int qNo=0;
    private String[][] raceQuestionString={
            {"Do your people have strong sense of community?", "Yes, we are very close ","No, my people are very disjointed"},//0
            {"Do your people value order or personal freedom?","Order","Freedom"},//1
            {"Are your people of a proud heritage, albeit a relatively difficult to define one?","Yes","No"},//2
            {"Are your people known for great empires or tight-knit communities?","Empires","Communities"},//3
            {"Do your people pursue this freedom at the expense of others?","Yes","No"},//4
            {"Does this pride come from what your people have achieved or acts that your ancestors have done?","Achievements","Ancestors"},//5
                {"TIEFLING","TIEFLING","TIEFLING"},//6 TIEFLING
                {"DWARF","DWARF", "DWARF"},//7 DWARF
                {"HALFLING","HALFLING","HALFLING"},//8 HALFLING
                {"HALF-ORC","HALF-ORC","HALF-ORC"},//9 HALF-ORC
            {"Is illusory magic a cultural staple?","Yes","No"},//10
            {"Are your people social outcasts?","Yes","No"},//11
                {"DRAGONBORN","DRAGONBORN","DRAGONBORN"},//12 DRAGONBORN
            {"GNOME","GNOME","GNOME"},//13 GNOME
                {"ELF","ELF","ELF"},//14 ELF
                {"HALF-ELF","HALF-ELF","HALF-ELF"},//15 HALF-ELF
                {"HUMAN","HUMAN","HUMAN"},//16 HUMAN
    };

    private int[][] raceQuestionsInt={
            {1,2},//0
            {3,4},//1
            {5,6},//2
            {7,8},//3
            {9,10},//4
            {11,12},//5
                {0,0},//6 TIEFLING
                {0,0},//7 DWARF
                {0,0},//8 HALFLING
                {0,0},//9 HALF-ORC
            {13,14},//10
            {15,16},//11
                {0,0},//12 DRAGONBORN
                {0,0},//13 GNOME
                {0,0},//14 ELF
                {0,0},//15 HALF-ELF
                {0,0},//16 HUMAN
    };

    private String[][] classQuestionString={
            {"How do you react to danger?", "I don't mind charging in","I deal with it from a safe distance"},//0
            {"Are you more strong or nimble?","Strong","Nimble"},//1
            {"What do you rely on most?","Skills","Magic"},//2
            {"Are you good with the gods?","I've got 'em on speed dial","Meh"},//3
            {"Do you live for Kung-Fu movies?","Bruce Lee is my idol","Not so much"},//4
            {"How good are you at keeping quiet?","*silence*","I don't know, I've never tried it!"},//5
            {"I want...","Flexibility","One or two supernatural nukes","Magical stamina for days"},//6
            {"I live my faith by...","Delivering righteous justice", "Channeling the nature and power of my god"},//7
            {"Are you prone to flying into a rage?","Raaaaaahhhhrrr!!!","No more than the next adventurer"},//8
            {"MONK","MONK","MONK"},//9 MONK
            {"Would you risk your life for a good story?","I think not","You know it!"},//10
            {"Do you keep any pets?","My best friends are ferocious beasts","What, like a gerbil?"},//11
            {"BARD","BARD","BARD"},//12 BARD
            {"Are you the academic type?","I'm a bookworm","Not necessarily"},//13
            {"SORCERER","SORCERER","SORCERER"},//14 SORCERER
            {"WARLOCK","WARLOCK","WARLOCK"},//15 WARLOCK
            {"PALADIN","PALADIN","PALADIN"},//16 PALADIN
            {"CLERIC","CLERIC","CLERIC"},//17 CLERIC
            {"BARBARIAN","BARBARIAN","BARBARIAN"},//18 BARBARIAN
            {"How cool would it be to turn into a bear?","So cool!","I have allergies"},//19
            {"I'm deadly because...","I'm a born schemer","I'm a master hunter","I'm experienced in the art of combat"},//20
            {"RANGER","RANGER","RANGER"},//21 RANGER
            {"I'm trained to kill using...","My brain. And maybe poison","Anything that slices, skewers, or smashes"},//22
            {"WIZARD","WIZARD","WIZARD"},//23 WIZARD
            {"Are you religious?","Define religious","No, my power comes from righteous lute solos","No, my power comes from within"},//24
            {"DRUID","DRUID","DRUID"},//25 DRUID
            {"FIGHTER","FIGHTER","FIGHTER"},//26 FIGHTER
            {"My schemes usually involve...","Cloak and dagger tactics","Allying myself with dark and strange elements"},//27
            {"ROGUE","ROGUE","ROGUE"},//28 ROGUE
            {"Where does your power come from?","My connection with nature","The gods","A creepy, otherworldly pact"}//29
    };

    private int[][] classQuestionsInt={
            {1,2},//0
            {3,4},//1
            {5,6},//2
            {7,8},//3
            {9,10},//4
            {11,12},//5
            {13,14,15},//6
            {16,17},//7
            {18,19},//8
            {0,0},//9 MONK
            {20,12},//10
            {21,22},//11
            {0,0},//12 BARD
            {23,24},//13
            {0,0},//14 SORCERER
            {0,0},//15 WARLOCK
            {0,0},//16 PALADIN
            {0,0},//17 CLERIC
            {0,0},//18 BARBARIAN
            {25,26},//19
            {27,21,26},//20
            {0,0},//21 RANGER
            {28,26},//22
            {0,0},//23 WIZARD
            {29,12,14},//24
            {0,0},//25 DRUID
            {0,0},//26 FIGHTER
            {28,15},//27
            {0,0},//28 ROGUE
            {25,17,15}//29
    };

    String[][] questionString=raceQuestionString;
    int[][] questionsInt=raceQuestionsInt;
//    String[][] questionString=classQuestionString;
//    int[][] questionsInt=classQuestionsInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(questionString.length!=questionsInt.length) qNo=-1;
        question=(TextView)findViewById(R.id.question);
        answer1=(Button)findViewById(R.id.answer1) ;
        answer2=(Button)findViewById(R.id.answer2) ;
        setQuestion(qNo);
    }

    private void setQuestion(int qNo){
        if(qNo==-1){
            question.setText(R.string.string_int_error);
            answer1.setText(R.string.string_int_error);
            answer2.setText(R.string.string_int_error);
        }
        else{
            question.setText(questionString[qNo][0]);
            answer1.setText(questionString[qNo][1]);
            answer2.setText(questionString[qNo][2]);
        }
    }

    public void onClickAnswer(View view){
        toast(qNo);
        if(view.getId()==R.id.answer1){
            qNo=questionsInt[qNo][0];
            setQuestion(qNo);
            return;
        }
        qNo=questionsInt[qNo][1];
        setQuestion(qNo);
    }

    private void toast(int n){
        Context context = getApplicationContext();
        CharSequence text = ""+questionString[n][0];
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickReset(View view){
        qNo=0;
        setQuestion(qNo);
    }
}
//TODO:
//- add synopsis page
//- add confirm button
//- ability scores
//- class options
//- race options
//- character sheet
//- dice rolling