package com.example.charlie.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    EditText num1,num2,num3;
    boolean isPlus;
    TextView plusMinus,resultTextView,resultNumber;
    Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        num3=(EditText) findViewById(R.id.num3);
        isPlus=true;
        plusMinus=(TextView)findViewById(R.id.plusMinus);
        resultNumber=(TextView)findViewById(R.id.resultNumber);
        resultTextView=(TextView)findViewById(R.id.resultTextView);
        rollButton=(Button) findViewById(R.id.rollButton);
    }

    public void roll(View view){
        int number1;
        if(num1.getText().toString().equals("")) number1=0;
        else number1=Integer.parseInt(num1.getText().toString());
        int number2;
        if(num2.getText().toString().equals("")) number2=0;
        else number2=Integer.parseInt(num2.getText().toString());
        int number3;
        if(num3.getText().toString().equals("")) number3=0;
        else number3=Integer.parseInt(num3.getText().toString());
        int result=0;
        String pm;
        if(isPlus) pm="+";
        else pm="-";
        String text="Results of "+number1+"d"+number2+pm+number3+":\n";
        for(int i=0;i<number1;i++){
            int roll= (new Random().nextInt(number2)) + 1;
            result+=roll;
            text+="("+roll+")";
            if(i<number1-1) text+="+";
        }
        if(number3!=0){
            if(isPlus){
                result+=number3;
                text+="+"+number3;
            }
            else {
                result-=number3;
                text+="-"+number3;
            }
        }
        else if(isPlus){
            result+=number3;
        }
        else {
            result-=number3;
        }
        text+="="+result;
        resultTextView.setText(text);
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
