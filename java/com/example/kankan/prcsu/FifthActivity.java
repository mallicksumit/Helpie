package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }



    public void natural(View view) {
        Intent intent5=new Intent(FifthActivity.this,Naturalexcess.class);
        startActivity(intent5);
    }

    public void employ(View view) {
        Intent intent6=new Intent(FifthActivity.this,Employexcess.class);
        startActivity(intent6);
    }

    public void intern(View view) {
        Intent intent7=new Intent(FifthActivity.this,excessintern.class);
        startActivity(intent7);
    }

    public void food(View view) {
        Intent intent8=new Intent(FifthActivity.this,Foodexcess.class);
        startActivity(intent8);
    }

    public void sports(View view) {
        Intent intent9=new Intent(FifthActivity.this,Sportsexcess.class);
        startActivity(intent9);
    }

    public void needs(View view) {
        Intent intent10=new Intent(FifthActivity.this,Needexcess.class);
        startActivity(intent10);
    }
}
