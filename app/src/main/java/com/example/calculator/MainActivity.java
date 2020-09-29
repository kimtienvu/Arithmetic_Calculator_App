package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.calculator.databinding.ActivityMainBinding;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;
    private DecimalFormat decimalFormat;
    private double result = Double.NaN;
    private ArrayList<Character> textBox = new ArrayList<Character>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        decimalFormat = new DecimalFormat("#.##########");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        /* Decimal Button Functionality */
        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append(".").toString());
            }
        });

        /* All digits (0-9) Functionality */
        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("0").toString());
            }
        });

        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("1").toString());
            }
        });

        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("2").toString());
            }
        });

        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("3").toString());
            }
        });

        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("4").toString());
            }
        });

        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("5").toString());
            }
        });

        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("6").toString());
            }
        });

        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("7").toString());
            }
        });

        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("8").toString());
            }
        });

        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("9").toString());
            }
        });

        /* Arithmetic operators Button Functionality */
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("+").toString());
            }
        });

        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("-").toString());
            }
        });

        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("*").toString());
            }
        });

        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(new StringBuilder().append(binding.editText.getText()).append("/").toString());
            }
        });

        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                /* Keep original result if no clear to use in future calculations?
                valueOne = Integer.parseInt(textBox.get(0));*/
            }
        });

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText("");
                binding.infoTextView.setText("");
                result = 0;
                textBox.clear();
            }
        });
    }

    private void computeCalculation() {

        char tempOperator;
        char tempDigit1;
        char tempDigit2;

        /* Get the text from the textbox and put into an array separated by operators*/
        String textBoxStorage = binding.editText.getText().toString();

        /* For each character in a string, put into an array */
        for(int i = 0; i < textBoxStorage.length(); i++) {
            textBox.add(textBoxStorage.charAt(i));
        }

        if(textBox.size() != 0) {

            binding.editText.setText("");
            binding.infoTextView.setText("");

            /* Check if user did something like "+2+3", add a 0 in front
            if(Character.compare(textBox.get(0), '+') == 0|| Character.compare(textBox.get(0), '-') == 0 || Character.compare(textBox.get(0), '/') == 0 || Character.compare(textBox.get(0), '*') == 0) {
                textBox.add(0, '0');
            }

            /* Make sure user didn't put any operations next to each other i.e "++3-/4*"
            for(int i = 0; i < textBox.size() - 1; i++) {

                Need to also check if the OPERATORS are next to each other
                if(Character.compare(textBox.get(i), textBox.get(i + 1)) == 0) {

                    binding.infoTextView.setText("");
                    binding.editText.setText("");
                    textBox.clear();
                    return;
                }
            } */

            /* Go through for mult/division first because of PEMDAS (not necessary since calculator can only do 1 operation at a time)*/
            for(int i = 1; i < textBox.size() - 1; i++) {

                if(Character.compare(textBox.get(i) , '*') == 0 || Character.compare(textBox.get(i) , '/') == 0) {
                    tempDigit1 = textBox.get(i - 1);
                    tempOperator = textBox.get(i);
                    tempDigit2 = textBox.get(i + 1);

                    /* multiple or divide */
                    double temp1 = Character.getNumericValue(tempDigit1);
                    double temp2 = Character.getNumericValue(tempDigit2);

                    if(Character.compare(tempOperator, '*') == 0) {

                        result = temp1 * temp2;
                        textBox.remove(i - 1);
                        i--;
                        textBox.remove(i);
                        textBox.remove(i);
                    } else {

                        result = temp1 / temp2;
                        textBox.remove(i - 1);
                        i--;
                        textBox.remove(i);
                        textBox.remove(i);
                    }

                }

            }

            /* Now check for addition/subtraction */
            for(int i = 1; i < (textBox.size() - 1); i++) {

                if(Character.compare(textBox.get(i) , '+') == 0 || Character.compare(textBox.get(i) , '-') == 0) {

                    tempDigit1 = textBox.get(i - 1);
                    tempOperator = textBox.get(i);
                    tempDigit2 = textBox.get(i + 1);
                    double temp1 = Character.getNumericValue(tempDigit1);
                    double temp2 = Character.getNumericValue(tempDigit2);

                    if(Character.compare(tempOperator, '+') == 0) {

                        result = temp1 + temp2;
                        textBox.remove(i - 1);
                        i--;
                        textBox.remove(i);
                        textBox.remove(i);
                    } else {

                        result = temp1 - temp2;
                        textBox.remove(i - 1);
                        i--;
                        textBox.remove(i);
                        textBox.remove(i);
                    }
                }
            }

            /* Display result */
            binding.infoTextView.setText(new StringBuilder().append(binding.infoTextView.getText().toString()).append(result));
            //binding.editText.setText(new StringBuilder().append(binding.editText.getText().toString()).append(textBox.toString()));
            binding.editText.setText(new StringBuilder().append(binding.editText.getText().toString()).append(result));
        }
    }
}