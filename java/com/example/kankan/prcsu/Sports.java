package com.example.kankan.prcsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }
    public void needindoorgames(View view) {
        Intent intent8=new Intent(Sports.this,needindoorgames.class);
        startActivity(intent8);
}
    public void needoutdoorgames(View view) {
        Intent intent9=new Intent(Sports.this,needoutdoorgames.class);
        startActivity(intent9);
    }
    public void needathletics(View view) {
        Intent intent10=new Intent(Sports.this,needathletics.class);
        startActivity(intent10);
    }
}
