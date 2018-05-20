package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Naturalexcess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturalexcess);
    }

    public void excesscoal(View view) {
    Intent intent8=new Intent(Naturalexcess.this,excesscoal.class);
    startActivity(intent8);
    }

    public void excesswater(View view) {
        Intent intent9=new Intent(Naturalexcess.this,excesswater.class);
        startActivity(intent9);
    }

    public void excessgas(View view) {
        Intent intent11=new Intent(Naturalexcess.this,excessgas.class);
        startActivity(intent11);
    }

    public void excesselectricity(View view) {
        Intent intent12=new Intent(Naturalexcess.this,excesselectricity.class);
        startActivity(intent12);
    }

    public void excessoil(View view) {
        Intent intent10=new Intent(Naturalexcess.this,excessoil.class);
        startActivity(intent10);
    }
}
