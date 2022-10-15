package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
    String myRecievedEmail,MyRecievedUserName;
    TextView txuseremail,txusername, welcomeid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myRecievedEmail = getIntent().getStringExtra("mykey");
        MyRecievedUserName = getIntent().getStringExtra("myusername");

        txuseremail = findViewById(R.id.txuseremail);
        txusername = findViewById(R.id.txusername);
        welcomeid = findViewById(R.id.welcomeid);

        txuseremail.setText(myRecievedEmail);
        txusername.setText(MyRecievedUserName);
        welcomeid.setText("Welcome " + MyRecievedUserName);

    }
}
