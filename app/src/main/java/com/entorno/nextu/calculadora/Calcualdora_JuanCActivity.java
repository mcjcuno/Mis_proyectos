package com.entorno.nextu.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calcualdora_JuanCActivity extends AppCompatActivity {

    TextView entradau;
    double n1, n2,resultado;
    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcualdora__juan_c);
    }

    public void bcero (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "0");

    }
    public void buno (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "1");

    }
    public void bdos (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "2");

    }
    public void btres (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "3");

    }
    public void bcuatro (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "4");

    }
    public void bcinco (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "5");

    }
    public void bseis (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "6");

    }
    public void bsiete (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "7");

    }
    public void bocho (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "8");

    }
    public void bnueve (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ "0");

    }
    public void bpunto (View view){
        entradau = (TextView) findViewById(R.id.entradau);
        entradau.setText(entradau.getText()+ ".");

    }
    //almacenamiento del primer numero q se marque

    public void onClickcapturanumero (View view){

        entradau = (TextView) findViewById(R.id.entradau);
    }


}
