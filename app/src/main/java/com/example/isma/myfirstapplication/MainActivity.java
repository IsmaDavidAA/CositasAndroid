package com.example.isma.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textNum1;
    private EditText textNum2;
    private TextView text_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNum1 = (EditText)findViewById(R.id.textNum1);
        textNum2 = (EditText)findViewById(R.id.textNum2);
        text_Resultado = (TextView) findViewById(R.id.text_Resultado);
    }

    public void sumar(View view) {
        String valor1 = textNum1.getText().toString();
        String valor2 = textNum2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;
        String result = String.valueOf(suma);
        text_Resultado.setText(result);
    }
}

