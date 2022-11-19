package com.example.materialdesign2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SecondFragment extends Fragment {
    Button buttonSignUp;
    Button buttonSignCancel;

    //нужный фрагменту интерфейс
    public interface SecondFragmentInterface {
        public void toSecondMainActivity3();
        public void toFirstFragment();
    }
    private SecondFragment.SecondFragmentInterface secondFragmentInterface;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.second_fragment, container, false);
        buttonSignUp=view.findViewById(R.id.buttonUp);
        buttonSignCancel=view.findViewById(R.id.buttonCancel);


        View.OnClickListener clickOnButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (v.getId()) {
                    case R.id.buttonUp:
                        if (secondFragmentInterface !=null)
                        secondFragmentInterface.toSecondMainActivity3();
                        //intent=new Intent(MainActivity2.this, MainActivity3.class);
                        //startActivity(intent);
                        break;
                    case R.id.buttonCancel:

                        FragmentTransaction transaction;
                        transaction = getFragmentManager().beginTransaction();
                        FirstFragment firstFragment =new FirstFragment();
                        // Replace whatever is in the fragment_container view with this fragment,
                        //and add the transaction to the back stack
                        transaction.replace(R.id.container, firstFragment);
                        transaction.addToBackStack(null);
                        // Commit the transaction
                        transaction.commit();
                        break;
                }
            }
        };
        buttonSignUp.setOnClickListener(clickOnButton);
        buttonSignCancel.setOnClickListener(clickOnButton);
        return view;
    }
        /*
        void dataReceived(String data){
            receiveData.setText(data);
        }

         */

    //ЖЦ выполняется когда фрагмент подсоединяется к активности
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof SecondFragment.SecondFragmentInterface){
            secondFragmentInterface=(SecondFragment.SecondFragmentInterface) context;
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
