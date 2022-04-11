package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        et3 = (EditText)findViewById(R.id.txt_num3);
        tv1 = (TextView)findViewById(R.id.txt_tv1);

    }

    public void funcion(View view){
        String nota1 = et1.getText().toString();
        String nota2 = et2.getText().toString();
        String nota3 = et3.getText().toString();


        int num1 = Integer.parseInt(nota1);
        int num2 = Integer.parseInt(nota2);
        int num3 = Integer.parseInt(nota3);

        int resultado = (num1 + num2 + num3)/3;

        if(resultado>5){
            tv1.setText("Estatus Aprobado con "+resultado);
        }else{
            tv1.setText("Estatus Desaprobado con "+resultado);
        }

    }

}