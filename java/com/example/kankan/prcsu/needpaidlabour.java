package com.example.kankan.prcsu;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.kankan.prcsu.DATABASE.DatabaseHelper;
import android.support.v7.app.AlertDialog;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class needpaidlabour extends AppCompatActivity {
    Button btnlookfor;
    DatabaseHelper myDb;
    ArrayAdapter<String> adapter;
    ListView mList;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(this);
        setContentView(R.layout.activity_needpaidlabour);
        btnlookfor=(Button)findViewById(R.id.btnlookfor);
        mList = (ListView) findViewById(R.id.list_view_needpaidlabour);
        list = new ArrayList<>();
        viewAll();

    }

    public void viewAll() {
        btnlookfor.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if (res.getCount() == 0) {
                            // show message
                            showMessage("Error", "Nothing found");
                            return;
                        }


                        list.clear();
                        while (res.moveToNext()) {
                            if (res.getString(5).equalsIgnoreCase("paidlabour"))
                            {
                                StringBuffer buffer = new StringBuffer();
                                buffer.append("Email :" + res.getString(1) + "\n");
                                buffer.append("Name :" + res.getString(2) + "\n");
                                buffer.append("Mobile:" + res.getString(3) + "\n");
                                buffer.append("Description :" + res.getString(4) + "\n");
                                buffer.append("Type :" + res.getString(5) + "\n\n");
                                list.add(new String(buffer.toString()));
                            }
                            else
                                continue;

                        }
                        adapter = new ArrayAdapter<String>(needpaidlabour.this, android.R.layout.simple_list_item_1, list);
                        mList.setAdapter(adapter);
                        // Show all data
                    }
                }
        );
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}