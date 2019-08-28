package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNamaDepan,txtNamaBelakang;
    TextView txtOutput;
    Button btn_tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaDepan = findViewById(R.id.txtNamaDepan);
        txtNamaBelakang = findViewById(R.id.txtNamaBelakang);
        txtOutput = findViewById(R.id.txtOutput);
        btn_tampil = findViewById(R.id.btn_tampil);

        btn_tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaDepan = txtNamaDepan.getText().toString();
                String namaBelakang = txtNamaBelakang.getText().toString();
                String Output = namaDepan + namaBelakang ;
                txtOutput.setText(Output);
            }
        });
    }
}
