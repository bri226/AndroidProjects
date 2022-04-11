package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity 
{
    private EditText et1;
    private EditText et2;
    private TextView tv;
    private RadioButton rb1, rb2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar los valores de los componentes y
        //Comunicarnos con la parte gráfica
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar); 
    }
    
    //MÉTODO PARA EL BOTÓN CALCULAR
    public void Calcular(View view)
    {
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();
        
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if(rb1.isChecked())
        {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv.setText(resultado);
        }else if(rb2.isChecked())
        {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv.setText(resultado);
        }
    }
}

