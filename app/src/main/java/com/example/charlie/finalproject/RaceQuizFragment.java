package com.example.charlie.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.charlie.finalproject.Characters.Race;

public class RaceQuizFragment extends Fragment {
    private TextView question;
    private Button answer1;
    private Button answer2;
    private Button resetButton;
    private Button backButton;
    private int qNo=0;
    String[][] questionString;
    int[][] questionsInt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_race_quiz, container, false);
        questionString= Race.raceQuestionString;
        questionsInt=Race.raceQuestionsInt;
        if (questionString.length != questionsInt.length) qNo = -1;
        question = (TextView) view.findViewById(R.id.question);
        initButtons(view);
        setQuestion(qNo);
        return view;
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

    private void toast(int n){
        CharSequence text = ""+questionString[n][0];
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    private void initButtons(View view){
        answer1 = (Button) view.findViewById(R.id.answer1);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qNo=questionsInt[qNo][0];
                if(checkRace(qNo)<Race.raceDescriptions.length){
                    CreatorActivity.setRace(checkRace(qNo));
                    if(CreatorActivity.getPage()==1)
                        ((CreatorActivity)getActivity()).incPage();
                    setQuestion(qNo=0);
                    return;
                }
                setQuestion(qNo);
            }
        });
        answer2 = (Button) view.findViewById(R.id.answer2);
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qNo=questionsInt[qNo][1];
                if(checkRace(qNo)<Race.raceDescriptions.length){
                    CreatorActivity.setRace(checkRace(qNo));
                    if(CreatorActivity.getPage()==1)
                        ((CreatorActivity)getActivity()).incPage();
                    setQuestion(qNo=0);
                    return;
                }
                setQuestion(qNo);
            }
        });

        resetButton=(Button) view.findViewById(R.id.reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qNo=0;
                setQuestion(qNo);
            }
        });
        backButton=(Button)view.findViewById(R.id.backRaceQuiz);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatorActivity.getPage()==1)
                    ((CreatorActivity)getActivity()).decPage();
            }
        });
    }

    private static int checkRace(int n){
        int m=Race.raceDescriptions.length;
        switch(n){
            case 6://Tiefling
                m=8;
                break;
            case 7://Dwarf
                m=1;
                break;
            case 8://Halfling
                m=4;
                break;
            case 9://Half-orc
                m=6;
                break;
            case 12://Dragonborn
                m=0;
                break;
            case 13://Gnome
                m=3;
                break;
            case 14://Elf
                m=2;
                break;
            case 15://Half-elf
                m=5;
                break;
            case 16://human
                m=7;
                break;
        }
        return m;
    }

}
