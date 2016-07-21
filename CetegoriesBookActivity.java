package com.example.dhkansat.librarymenagement.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.dhkansat.librarymenagement.Model.CetegoriesBook;
import com.example.dhkansat.librarymenagement.R;

public class CetegoriesBookActivity extends AppCompatActivity {
    EditText cetegoriesNameET;
    CetegoriesBook cetegoriesBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetegories_book);
        cetegoriesNameET= (EditText) findViewById(R.id.cetegoriesNameET);
    }

    public void saveCetegoriesName(View view) {
        String cetergoriesName=cetegoriesNameET.getText().toString();
       cetegoriesBook=new CetegoriesBook(cetergoriesName);
    }

    public void BacktoCetegories(View view) {
    }
}
