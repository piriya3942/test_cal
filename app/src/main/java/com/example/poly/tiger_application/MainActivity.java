package com.example.poly.tiger_application;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText etNumberOne;
    private AppCompatEditText etNumnerTwo;
    private AppCompatButton btnPlus;
    private AppCompatButton btnMinus;
    private AppCompatButton btnMuliply;
    private AppCompatButton btnDivid;
    private AppCompatTextView tvResult;
    private Calculater cal= new Calculater();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumnerTwo = findViewById(R.id.etNumberTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMuliply = findViewById(R.id.btnMuliply);
        btnDivid =findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne=etNumberOne.getText().toString();
                String numberTwo=etNumnerTwo.getText().toString();
                if(etNumberOne.length()>0 && etNumnerTwo.length()>0) {
                    int result = cal.plus(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));
                    tvResult.setText(String.valueOf(result));
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne=etNumberOne.getText().toString();
                String numberTwo=etNumnerTwo.getText().toString();
                int result = cal.minus(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));
            }
        });

        btnMuliply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne=etNumberOne.getText().toString();
                String numberTwo=etNumnerTwo.getText().toString();
                int result = cal.muliply(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));
            }
        });

        btnDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne=etNumberOne.getText().toString();
                String numberTwo=etNumnerTwo.getText().toString();
                int result = cal.drivid(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}
