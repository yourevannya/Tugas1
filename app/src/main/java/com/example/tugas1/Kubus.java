package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kubus extends AppCompatActivity {

    private EditText etRusuk;
    private Button btnVolKub;
    private TextView tvHasilKub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        etRusuk = findViewById(R.id.etRusuk);
        btnVolKub = findViewById(R.id.btnVolKub);
        tvHasilKub = findViewById(R.id.tvHasilKub);

        btnVolKub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String kRusuk = etRusuk.getText().toString();

                    double rusuk = Double.parseDouble(kRusuk);

                    double hasil = rusuk*rusuk*rusuk;

                    String kHasil = String.valueOf(hasil);
                    tvHasilKub.setText(kHasil);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
