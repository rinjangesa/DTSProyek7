package com.example.project7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class BerandaActivity extends AppCompatActivity {
    public static ArrayList<String> databunga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        if(databunga == null){
            databunga = new ArrayList<>();
            databunga.add("Mawar 8000");
            databunga.add("Melati 10000");
        }
    }

    public void btnLihatBunga(View view) {
        Intent i = new Intent(BerandaActivity.this, LihatBunga.class);
        startActivity(i);
    }

    public void btnTmbhBunga(View view) {
        Intent i = new Intent(BerandaActivity.this, TambahBunga.class);
        startActivity(i);
    }
}