package com.safianu.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalculatorScreen extends AppCompatActivity {

    TextView calculationScreen;
    TextView answerScreen;
    RelativeLayout buttonsV;

    Button zero, one, two, three, four, five, six, seven, eight, nine, leftBracket, rightBracket, fullStop, divide, multiply, subtract, add, cBtn;

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

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(zero.getText());
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(one.getText());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(two.getText());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(three.getText());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(four.getText());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(five.getText());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(six.getText());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(seven.getText());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(eight.getText());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(nine.getText());
            }
        });


        //operators button

        divide = findViewById(R.id.divideBtn);
        multiply = findViewById(R.id.multiplyBtn);
        add = findViewById(R.id.addBtn);
        subtract = findViewById(R.id.subtractBtn);
        cBtn = findViewById(R.id.cBtn);
        leftBracket = findViewById(R.id.leftBracketBtn);
        rightBracket = findViewById(R.id.rightBracketBtn);



        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(divide.getText());
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(multiply.getText());
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(subtract.getText());
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(add.getText());
            }
        });
        leftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(leftBracket.getText());
            }
        });
        rightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText(rightBracket.getText());
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationScreen.setText("");
                answerScreen.setText("");
            }
        });

    }
}