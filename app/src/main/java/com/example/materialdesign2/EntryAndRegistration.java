package com.example.materialdesign2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class EntryAndRegistration extends AppCompatActivity implements FirstFragment.FirstFragmentInterface, SecondFragment.SecondFragmentInterface {
    Fragment fragment;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_and_registration);
        fragment=new SecondFragment();

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        FirstFragment firstFragment=new FirstFragment();
        fragmentTransaction.add(R.id.container, firstFragment);
        fragmentTransaction.commit();




    }

    @Override
    public void toMainActivity3(){
        Intent intent = new Intent(EntryAndRegistration.this, MainActivity3.class);
        startActivity(intent);
    }


    @Override
    public void toSecondMainActivity3(){
        Intent intent = new Intent(EntryAndRegistration.this, MainActivity3.class);
        startActivity(intent);
    }
    @Override
    public void toFirstFragment(){
        Intent intent = new Intent(EntryAndRegistration.this, MainActivity3.class);
        startActivity(intent);
    }

}