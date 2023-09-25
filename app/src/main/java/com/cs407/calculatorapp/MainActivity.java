package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOnClick(View view){
        EditText num1Text = (EditText) findViewById(R.id.n1TextField);
        EditText num2Text = (EditText) findViewById(R.id.n2TextField);
        Double n1 = Double.parseDouble(num1Text.getText().toString());
        Double n2 = Double.parseDouble(num2Text.getText().toString());
        goToActivity(n1+n2);

    }
    public void subtractOnClick(View view){
        EditText num1Text = (EditText) findViewById(R.id.n1TextField);
        EditText num2Text = (EditText) findViewById(R.id.n2TextField);
        Double n1 = Double.parseDouble(num1Text.getText().toString());
        Double n2 = Double.parseDouble(num2Text.getText().toString());
        goToActivity(n1-n2);

    }
    public void multOnClick(View view){
        EditText num1Text = (EditText) findViewById(R.id.n1TextField);
        EditText num2Text = (EditText) findViewById(R.id.n2TextField);
        Double n1 = Double.parseDouble(num1Text.getText().toString());
        Double n2 = Double.parseDouble(num2Text.getText().toString());
        goToActivity(n1*n2);

    }
    public void divOnClick(View view){
        EditText num1Text = (EditText) findViewById(R.id.n1TextField);
        EditText num2Text = (EditText) findViewById(R.id.n2TextField);
        Double n1 = Double.parseDouble(num1Text.getText().toString());
        Double n2 = Double.parseDouble(num2Text.getText().toString());
        goToActivity(n1/n2);

    }

    public void goToActivity(Double result){
        Intent intent= new Intent(this, resultsActivity.class);
        intent.putExtra("message", result+"");
        startActivity(intent);
    }
}