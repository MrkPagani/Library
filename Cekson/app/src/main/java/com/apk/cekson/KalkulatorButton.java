package com.apk.cekson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.sql.ResultSet;

public class KalkulatorButton extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,btnTambah,btnKurang,buttonKali,buttonBagi,btnHapus,btnKoma,buttonEqual;
    TextView Result;
    float var1,var2;
    boolean Plus,Minus,Divide,Times;

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
        buttonEqual = findViewById(R.id.btnEqual);
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
        buttonEqual.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn0:
                Result.setText(Result.getText().toString().trim()+"0");
                break;
            case R.id.btn1:
                Result.setText(Result.getText().toString().trim()+"1");
                break;
            case R.id.btn2:
                Result.setText(Result.getText().toString().trim()+"2");
                break;
            case R.id.btn3:
                Result.setText(Result.getText().toString().trim()+"3");
                break;
            case R.id.btn4:
                Result.setText(Result.getText().toString().trim()+"4");
                break;
            case R.id.btn5:
                Result.setText(Result.getText().toString().trim()+"5");
                break;
            case R.id.btn6:
                Result.setText(Result.getText().toString().trim()+"6");
                break;
            case R.id.btn7:
                Result.setText(Result.getText().toString().trim()+"7");
                break;
            case R.id.btn8:
                Result.setText(Result.getText().toString().trim()+"8");
                break;
            case R.id.btn9:
                Result.setText(Result.getText().toString().trim()+"9");
                break;
            case R.id.btnTitik:
                Result.setText(Result.getText().toString().trim()+".");
                break;
            case R.id.btnPlus:
                var1 = Float.parseFloat(Result.getText().toString().trim());
                Plus = true;
                Result.setText(null);
                break;
            case R.id.btnMinus:
                var1 = Float.parseFloat(Result.getText().toString().trim());
                Minus = true;
                Result.setText(null);
                break;
            case R.id.btnKali:
                var1 = Float.parseFloat(Result.getText().toString().trim());
                Times = true;
                Result.setText(null);
                break;
            case R.id.btnBagi:
                var1 = Float.parseFloat(Result.getText().toString().trim());
                Divide = true;
                Result.setText(null);
                break;
            case R.id.btnClear:
                Result.setText(null);
                break;
            case R.id.btnEqual:
                var2 = Float.parseFloat(Result.getText().toString().trim());
                if (Plus == true){
                    Result.setText(var1 + var2 + "");
                    Plus = false;
                }
                if (Minus == true){
                    Result.setText(var1 - var2+"");
                    Minus = false;
                }
                if (Times == true){
                    Result.setText(var1 * var2+"");
                    Times = false;
                }
                if (Divide == true){
                    Result.setText(var1 / var2+"");
                    Divide = false;
                }
                break;
        }
    }
}
