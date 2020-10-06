package com.example.project7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatBunga extends AppCompatActivity {

    private ListView listBunga;
    private ArrayAdapter<String> adapterBunga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_bunga);
        this.listBunga = this.findViewById(R.id.listview);

        this.adapterBunga = new ArrayAdapter<>(
                this,
                R.layout.list_view_lihat_bunga,
                BerandaActivity.databunga
        );
        this.listBunga.setAdapter(this.adapterBunga);
    }
}