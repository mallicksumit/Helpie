package com.example.kankan.prcsu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kankan.prcsu.DATABASE.DatabaseHelper;

import org.w3c.dom.Text;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {


  DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.imageglobe);

        Bitmap bm=BitmapFactory.decodeResource(getResources(),R.drawable.download);
        img.setImageBitmap(bm);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,TabActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
                myDb = new DatabaseHelper(MainActivity.this);
            }



}
