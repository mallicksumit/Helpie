package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sportsexcess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportsexcess);
    }

    public void excessathletics(View view) { Intent intent8=new Intent(Sportsexcess.this,excessathletics.class);
        startActivity(intent8);
    }

    public void excessoutdoorgames(View view) {
    Intent intent9=new Intent(Sportsexcess.this,excessoutdoorgames.class);
    startActivity(intent9);}

    public void excessindoorgames(View view) {
        Intent intent10=new Intent(Sportsexcess.this, excessindoorgames.class);
        startActivity(intent10);
    }
}
