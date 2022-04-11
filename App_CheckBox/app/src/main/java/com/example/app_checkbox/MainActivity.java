package com.example.app_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectar con parte gráfica
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        check1 = (CheckBox)findViewById(R.id.check_suma);
        check2 = (CheckBox)findViewById(R.id.check_resta);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
    }

    public void Calcular(View view)
    {
        //Recuperar los valores
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        String resultado = "";

        if(check1.isChecked()){
            int suma = valor1_int + valor2_int;
            resultado = " La suma es: " + suma + " / ";
        }
        if(check2.isChecked()){
            int resta = valor1_int - valor2_int;
            resultado = resultado + " La resta es: " + resta;
        }
        tv1.setText(resultado);

    }
}

