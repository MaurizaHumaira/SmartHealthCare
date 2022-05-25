package com.example.smarthealthcare;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListPenyakit extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        TextView selBatukPilek = findViewById(R.id.selBatukPilek);
        TextView selRhinitis = findViewById(R.id.selRhinitis);
        TextView selBronkitis = findViewById(R.id.selBronkitis);
        TextView selDispepsia = findViewById(R.id.selDispepsia);
        TextView selTifus = findViewById(R.id.selTifus);
        TextView selInsomnia = findViewById(R.id.selInsomnia);
        TextView selPneumonia = findViewById(R.id.selPneumonia);



        selBatukPilek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListPenyakit.this, DetailPenyakit_BatukPilek.class));
            }
        });
    }
}
