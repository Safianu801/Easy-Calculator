package com.safianu.easycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorScreen extends AppCompatActivity {


    TextView calculationScreen;
    TextView answerScreen;
    RelativeLayout buttonsV;
    double firstNum;
    String operation;

    Button zero, one, two, three, four, eButton, five, six, seven, eight, nine, leftBracket, rightBracket, delBtn, fullStop, divide, multiply, subtract, add, cBtn, equalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_screen);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = this.getWindow();
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            window.setNavigationBarColor(this.getResources().getColor(R.color.main_bg));
            window.setStatusBarColor(this.getResources().getColor(R.color.main_bg));
        }

        //calculation logic

        calculationScreen = findViewById(R.id.calTv);
        answerScreen = findViewById(R.id.answerTv);
        buttonsV = findViewById(R.id.buttonsV);
        delBtn = findViewById(R.id.delBtn);
        equalBtn = findViewById(R.id.equalBtn);
        fullStop = findViewById(R.id.fullStopBtn);
        eButton = findViewById(R.id.eBtn);


        //numbers button

        zero = findViewById(R.id.zeroBtn);
        one = findViewById(R.id.oneBtn);
        two = findViewById(R.id.twoBtn);
        three = findViewById(R.id.threeBtn);
        four = findViewById(R.id.fourBtn);
        five = findViewById(R.id.fiveBtn);
        six = findViewById(R.id.sixBtn);
        seven = findViewById(R.id.sevenBtn);
        eight = findViewById(R.id.eightBtn);
        nine = findViewById(R.id.nineBtn);


        ArrayList<Button> numbersBtn = new ArrayList<>();
        numbersBtn.add(zero);
        numbersBtn.add(one);
        numbersBtn.add(two);
        numbersBtn.add(three);
        numbersBtn.add(four);
        numbersBtn.add(five);
        numbersBtn.add(six);
        numbersBtn.add(seven);
        numbersBtn.add(eight);
        numbersBtn.add(nine);

        for (Button b : numbersBtn){
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!calculationScreen.getText().toString().equals("0")){
                        calculationScreen.setText(calculationScreen.getText().toString() + b.getText().toString());
                    }else {
                        calculationScreen.setText(b.getText().toString());
                    }
                }
            });
        }



        //operators button

        divide = findViewById(R.id.divideBtn);
        multiply = findViewById(R.id.multiplyBtn);
        add = findViewById(R.id.addBtn);
        subtract = findViewById(R.id.subtractBtn);
        cBtn = findViewById(R.id.cBtn);
        leftBracket = findViewById(R.id.leftBracketBtn);
        rightBracket = findViewById(R.id.rightBracketBtn);

        ArrayList<Button> brackets = new ArrayList<>();
        brackets.add(leftBracket);
        brackets.add(rightBracket);
        brackets.add(fullStop);
        for (Button button : brackets){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!calculationScreen.getText().toString().equals("0")){
                        calculationScreen.setText(calculationScreen.getText().toString() + button.getText().toString());
                    }else {
                        calculationScreen.setText(button.getText().toString());
                    }
                }
            });
        }

        ArrayList<Button> operatorsBtn = new ArrayList<>();
        operatorsBtn.add(divide);
        operatorsBtn.add(add);
        operatorsBtn.add(subtract);
        operatorsBtn.add(multiply);

        for (Button operators : operatorsBtn){
            operators.setOnClickListener(view -> {


//                firstNum = Double.parseDouble(calculationScreen.getText().toString());
//                operation = operators.getText().toString();
//                calculationScreen.setText("0");

                if (!calculationScreen.getText().toString().equals("0")){
                    calculationScreen.setText(calculationScreen.getText().toString() + operators.getText().toString());
                }else {
                    calculationScreen.setText(operators.getText().toString());
                }


            });
        }

        delBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = calculationScreen.getText().toString();
                if (num.length()>1){
                    calculationScreen.setText(num.substring(0, num.length()-1));
                } else if (num.length() == 1 && !num.equals("0")) {
                    calculationScreen.setText("0");
                }
            }
        });

//        equalBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double secondNumber = Double.parseDouble(calculationScreen.getText().toString());
//                double result;
//                if (operation == "/"){
//                    result = firstNum/secondNumber;
//                }else if (operation == "+"){
//                    result = firstNum+secondNumber;
//                } else if (operation == "-") {
//                    result = firstNum-secondNumber;
//                } else if (operation == "X") {
//                    result = firstNum*secondNumber;
//                }
//            }
//        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText("");
                answerScreen.setText("");
            }
        });
    }
}