package com.example.icp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);



        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.username);
                EditText password = (EditText) findViewById(R.id.password);
                final String usernamev = username.getText().toString();
                final String passwordv = password.getText().toString();
                boolean validationFlag = false;
                // for checking username and password if they match with the below given names
                if (!usernamev.isEmpty() && !passwordv.isEmpty()) {
                    if (usernamev.equals("sowmya") && passwordv.equals("sowmya")) {
                        validationFlag = true;

                    }
                }
                if (!validationFlag) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter valid Username and Password", Toast.LENGTH_LONG);
                    toast.setMargin(50, 50);
                    toast.show();
                } else {
                    //redirect to home page.
                    Intent redirect = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(redirect);
                }
            }
        });
    }
}