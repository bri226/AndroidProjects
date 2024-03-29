package com.example.appuno;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //clase R: Android crea de manera automática, conecta parte lógica y gráfica
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    public void Sumar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 =  Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma);

        tv1.setText(result);
    }
}