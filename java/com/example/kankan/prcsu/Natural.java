package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Natural extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural);

    }

    public void needcoal(View view) {
        Intent intent8=new Intent(Natural.this,needcoal.class);
        startActivity(intent8);
    }

    public void needgas(View view) {
            Intent intent9 = new Intent(Natural.this, needgas.class);
            startActivity(intent9);
        }


        public void needelectricity(View view){
            Intent intent10 = new Intent(Natural.this, needelectricity.class);
            startActivity(intent10);
        }

        public void needoil(View view){
            Intent intent11 = new Intent(Natural.this, needoil.class);
            startActivity(intent11);
        }

        public void needwater(View view){
            Intent intent12 = new Intent(Natural.this, needwater.class);
            startActivity(intent12);
        }
    }
