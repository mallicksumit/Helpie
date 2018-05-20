package com.example.kankan.prcsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Need extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need);
    }
    public void needwear(View view) {
        Intent intent8=new Intent(Need.this,needwear.class);
        startActivity(intent8);
    }
    public void needgadget(View view) {
        Intent intent9=new Intent(Need.this,needgadget.class);
        startActivity(intent9);
    }
    public void needstationery(View view) {
        Intent intent8=new Intent(Need.this,needstationery.class);
        startActivity(intent8);
    }
    public void needfurniture(View view) {
        Intent intent10=new Intent(Need.this,needfurniture.class);
        startActivity(intent10);
    }
    public void needfootwear(View view) {
        Intent intent8=new Intent(Need.this,needfootwear.class);
        startActivity(intent8);
    }
}
