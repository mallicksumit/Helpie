package com.example.kankan.prcsu;

import android.content.Intent;
import android.database.Cursor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kankan.prcsu.DATABASE.DatabaseHelper;

public class excessvocationalintern extends AppCompatActivity {
    EditText editname, edittype, editphn, editdescription, editemail;
    Button submitcoal ;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excessvocationalintern);
        myDb = new DatabaseHelper(this);

        editname = (EditText) findViewById(R.id.edtname);
        edittype = (EditText) findViewById(R.id.edttype);
        editphn = (EditText) findViewById(R.id.edtphn);
        editdescription = (EditText) findViewById(R.id.edtdescription);
        editemail = (EditText) findViewById(R.id.edtemail);
        submitcoal = (Button) findViewById(R.id.submitcoal);

        AddData();

    }


    public void AddData() {
        submitcoal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(
                                editemail.getText().toString(), editname.getText().toString(), editphn.getText().toString(),
                                editdescription.getText().toString(), edittype.getText().toString());
                        if (isInserted == true)
                            Toast.makeText(excessvocationalintern.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(excessvocationalintern.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}