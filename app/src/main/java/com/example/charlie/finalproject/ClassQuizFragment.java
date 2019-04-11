package com.example.charlie.finalproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClassQuizFragment extends Fragment {
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
        View view= inflater.inflate(R.layout.fragment_quiz, container, false);
        questionString=Classes.classQuestionString;
        questionsInt=Classes.classQuestionsInt;
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
                if(checkClass(qNo)<Classes.classDescriptions.length){
                    CreatorActivity.setClasss(checkClass(qNo));
                    ((CreatorActivity)getActivity()).setViewPager(4);
                    setQuestion(qNo=0);
                    return;
                }
                setQuestion(qNo);
                return;
            }
        });
        answer2 = (Button) view.findViewById(R.id.answer2);
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qNo=questionsInt[qNo][1];
                if(checkClass(qNo)<Classes.classDescriptions.length){
                    CreatorActivity.setClasss(checkClass(qNo));
                    ((CreatorActivity)getActivity()).setViewPager(4);
                    setQuestion(qNo=0);
                    return;
                }
                setQuestion(qNo);
                return;
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
        backButton=(Button)view.findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CreatorActivity)getActivity()).setViewPager(3);
            }
        });
    }
    private static int checkClass(int n){
        int m=Classes.classDescriptions.length;
        switch(n){
            case 9://Monk
                m=5;
                break;
            case 12://bard
                m=1;
                break;
            case 14://sorcerer
                m=9;
                break;
            case 15://warlock
                m=10;
                break;
            case 16://paladin
                m=6;
                break;
            case 17://cleric
                m=2;
                break;
            case 18://barbarian
                m=0;
                break;
            case 21://ranger
                m=7;
                break;
            case 23://wizard
                m=11;
                break;
            case 25://druid
                m=3;
                break;
            case 26://fighter
                m=4;
                break;
            case 28://rouge
                m=8;
                break;
        }
        return m;
    }/*
            0{"barbarian","barb description"},
            1{"bard","bard escription"},
            2{"cleric","c description"},
            3{"druid","d escription"},
            4{"fighter","f description"},
            5{"monk","m description"},
            6{"paladin","p description"},
            7{"ranger","ra description"},
            8{"rogue","ro description"},
            9{"sorcerer","s description"},
            10{"warlock","wa description"},
            11{"wizard","wi description"}*/

}
