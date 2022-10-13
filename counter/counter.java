package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int myCountvalue = 0;

    Button btMinus, btPlus;
    TextView txCount, txReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMinus = findViewById(R.id.btMinus);
        btPlus = findViewById(R.id.btPlus);
        txCount= findViewById(R.id.txCount);
        txReset = findViewById(R.id.txReset);

        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = myCountvalue - 1;
                txCount.setText(myCountvalue + "");

            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = myCountvalue + 1;
                txCount.setText(myCountvalue + "");
            }
        });

        txReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountvalue = 0;
                txCount.setText(myCountvalue + "");
            }
        });

    }
}
