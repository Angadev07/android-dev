package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String stringEmail, stringUsername,stringPassword;
    EditText etEmail, etPass, etUsername;
    Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btLogin);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etUsername = findViewById(R.id.etUsername);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                stringEmail = etEmail.getText().toString();
                stringPassword = etPass.getText().toString();
                stringUsername = etUsername.getText().toString();
                if (stringEmail.equals("abcd@gmail.com") && stringPassword.equals("abcd"))
                {
                    Intent mymovingintent = new Intent(MainActivity.this, ActivityHome.class);
                    mymovingintent.putExtra("mykey" , stringEmail );
                    mymovingintent.putExtra("myusername" , stringUsername);
                    startActivity(mymovingintent);
                }
                else{
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
