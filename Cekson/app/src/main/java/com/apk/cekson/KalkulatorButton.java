package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class KalkulatorButton extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,btnTambah,btnKurang,buttonKali,buttonBagi,btnHapus,btnKoma;
    TextView Result;
    Float var1,var2,var3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_button);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        btnTambah = findViewById(R.id.btnPlus);
        btnKurang = findViewById(R.id.btnMinus);
        buttonKali = findViewById(R.id.btnKali);
        buttonBagi = findViewById(R.id.btnBagi);
        btnKoma = findViewById(R.id.btnTitik);
        btnHapus = findViewById(R.id.btnClear);
        Result = findViewById(R.id.angka);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
        buttonKali.setOnClickListener(this);
        btnKoma.setOnClickListener(this);
        btnHapus.setOnClickListener(this);
        Result.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn0:


        }

    }
}
