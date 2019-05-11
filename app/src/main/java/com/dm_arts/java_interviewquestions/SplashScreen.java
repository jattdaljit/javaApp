package com.dm_arts.java_interviewquestions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends Activity {
    Handler handler;
    String correct;
    int time;
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
            correct = prefs.getString("correct", "false");//"No name defined" is the default value.
            time = prefs.getInt("time", 300000000); //0 is the default value.




        if (correct.equals("false")) {
            handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    presentDialog();
                }
            },1000);
        } else
        {
            handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent=new Intent(getApplicationContext(),JAVA.class);
                    startActivity(intent);
                    finish();
                }
            },time);
        }



    }

    public void presentDialog() {
        Toast toast = Toast.makeText(getApplicationContext(), "Answer correctly to enter !!" , Toast.LENGTH_LONG);
        toast.show();
        final String[] answers = new String[4];

        answers[0] = "Polymorphism";
        answers[1] = "Inheritance";
        answers[2] = "Collection";
        answers[3] = "Abstraction";

        AlertDialog.Builder builder = new AlertDialog.Builder(SplashScreen.this);
        builder.setTitle(
                "Which of following is not OOP's concept ?")
                .setItems(answers, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == 2 ) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                            editor.putString("correct", "true");
                            editor.putInt("time", 2000);
                            editor.apply();
                            Intent intent=new Intent(getApplicationContext(),JAVA.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Wrong answer try again !!" , Toast.LENGTH_SHORT);
                            toast.show();
                            presentDialog();
                        }
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
