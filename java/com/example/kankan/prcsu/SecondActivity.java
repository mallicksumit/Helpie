package com.example.kankan.prcsu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(intent1);
            }
        });

    }

    public void start(View view) {
        Intent intent1=new Intent(SecondActivity.this,FourthActivity.class);
        startActivity(intent1);
    }

    public void share(View view) {
        Intent intent3=new Intent(SecondActivity.this,share.class);
        startActivity(intent3);
    }



    public void contribute(View view) {
        Intent intent4=new Intent(SecondActivity.this,Contribute.class);
        startActivity(intent4);
    }



    public void btnmission(View view) {
        Intent intent2=new Intent(SecondActivity.this,Ourmission.class);
        startActivity(intent2);
    }

}

