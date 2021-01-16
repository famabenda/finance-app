package com.example.finance_app;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class ErrorHandler {

    public static void printErrorToUser(String message) {
        Toast.makeText(null, message, Toast.LENGTH_LONG).show();
    }
}
