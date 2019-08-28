package com.acer.pengkodeanjava.tugasTerstruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.acer.pengkodeanjava.R;

public class KonverterSuhuActivity extends AppCompatActivity {
    EditText edtInput, edtFahrenheit, edtKelvin, edtReamur;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konverter_suhu);
        edtInput = findViewById(R.id.edt_input);
        edtFahrenheit = findViewById(R.id.edt_fahrenheit);
        edtKelvin = findViewById(R.id.edt_kelvin);
        edtReamur = findViewById(R.id.edt_reamur);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(edtInput.getText().toString());
                convert(value);
            }
        });
    }

    private void convert(double value) {
        double fahrenheit = value * 1.8 + 32;
        double kelvin = value + 273.15;
        double reamur = value * 9 / 5 + 491.67;

        edtFahrenheit.setText(String.valueOf(fahrenheit));
        edtKelvin.setText(String.valueOf(kelvin));
        edtReamur.setText(String.valueOf(reamur));
    }
}
