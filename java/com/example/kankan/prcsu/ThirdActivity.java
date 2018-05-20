package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


    }

    public void natural(View view) {
        Intent intent5=new Intent(ThirdActivity.this,Natural.class);
        startActivity(intent5);
    }

    public void employ(View view) {
        Intent intent6=new Intent(ThirdActivity.this,Employ.class);
        startActivity(intent6);
    }

    public void intern(View view) {
        Intent intent7=new Intent(ThirdActivity.this,intern1.class);
        startActivity(intent7);
    }

    public void food(View view) {
        Intent intent8=new Intent(ThirdActivity.this,Food.class);
        startActivity(intent8);
    }

    public void sports(View view) {
        Intent intent9=new Intent(ThirdActivity.this,Sports.class);
        startActivity(intent9);
    }

    public void needs(View view) {
        Intent intent10=new Intent(ThirdActivity.this,Need.class);
        startActivity(intent10);
    }
}
