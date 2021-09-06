package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class Splash_screen extends AppCompatActivity {

    public static ArrayList<model_class> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        list= new ArrayList<>();
        list.add(new model_class("The base current amplification factor β is given by_________","IC/IB"," IB/IC"," IE/IB"," IB/IE","IC/IB"));
        list.add(new model_class("The range of β is?","20 to 500","50 to 300","30 to 400","10 to 20","20 to 500"));
        list.add(new model_class("BJT is","a voltage control device","a current controlled device","a temperature controlled device","none of these","a voltage control device"));
        list.add(new model_class("The level of doping of emitter section of a transistor has to be","More than the collector and base.","Smaller than the collector and base.","lesser than the base region but greater than the collector region","More than base region only","More than the collector and base."));
        list.add(new model_class("A bipolar junction transistor when used as a switch, operates in","cut-off and active region","active and saturation region","cut-off and saturation region","all of these","cut-off and saturation region"));

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_screen.this,RegistrationPage.class));
            }
        },4000);
    }
}