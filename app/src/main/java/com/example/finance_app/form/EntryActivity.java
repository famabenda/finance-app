package com.example.finance_app.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.finance_app.ErrorHandler;
import com.example.finance_app.R;

public class EntryActivity extends AppCompatActivity {


    private double userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText amountTextField = findViewById(R.id.inputAmountTextField);
        Button continueButton = findViewById(R.id.continueButtonInputAmount);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    userInput = Double.parseDouble(String.valueOf(amountTextField.getText()));
                    System.out.println(userInput);
                }catch (NumberFormatException nfe){
                    ErrorHandler.printErrorToUser("Bitte gib einen gültigen Betrag ein");
                }
            }
        });

    }
}