package com.example.kankan.prcsu;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import static com.example.kankan.prcsu.DATABASE.DatabaseHelper.COL_2;

public class ListAdapterHelper extends CursorAdapter
{
   public ListAdapterHelper(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent)
    {
        return LayoutInflater.from(context).inflate(R.layout.list_item_mallick, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {

       TextView nameTextView = (TextView) view.findViewById(R.id.list_item_name);

        int nameColumnIndex = cursor.getColumnIndex(COL_2);

        String petName = cursor.getString(nameColumnIndex);

        nameTextView.setText(petName);
    }
}