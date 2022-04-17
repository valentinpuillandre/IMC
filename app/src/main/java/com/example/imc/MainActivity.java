package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtResultat;
    float num1 = 0;
    float num2 = 0;
    float result = 0;
    private EditText txtPoids;
    private EditText txtTaille;
    private Button btCalculer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btCalculer = (Button) findViewById(R.id.idCalculer);
        this.txtResultat = (EditText) findViewById(R.id.idResultat);
        this.txtPoids = (EditText) findViewById(R.id.idPoids);
        this.txtTaille = (EditText) findViewById(R.id.idTaille);

        this.txtPoids.setOnClickListener(this);
        this.txtTaille.setOnClickListener(this);
        this.btCalculer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    switch (v.getId())
    {

        case R.id.idCalculer:{

            num1 = Float.parseFloat(this.txtPoids.getText().toString());
            num2 = Float.parseFloat(this.txtTaille.getText().toString());
            result = num1/(num2*num2);
            txtResultat.getText().toString();
            txtResultat.setText(String.valueOf(result));
        }break;
    }
    }
}