package com.example.control_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText et1, et2;
    private Spinner spinner1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
        spinner1 = (Spinner)findViewById(R.id.spinner);

        String [] opciones = {"Sumar","Restar","Multiplicar","Dividir"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);
    }

    //Método del botón
    public void Calcular(View view)
    {
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        String seleccion = spinner1.getSelectedItem().toString();

        if(seleccion.equals("Sumar"))
        {
            int suma = valor1_int+valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }
        else if(seleccion.equals("Resta"))
        {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
        else if(seleccion.equals("Multiplicar"))
        {
            int producto = valor1_int*valor2_int;
            String resultado = String.valueOf(producto);
            tv1.setText(resultado);
        }
        else if(seleccion.equals("Dividir"))
        {
            if(valor2_int !=0)
            {
                int division = valor1_int / valor2_int;
                String resultado = String.valueOf(division);
                tv1.setText(resultado);
            }else {
                Toast.makeText(this,"No se puede dividir entre cero",Toast.LENGTH_LONG).show();
            }
        }
    }
}