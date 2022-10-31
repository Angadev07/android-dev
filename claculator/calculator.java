package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t3;
    Button plus,minus,mult,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.e1);
        e2= (EditText) findViewById(R.id.e2);
        t3 = (TextView) findViewById(R.id.t3);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        clear= (Button) findViewById(R.id.clear);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int sum = n1 + n2;
                t3.setText(String.valueOf(sum));


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int sum = n1 - n2;
                t3.setText(String.valueOf(sum));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int sum = n1 * n2;
                t3.setText(String.valueOf(sum));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                int sum = n1 / n2;
                t3.setText(String.valueOf(sum));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              e1.setText("" +
                      "");
              e2.setText("");
            }
        });


    }
