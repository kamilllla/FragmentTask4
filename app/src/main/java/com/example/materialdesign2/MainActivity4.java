package com.example.materialdesign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ipsec.ike.exceptions.IkeNetworkLostException;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //класс, который используется для работы с очередью сообщений, связанной с потоком
        new Handler().postDelayed(new Runnable() {//многопоточность
            @Override
            public void run() {
                startActivity(new Intent(MainActivity4.this, EntryAndRegistration.class));
                finish();
            }
        },3000);
    }
}