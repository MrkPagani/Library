package com.apk.intentfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_bawah2 extends AppCompatActivity {

    private EditText angka1;
    private EditText angka2;
    private EditText jumlah;
    private Button btn_Jumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bawah2);
        initUI();
        initEvent();
    }


    public void initUI() {
        angka1 = findViewById(R.id.nilai1);
        angka2 = findViewById(R.id.nilai2);
        jumlah = findViewById(R.id.total_Jumlah);
        btn_Jumlah = findViewById(R.id.btn_Jumlah);
    }

    public void initEvent(){
        btn_Jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {

        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka2.getText().toString());
        int hasil = nilai1 + nilai2;
        jumlah.setText(hasil+"");

    }

}
