package com.example.thuchanhtuan2_1bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtHeSoA=findViewById(R.id.edtHeSoA);
        EditText edtHeSoB=findViewById(R.id.edtHeSoB);
        EditText edtKQ=findViewById(R.id.edtKQ);
        Button btnTong=findViewById(R.id.btnTong);
        Button btnHieu=findViewById(R.id.btnHieu);
        Button btnTich=findViewById(R.id.btnTich);
        Button btnThuong=findViewById(R.id.btnThuong);
        Button btnGPTB1=findViewById(R.id.btnGPTB1);
        Button btnGPTB2=findViewById(R.id.btnGPTB2);
        Button btnThoat=findViewById(R.id.btnThoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.valueOf(edtHeSoA.getText().toString());
                float b=Float.valueOf(edtHeSoB.getText().toString());

                edtKQ.setText(String.valueOf(a+b));

            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.valueOf(edtHeSoA.getText().toString());
                float b=Float.valueOf(edtHeSoB.getText().toString());

                edtKQ.setText(String.valueOf(a-b));

            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.valueOf(edtHeSoA.getText().toString());
                float b=Float.valueOf(edtHeSoB.getText().toString());

                edtKQ.setText(String.valueOf(a*b));

            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.valueOf(edtHeSoA.getText().toString());
                float b=Float.valueOf(edtHeSoB.getText().toString());

                edtKQ.setText(String.valueOf(a/b));

            }
        });
        btnGPTB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.valueOf(edtHeSoA.getText().toString());
                float b=Float.valueOf(edtHeSoB.getText().toString());
                String kq=GiaiPhuongTrinhBac1.giaiPhuongTrinhBac1(a,b);
                edtKQ.setText(kq);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}