package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected EditText edtNumber1, edtNumber2;
    protected TextView tvResultado;
    protected Button btnDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);

        tvResultado = findViewById(R.id.tvResultado);

        btnDo = findViewById(R.id.btnDo);
    }

    public void sumar(View view)
    {
        String strV1 = edtNumber1.getText().toString();
        String strV2 = edtNumber2.getText().toString();

        int v1 = Integer.parseInt(strV1);
        int v2 = Integer.parseInt(strV2);
        int iSuma = v1 + v2;
        String strResultado = String.valueOf(iSuma);

        tvResultado.setText(strResultado);
    }
}
