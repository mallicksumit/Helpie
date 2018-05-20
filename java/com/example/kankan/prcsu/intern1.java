package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class intern1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern1);
    }

    public void needtechnicalintern(View view) {
        Intent intent8 = new Intent(intern1.this, needtechnicalintern.class);
        startActivity(intent8);
    }

    public void needaccountancyintern(View view) {
        Intent intent9 = new Intent(intern1.this, needaccountancyintern.class);
        startActivity(intent9);
    }

    public void needmbaintern(View view) {
        Intent intent10 = new Intent(intern1.this, needmbaintern.class);
        startActivity(intent10);
    }

    public void needvocationalintern(View view) {
        Intent intent11 = new Intent(intern1.this, needvocationalintern.class);
        startActivity(intent11);
    }

    public void needpaidintern(View view) {
        Intent intent12 = new Intent(intern1.this, needpaidintern.class);
    startActivity(intent12);
}
}

