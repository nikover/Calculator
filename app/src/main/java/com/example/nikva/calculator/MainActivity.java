package com.example.nikva.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView firstNumber, secondNumber, tvResult;
    private Button addition, difference, division, multiplication, percent, clear, delete, dot, minus, result;
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private boolean plusBool = false, minusBool = false, fractionBool = false, multipBool = false;
    private static final String TAG = "myTags";
    private ArrayList<Number> listOfNumbers = new ArrayList();
    /*Позже убрать эту хуйню*/
    private int operationsCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Запуск Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Инициализация всех переменных");
        //Initialisation of all variables
        firstNumber = (TextView) findViewById(R.id.firstNumber);
        secondNumber = (TextView) findViewById(R.id.secondNumber);

        tvResult = (TextView) findViewById(R.id.tvResult);

        addition = (Button) findViewById(R.id.addition);
        addition.setOnClickListener(this);
        difference = (Button) findViewById(R.id.difference);
        difference.setOnClickListener(this);
        division = (Button) findViewById(R.id.division);
        division.setOnClickListener(this);
        multiplication = (Button) findViewById(R.id.multiplication);
        multiplication.setOnClickListener(this);
        percent = (Button) findViewById(R.id.persent);
        percent.setOnClickListener(this);
        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(this);
        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(this);
        dot = (Button) findViewById(R.id.dot);
        dot.setOnClickListener(this);
        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(this);
        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(this);

        //Numbers
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);
    }


    //Handing clicks
    @Override
    public void onClick(View v) {
        Log.d(TAG, "Ищем нужную кнопку по ID");
        switch (v.getId()){
            case R.id.one:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("1");
                    secondNumber.setText("1");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "1");
                    secondNumber.setText(secondNumber.getText().toString() + "1");
                }
                break;
            case R.id.two:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("2");
                    secondNumber.setText("2");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "2");
                    secondNumber.setText(secondNumber.getText().toString() + "2");
                }
                break;
            case R.id.three:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("3");
                    secondNumber.setText("3");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "3");
                    secondNumber.setText(secondNumber.getText().toString() + "3");
                }
                break;
            case R.id.four:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("4");
                    secondNumber.setText("4");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "4");
                    secondNumber.setText(secondNumber.getText().toString() + "4");
                }
                break;
            case R.id.five:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("5");
                    secondNumber.setText("5");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "5");
                    secondNumber.setText(secondNumber.getText().toString() + "5");
                }
                break;
            case R.id.six:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("6");
                    secondNumber.setText("6");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "6");
                    secondNumber.setText(secondNumber.getText().toString() + "6");
                }
                break;
            case R.id.seven:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("7");
                    secondNumber.setText("7");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "7");
                    secondNumber.setText(secondNumber.getText().toString() + "7");
                }
                break;
            case R.id.eight:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("8");
                    secondNumber.setText("8");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "8");
                    secondNumber.setText(secondNumber.getText().toString() + "8");
                }
                break;
            case R.id.nine:
                if(firstNumber.getText().toString().equals("0")){
                    firstNumber.setText("9");
                    secondNumber.setText("9");
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "9");
                    secondNumber.setText(secondNumber.getText().toString() + "9");
                }
                break;
            case R.id.zero:
                if(firstNumber.getText().toString().equals("0")){
                    return;
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + "0");
                    secondNumber.setText(secondNumber.getText().toString() + "0");
                }
                break;
            case R.id.dot:
                if (firstNumber.getText().toString().indexOf('.') != -1){
                    return;
                }
                else {
                    firstNumber.setText(firstNumber.getText().toString() + ".");
                    secondNumber.setText(secondNumber.getText().toString() + ".");
                }
                break;
            case R.id.minus:
                if(firstNumber.getText().toString().equals("0") |
                        firstNumber.getText().toString().indexOf('-') != -1){
                    return;
                }
                else {
                    firstNumber.setText("-" + firstNumber.getText().toString());
                    secondNumber.setText("-" + secondNumber.getText().toString());
                }
                break;
            case R.id.clear:
                firstNumber.setText("0");
                secondNumber.setText("0");
                tvResult.setText("Result");
                plusBool = false;
                minusBool = false;
                fractionBool = false;
                multipBool = false;
                listOfNumbers.clear();
                break;
            case R.id.delete:
                if(firstNumber.getText().toString().equals("0") &
                        secondNumber.getText().toString().equals("0")){
                    return;
                }
                else {
                    if (firstNumber.getText().toString().length() == 1)
                        firstNumber.setText("0");
                    else {
                        String f = firstNumber.getText().toString();
                        firstNumber.setText(f.substring(0, f.length() - 1));
                    }
                    if (secondNumber.getText().toString().length() == 1)
                        secondNumber.setText("0");
                    else {
                        String g = secondNumber.getText().toString();
                        secondNumber.setText(g.substring(0, g.length() - 1));
                    }
                }
                break;

            case R.id.addition:
                if (operationsCounter >= 1) {
                    Toast.makeText(this, "В данной версии можно выполнять только одну операцию.",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                if (firstNumber.getText().toString().equals("0.")) {
                    tvResult.setText("Error!");
                }
                else{
                    String number = firstNumber.getText().toString();
                    listOfNumbers.add(Float.valueOf(number));
                    secondNumber.setText(secondNumber.getText().toString() + "+");
                    plusBool = true;
                    firstNumber.setText("+");
                    operationsCounter++;
                }
                break;
            case R.id.difference:
                //result = number1 - number2;
                break;
            case R.id.division:
                //result = number1 / number2;
                break;
            case R.id.multiplication:
                //result = number1 * number2;
                break;
            case R.id.result:
                Float result = 0.0f;
                String number = firstNumber.getText().toString();
                try {
                    listOfNumbers.add(Float.valueOf(number));
                }
                catch (NumberFormatException exc){
                    tvResult.setText("Erorr!");
                    return;
                }
                for (int i = 0; i < listOfNumbers.size(); i++){
                    result += (Float) listOfNumbers.get(i);
                }
                if (fraction(result) == 0.0){
                    tvResult.setText(String.valueOf(result).substring(0, String.valueOf(result).length() - 2));
                }
                operationsCounter = 0;
                listOfNumbers.clear();
                break;
        }
    }

    //The method to calculating the fractional part of number
    float fraction(Float x){
        int x1 = (int) (float) x;
        float x2 = x - x1;
        return x2;
    }
}
