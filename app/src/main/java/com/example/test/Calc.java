package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Calc extends AppCompatActivity {
    MainAdapter adapter;
    TextView result;
    EditText num1, num2;
    Button multiply, plus, minus, division,save;
    int sum;
    int el1;
    int el2;
    String el3;
    String el4;
    static final String RESULT_TEXT_KEY="new_text_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        save=findViewById(R.id.save);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);

        el1 = Integer.parseInt(num1.getText().toString());
        el2 = Integer.parseInt(num2.getText().toString());

        el3 = num1.getText().toString();
        el4 = num2.getText().toString();



        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum=el1*el2;
                String qwe=String.valueOf(sum);
                result.setText(el3+" * "+el4+"= "+qwe);

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum=el1+el2;
                String qwe=String.valueOf(sum);
                result.setText(el3+" + "+el4+"= "+qwe);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum=el1-el2;
                String qwe=String.valueOf(sum);
                result.setText(el3+" - "+el4+"= "+qwe);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum=el1/el2;
                String qwe=String.valueOf(sum);
                result.setText(el3+" / "+el4+"= "+qwe);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(RESULT_TEXT_KEY, result.getText());
                setResult(RESULT_OK, intent);
                finish();
            }
        });


        }






























    }



//    public void onCLick(View view) {
//        switch (view.getId()) {
//            case R.id.plus:
//                Intent intent = new Intent(Calc.this, MainActivity.class);
//                sum = el1 + el2;
//                String val = String.valueOf(sum);
//                result.setText(val);
//                String text = el3 + " + " + el4 + " = " +val ;
//                intent.putExtra("key", text);
//                startActivityForResult(intent, 2);
//                break;
//            case R.id.division:
//                Intent intent2 = new Intent(Calc.this, MainActivity.class);
//                sum = el1 / el2;
//                String val2 = String.valueOf(sum);
//                result.setText(val2);
//                String text1 = el3 + " / " + el4 + " = " +val2;
//                intent2.putExtra("key", text1);
//                startActivityForResult(intent2, 2);
//                break;
//            case R.id.multiply:
//                Intent intent3 = new Intent(Calc.this, MainActivity.class);
//                sum = el1 * el2;
//                String val3 = String.valueOf(sum);
//                result.setText(val3);
//                String text2 = el3 + " * " + el4 + " = " + val3;
//                intent3.putExtra("key", text2);
//                startActivityForResult(intent3, 2);
//                break;
//            case R.id.minus:
//                Intent intent4 = new Intent(Calc.this, MainActivity.class);
//                sum = el1 - el2;
//                String val4 = String.valueOf(sum);
//                result.setText(val4);
//                String text3 = el3 + " - " + el4 + " = " + val4;
//                intent4.putExtra("key",text3);
//                startActivityForResult(intent4,2);
//                break;
//        }
   // }




