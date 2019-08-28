package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhu extends AppCompatActivity {

    EditText edtCelcius,edtFarenheit,edtReamur,edtKelvin;
    Button buttonKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        edtCelcius = findViewById(R.id.editCelcius);
        edtFarenheit = findViewById(R.id.editFarenheit);
        edtKelvin = findViewById(R.id.editKelvin);
        edtReamur = findViewById(R.id.editReamur);
        buttonKonversi = findViewById(R.id.btnKonversi);

        buttonKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int celcius = Integer.parseInt(edtCelcius.getText().toString().trim());
                double farenheit = celcius * 273.15;
                double kelvin = celcius * 1.8 * 32;
                double reamur = celcius * 6.8;
                edtKelvin.setText(String.valueOf(kelvin));
                edtFarenheit.setText(String.valueOf(farenheit));
                edtReamur.setText(String.valueOf(reamur));
            }
        });
    }


}
