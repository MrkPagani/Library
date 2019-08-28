package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KalkulatorSuhu extends AppCompatActivity implements View.OnClickListener {
    EditText vtxtA , vtxtB,vtxtC;

    protected float ytxtA,ytxtB,ytxtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_suhu);

        vtxtA = findViewById(R.id.txtA);
        vtxtB = findViewById(R.id.txtB);
        vtxtC = findViewById(R.id.txtC);

        Button vBtnTambah = findViewById(R.id.btnTambah);
        Button vBtnKurang = findViewById(R.id.btnKurang);
        Button vBtnKali = findViewById(R.id.btnKali);
        Button vBtnBagi = findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v){
        ytxtA = Float.parseFloat(vtxtA.getText().toString());
        ytxtB = Float.parseFloat(vtxtB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                ytxtC = ytxtA + ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnKurang:
                ytxtC = ytxtA - ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnKali:
                ytxtC = ytxtA * ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnBagi:
                ytxtC = ytxtA / ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
        }
    }
}
