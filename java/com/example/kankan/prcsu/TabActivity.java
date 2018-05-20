package com.example.kankan.prcsu;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.TabHost;

public class TabActivity extends ActivityGroup {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());

        TabHost.TabSpec tabSpec=tabHost.newTabSpec("One");
        Intent intent1=new Intent(TabActivity.this,SecondActivity.class);
        tabSpec.setContent(intent1);
        tabSpec.setIndicator("Home");
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("Two");
        Intent intent11=new Intent(TabActivity.this,ThirdActivity.class);
        tabSpec.setIndicator("Scarce");
        tabSpec.setContent(intent11);
        tabHost.addTab(tabSpec);

        tabSpec=tabHost.newTabSpec("Three");
        Intent intent12=new Intent(TabActivity.this,FifthActivity.class);
        tabSpec.setContent(intent12);
        tabSpec.setIndicator("Excess");
        tabHost.addTab(tabSpec);



    }
}
