package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhu extends AppCompatActivity {

    EditText edtCelcius,edtFarenheit,edtReamur,edtKelvin;
    Button buttonKonversi;
    float farenheit,celcius,kelvin,reamur;

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
                celcius = Float.parseFloat(edtCelcius.getText().toString().trim());
                farenheit = (celcius *9/5)+32;
                kelvin = celcius+273;
                reamur =(float) (0.8*celcius);

                edtFarenheit.setText(farenheit+"");
                edtKelvin.setText(kelvin+"");
                edtReamur.setText(reamur+"");
            }
        });
    }


}
