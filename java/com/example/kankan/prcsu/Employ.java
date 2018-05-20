package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Employ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employ);
        }


    public void needtechnical(View view) {
        Intent intent8=new Intent(Employ.this,needtechnical.class);
        startActivity(intent8);
    }
    public void needmba(View view) {
        Intent intent9=new Intent(Employ.this,needmba.class);
        startActivity(intent9);
    }
    public void needaccountancy(View view) {
        /*Intent intent10=new Intent(Employ.this,needaccountancy.class);
        startActivity(intent10);*/
    }
    public void needwholesale(View view) {
        Intent intent11=new Intent(Employ.this,needwholesale.class);
        startActivity(intent11);
    }
    public void needpaidlabour(View view) {
        Intent intent12=new Intent(Employ.this,needpaidlabour.class);
        startActivity(intent12);
    }
}



