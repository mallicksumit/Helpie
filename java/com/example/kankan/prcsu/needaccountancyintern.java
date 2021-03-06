package com.example.kankan.prcsu;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kankan.prcsu.DATABASE.DatabaseHelper;
import android.support.v7.app.AlertDialog;

public class needaccountancyintern extends AppCompatActivity {
    Button btnlookfor;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(this);
        setContentView(R.layout.activity_needaccountancyintern);
        btnlookfor=(Button)findViewById(R.id.btnlookfor);
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

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Email :" + res.getString(1) + "\n");
                            buffer.append("Name :" + res.getString(2) + "\n");
                            buffer.append("Mobile:" + res.getString(3) + "\n");
                            buffer.append("Description :" + res.getString(4) + "\n");
                            buffer.append("Type :" + res.getString(5) + "\n\n");
                        }

                        // Show all data
                        showMessage("Data", buffer.toString());
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