package com.passionategeekz.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


int TeamA=0;
int TeamB=0;
int wcteama =0;
int wcteamb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =(Button)findViewById(R.id.newm);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Reset",Toast.LENGTH_LONG).show();
                TeamA (TeamA*=0);
                wcteama (wcteama*=0);
                TeamB (TeamB*=0);
                wcteamb (wcteamb*=0);
            }
        });

    }

    public void Fourt(View view) {
        TeamB (TeamB+=4);
       
    }

    public void sixt(View view) {
        TeamB (TeamB+=6);
    }
    public void singlet(View view) {
        TeamB (TeamB+=1);
    }
    public void twot(View view) {
        TeamB (TeamB+=2);
    }
    public void noballt(View view) {
        TeamB (TeamB+=1);
    }
    public void wideballtt (View view) {
        TeamB (TeamB+=1);
    }
    public void freehitt(View view) {
        TeamB (TeamB+=0);
    }

    public void Four(View view) {
        TeamA (TeamA+=4);

    }

    public void six(View view) {
        TeamA (TeamA+=6);
    }
    public void single(View view) {
        TeamA (TeamA+=1);
    }
    public void two(View view) {
        TeamA (TeamA+=2);
    }
    public void noball(View view) {
        TeamA (TeamA+=1);
    }
    public void wideball(View view) {
        TeamA (TeamA+=1);
    }
    public void freehit(View view) {
        TeamA (TeamA+=0);
    }


    public void TeamA (int c)
    {
        TextView t =(TextView)findViewById(R.id.runsteama);
        t.setText(""+TeamA);


    }
    public void TeamB (int c)
    {
        TextView t =(TextView)findViewById(R.id.runsteamb);
        t.setText(""+TeamB);

    }




    public void wcteama (int a)
    {
        TextView t =(TextView)findViewById(R.id.WC);
        t.setText(""+wcteama);
    }
    public void wcteamb (int a)
    {
        TextView t =(TextView)findViewById(R.id.wcteamb);
        t.setText(""+wcteamb);

    }


    public void outteama(View view) {
        wcteama(wcteama++);
    }

    public void outteamb(View view) {
        wcteamb(wcteamb++);
    }

}

