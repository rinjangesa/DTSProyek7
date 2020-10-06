package com.example.project7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class TambahBunga extends AppCompatActivity {

    EditText edtketerangan, edtharga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_bunga);

        this.edtketerangan = this.findViewById(R.id.edt_keterangan);
        this.edtharga = this.findViewById(R.id.edt_harga);
    }

    public void btnSimpan(View view) {
        String keterangan = this.edtketerangan.getText().toString();
        String harga = this.edtharga.getText().toString();

        if (isAngka(harga)){
            String bunga= keterangan + " - " + harga;
            BerandaActivity.databunga.add(bunga);

            Toast.makeText(this, "Data Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Data Gagal", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isAngka(String harga) {
        try {
            Double.parseDouble(harga);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}