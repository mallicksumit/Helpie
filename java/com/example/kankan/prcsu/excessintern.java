package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class excessintern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excessintern);
    }

    public void excesspaidintern(View view) {
        Intent intent12 = new Intent(excessintern.this, excesspaidintern.class);
        startActivity(intent12);
    }

    public void excessvocationalintern(View view) {
        Intent intent11 = new Intent(excessintern.this, excessvocationalintern.class);
        startActivity(intent11);
    }

    public void excessmbaintern(View view) {
        Intent intent10 = new Intent(excessintern.this, excessmbaintern.class);
        startActivity(intent10);
    }

    public void excesstechnicalintern(View view) {
        Intent intent9 = new Intent(excessintern.this, excesstechnicalintern.class);
        startActivity(intent9);
    }

    public void excessaccountancyintern(View view) {
        Intent intent8 = new Intent(excessintern.this, excessaccountancyintern.class);
        startActivity(intent8);
    }
}
