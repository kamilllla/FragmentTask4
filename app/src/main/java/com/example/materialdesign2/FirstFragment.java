package com.example.materialdesign2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstFragment extends Fragment {
    static final String EMAIL_PATTERN="^([a-z0-9]{1,})+@([a-z0-9]{1,})+[\\.]{1}[a-z]{2,3}";
    private Button signIn;
    private Button signUp;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private Pattern pattern=Pattern.compile(EMAIL_PATTERN);

        //нужный фрагменту интерфейс
        public interface FirstFragmentInterface {
            public void toMainActivity3();
        }
        private FirstFragmentInterface firstFragmentInterface;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view =inflater.inflate(R.layout.first_fragment, container, false);
            signIn=view.findViewById(R.id.buttonIn);
            signUp=view.findViewById(R.id.buttonUp);
            textInputEditTextEmail=view.findViewById(R.id.textInputEmail);
            textInputEditTextPassword=view.findViewById(R.id.textInputPassword);
            textInputLayoutEmail=view.findViewById(R.id.outlinedTextField2);
            textInputLayoutPassword=view.findViewById(R.id.outlinedTextField3);
            signUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentTransaction forSecondFragment;
                    forSecondFragment = getFragmentManager().beginTransaction();
                    SecondFragment fragment1 =new SecondFragment();
                    // Replace whatever is in the fragment_container view with this fragment,
                    //and add the transaction to the back stack
                    forSecondFragment.replace(R.id.container, fragment1);
                    forSecondFragment.addToBackStack(null);
                    // Commit the transaction
                    forSecondFragment.commit();
                    Log.i("tag", "click__________");



                }
            });

            signIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textInputLayoutEmail.setError(null);
                    textInputLayoutPassword.setError(null);
                    Intent intent;
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
                        Matcher matcher = pattern.matcher(textInputEditTextEmail.getText());//класс, из которого создается объект для поиска совпадений по шаблону.
                        if (matcher.matches()) {

                            //intent = new Intent(MainActivity.this, MainActivity3.class);
                            //startActivity(intent);
                            if (firstFragmentInterface != null)
                                firstFragmentInterface.toMainActivity3();
                        } else {
                            textInputLayoutEmail.setError("Incorrect Email");
                        }
                    }
                }
            });
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
            if (context instanceof FirstFragmentInterface){
                firstFragmentInterface=(FirstFragmentInterface) context;
            }

        }

        @Override
        public void onDetach() {
            super.onDetach();
        }
}
