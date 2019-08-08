package com.apk.intentfragment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button explicitintent;
    private Button implicitintent;
    private Button login;
    private Button register;
    private Button bawah1;
    private Button bawah2;
    private Button bawah3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = findViewById(R.id.btn_explicit);
        explicitintent.setOnClickListener(this);
        implicitintent = findViewById(R.id.impicit);
        implicitintent.setOnClickListener(this);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(this);
        register = findViewById(R.id.btn_Register);
        register.setOnClickListener(this);
        bawah1 = findViewById(R.id.btn_bawah1);
        bawah1.setOnClickListener(this);
        bawah2 = findViewById(R.id.btn_bawah2);
        bawah2.setOnClickListener(this);
        bawah3 = findViewById(R.id.btn_bawah3);
        bawah3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_explicit:
                Intent expl = new Intent(MainActivity.this, IntentACtivity.class);
                startActivity(expl);
                break;
            case R.id.impicit:
                Intent empl= new Intent(Intent.ACTION_VIEW, Uri.parse("https://w3school.com"));
                startActivity(empl);
                break;
            case R.id.btn_login:
                Intent buttonLogin = new Intent(MainActivity.this, activity_login.class);
                startActivity(buttonLogin);
                break;
            case R.id.btn_Register:
                Intent buttonRegist = new Intent(MainActivity.this, activity_linear.class);
                startActivity(buttonRegist);
                break;
            case R.id.btn_bawah1:
                Intent buttonBawah1 = new Intent(MainActivity.this, activity_bawah1.class);
                startActivity(buttonBawah1);
                break;
            case R.id.btn_bawah2:
                Intent buttonBawah2 = new Intent(MainActivity.this, activity_bawah2.class);
                startActivity(buttonBawah2);
                break;
            case R.id.btn_bawah3:
                Intent buttonBawah3 = new Intent(MainActivity.this, activity_bawah3.class);
                startActivity(buttonBawah3);
                break;
                default:
                break;
        }
    }
}
