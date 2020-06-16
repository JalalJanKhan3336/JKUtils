package com.pakistan.jkutil.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class ContextUtils {

    private ContextUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Cannot instantiate Abstract Class");
    }

    public static void toast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    public static void setUpToolbar(AppCompatActivity context, Toolbar toolbar, String title, boolean goBack) {
        context.setSupportActionBar(toolbar);

        if(context.getSupportActionBar() != null){
            context.getSupportActionBar().setTitle(title);

            if(goBack){
                context.getSupportActionBar().setHomeButtonEnabled(true);
                context.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

        }

    }

    public static void showOneButtonDialog(Context context, String title, String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
    }

}
