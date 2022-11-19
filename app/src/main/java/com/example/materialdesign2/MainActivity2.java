/*package com.example.materialdesign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttonSignUp= (Button) findViewById(R.id.buttonUp);
        Button buttonSignCancel=(Button) findViewById(R.id.buttonCancel);

        View.OnClickListener clickOnButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (v.getId()) {
                    case R.id.buttonUp:
                        intent=new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent);
                        break;
                    case R.id.buttonCancel:
                        intent=new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        buttonSignUp.setOnClickListener(clickOnButton);
        buttonSignCancel.setOnClickListener(clickOnButton);

    }
}

 */