package com.example.welcome.tempapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.welcome.tempapp.R.id.login;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = (EditText) findViewById(R.id.umane);
        EditText password = (EditText) findViewById(R.id.pword);
        Button login =(Button) findViewById(R.id.login);
        TextView forgotpwd = (TextView) findViewById(R.id.fpwd);
        CheckBox remember = (CheckBox) findViewById(R.id.remember);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, DrawableActivity.class);
                startActivity(intent);
            }
        });


    }
public void login()
{

}


}
