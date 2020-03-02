package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView result;
    EditText numerOne, numerTwo;
    Button add, multiply, divine, substract;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        numerOne = (EditText) findViewById(R.id.first);
        numerTwo = (EditText) findViewById(R.id.second);
        add = (Button) findViewById(R.id.adds);
        multiply = (Button) findViewById(R.id.muliplys);
        divine = (Button) findViewById(R.id.divine);
        substract = (Button) findViewById(R.id.substracts);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(numerOne.getText().toString());
                float num2 = Float.parseFloat(numerTwo.getText().toString());
                float result_all = num1 + num2;
                result.setText(String.valueOf(result_all));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = Float.parseFloat(numerOne.getText().toString());
                float num2 = Float.parseFloat(numerTwo.getText().toString());
                float result_all = num1 * num2;
                result.setText(String.valueOf(result_all));

            }
        });

        divine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = Float.parseFloat(numerOne.getText().toString());
                float num2 = Float.parseFloat(numerTwo.getText().toString());
                if(num1 == 0 || num2 == 0){
                    Toast.makeText(MainActivity.this,"NIE DZIEL PRZEZ 0!!!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    float result_all = num1 / num2;
                    result.setText(String.valueOf(result_all));
                }

            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = Float.parseFloat(numerOne.getText().toString());
                float num2 = Float.parseFloat(numerTwo.getText().toString());
                float result_all = num1 - num2;
                result.setText(String.valueOf(result_all));
            }
        });

    }
}
