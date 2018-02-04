package com.example.android.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        TextView cafe = (TextView) findViewById(R.id.txt_cafe);
        TextView porsi = (TextView) findViewById(R.id.txt_jumlah);
        TextView harga = (TextView) findViewById(R.id.txt_harga);
        cafe.setText(b.getCharSequence("cafe"));
        porsi.setText(b.getCharSequence("porsi"));
        harga.setText(b.getCharSequence("harga"));
    }

}
