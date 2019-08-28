package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    private EditText edtPanjang, edtLebar;
    private Button button_hitung;
    private TextView textLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText) findViewById(R.id.editPanjang);
        edtLebar = findViewById(R.id.editLebar);
        button_hitung = findViewById(R.id.btn_hitung);
        textLuas = findViewById(R.id.txtLuas);

        button_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;
                textLuas.setText("Luas : "+luas);
            }
        });
    }
}
