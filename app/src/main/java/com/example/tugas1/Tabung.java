package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {

    private EditText etJari, etTinggi;
    private Button btnVolTab;
    private TextView tvHasilTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        etJari = findViewById(R.id.etJari);
        etTinggi = findViewById(R.id.etTinggi);
        btnVolTab = findViewById(R.id.btnVolTab);
        tvHasilTab = findViewById(R.id.tvHasilTab);

        btnVolTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String tJari = etJari.getText().toString();
                    String tTinggi = etTinggi.getText().toString();

                    double jari = Double.parseDouble(tJari);
                    double tinggi = Double.parseDouble(tTinggi);

                    double hasil = Math.PI*jari*jari*tinggi;

                    String tHasil = String.valueOf(hasil);
                    tvHasilTab.setText(tHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
