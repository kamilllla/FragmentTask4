/* package com.example.materialdesign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    static final String EMAIL_PATTERN="^([a-z0-9]{1,})+@([a-z0-9]{1,})+[\\.]{1}[a-z]{2,3}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSignIn= (Button) findViewById(R.id.buttonIn);
        Button buttonSignUp=(Button) findViewById(R.id.buttonUp);
        TextInputEditText textInputEditTextEmail=(TextInputEditText) findViewById(R.id.textInputEmail);
        TextInputEditText textInputEditTextPassword=(TextInputEditText) findViewById(R.id.textInputPassword);
        TextInputLayout textInputLayoutEmail=(TextInputLayout) findViewById(R.id.outlinedTextField2);
        TextInputLayout textInputLayoutPassword=(TextInputLayout) findViewById(R.id.outlinedTextField3);
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);//конструктор регулярных выражений



        View.OnClickListener clickOnButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInputLayoutEmail.setError(null);
                textInputLayoutPassword.setError(null);
                Intent intent;
                switch (v.getId()) {
                    case R.id.buttonIn:
                        if (textInputEditTextEmail.getText().length() == 0 || textInputEditTextPassword.getText().length() == 0) {

                            if (textInputEditTextEmail.getText().length() == 0 && textInputEditTextPassword.getText().length() == 0) {
                                textInputLayoutEmail.setError("Enter Email");
                                textInputLayoutPassword.setError("Enter Password");

                            } else {
                                if (textInputEditTextPassword.getText().length() == 0) {
                                    textInputLayoutPassword.setError("Enter Password");
                                } else {
                                    textInputLayoutEmail.setError("Enter Email");
                                }
                            }
                        } else {
                            Matcher matcher=pattern.matcher(textInputEditTextEmail.getText());//класс, из которого создается объект для поиска совпадений по шаблону.
                            if(matcher.matches()) {
                                intent = new Intent(MainActivity.this, MainActivity3.class);
                                startActivity(intent);
                            }
                            else{
                                textInputLayoutEmail.setError("Incorrect Email");
                            }
                        }
                        break;

                    case R.id.buttonUp:
                        intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        buttonSignIn.setOnClickListener(clickOnButton);
        buttonSignUp.setOnClickListener(clickOnButton);


        }
}

 */