package com.apk.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detail_gomart extends AppCompatActivity {

    public String extra1;
    public String extra2;
    public String extra3;
    public TextView Nama,Alamat,Order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gomart);

        extra1 = getIntent().getStringExtra("nama");
        extra2 = getIntent().getStringExtra("alamat");
        extra3 = getIntent().getStringExtra("order");

        Nama = findViewById(R.id.nama);
        Nama.setText(extra1);
        Alamat = findViewById(R.id.alamat);
        Alamat.setText(extra2);
        Order = findViewById(R.id.order);
        Order.setText(extra3);

    }
}
