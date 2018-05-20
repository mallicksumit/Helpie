package com.example.kankan.prcsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void needpaidfood(View view) {
        Intent intent8=new Intent(Food.this,needpaidfood.class);
        startActivity(intent8);
    }
    public void needfoodcharity(View view) {
        Intent intent9=new Intent(Food.this,needfoodcharity.class);
        startActivity(intent9);
    }
    public void needluxuryfood(View view) {
        Intent intent10=new Intent(Food.this,needluxuryfood.class);
        startActivity(intent10);
    }

}
