package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Foodexcess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodexcess);
    }

    public void excessluxuryfood(View view) {
        Intent intent8=new Intent(Foodexcess.this,excessluxuryfood.class);
        startActivity(intent8);
    }

    public void excessfoodcharity(View view) {
        Intent intent9=new Intent(Foodexcess.this,excessfoodcharity.class);
        startActivity(intent9);
    }

    public void excesspaidfood(View view) {
        Intent intent10=new Intent(Foodexcess.this,excesspaidfood.class);
        startActivity(intent10);
    }
}
