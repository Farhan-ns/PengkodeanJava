package com.acer.pengkodeanjava.tugasTerstruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.acer.pengkodeanjava.MathParser;
import com.acer.pengkodeanjava.R;

public class KalkulatorJavaActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAngka1, btnAngka2, btnAngka3, btnAngka4, btnAngka5, btnAngka6, btnAngka7, btnAngka8, btnAngka9, btnAngka0;
    Button btnOperatorTambah, btnOperatorMinus, btnOperatorKali, btnOperatorBagi, btnOperatorDesimal;
    Button btnHasil, btnClear;
    EditText edtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_java);

        btnAngka0 = findViewById(R.id.btn_angka_0);
        btnAngka1 = findViewById(R.id.btn_angka_1);
        btnAngka2 = findViewById(R.id.btn_angka_2);
        btnAngka3 = findViewById(R.id.btn_angka_3);
        btnAngka4 = findViewById(R.id.btn_angka_4);
        btnAngka5 = findViewById(R.id.btn_angka_5);
        btnAngka6 = findViewById(R.id.btn_angka_6);
        btnAngka7 = findViewById(R.id.btn_angka_7);
        btnAngka8 = findViewById(R.id.btn_angka_8);
        btnAngka9 = findViewById(R.id.btn_angka_9);

        btnAngka0.setOnClickListener(this);
        btnAngka1.setOnClickListener(this);
        btnAngka2.setOnClickListener(this);
        btnAngka3.setOnClickListener(this);
        btnAngka4.setOnClickListener(this);
        btnAngka5.setOnClickListener(this);
        btnAngka6.setOnClickListener(this);
        btnAngka7.setOnClickListener(this);
        btnAngka8.setOnClickListener(this);
        btnAngka9.setOnClickListener(this);

        btnOperatorTambah = findViewById(R.id.btn_operator_tambah);
        btnOperatorMinus = findViewById(R.id.btn_operator_minus);
        btnOperatorKali = findViewById(R.id.btn_operator_kali);
        btnOperatorBagi = findViewById(R.id.btn_operator_bagi);
        btnOperatorDesimal = findViewById(R.id.btn_operator_desimal);

        btnOperatorTambah.setOnClickListener(this);
        btnOperatorMinus.setOnClickListener(this);
        btnOperatorKali.setOnClickListener(this);
        btnOperatorBagi.setOnClickListener(this);
        btnOperatorDesimal.setOnClickListener(this);

        btnHasil = findViewById(R.id.btn_hasil);
        btnClear = findViewById(R.id.btn_clear);
        edtInput = findViewById(R.id.edt_input);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = edtInput.getText().toString();
                double resultValue = MathParser.eval(inputValue);
                edtInput.setText(String.valueOf(resultValue));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText("");
            }
        });

    }


    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;
        String text = clickedButton.getText().toString();
        edtInput.append(text);
    }
}
