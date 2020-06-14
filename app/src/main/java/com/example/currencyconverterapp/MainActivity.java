package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {


    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    textView.setError("Empty User Input");
                }else{
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    textView.setError("Empty User Input");
                }else{
                    double n=Double.parseDouble(z),k;
                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k=n*0.013;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String y = editText.getText().toString();
                if(TextUtils.isEmpty(y)){
                    textView.setError("Emty User Input");
                }else{
                    double n ,k;
                    n= Double.parseDouble(y);
                    Formatter formatter = new Formatter();
                    k=n*0.010;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                if(TextUtils.isEmpty(a)){
                    textView.setError("Empty User Input");
                }else{
                    double c,d;
                    c= Double.parseDouble(a);
                    d=c*1.41;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(d));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String x = editText.getText().toString();
               if(TextUtils.isEmpty(x)){
                   textView.setError("Emty User Input");
               }else{
                   double y,z;
                   y =Double.parseDouble(x);
                   z=y*0.0041;
                   DecimalFormat number = new DecimalFormat("#.00");
                   textView.setText(""+number.format(z));
               }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                if(TextUtils.isEmpty(a)){
                    textView.setError("Empty User input");
                }else{
                    double b,c;
                    b=Double.parseDouble(a);
                    c=b*0.0000014;
                    DecimalFormat numberFormat =  new DecimalFormat("#0.00");
                    textView.setText(""+numberFormat.format(c));
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String x = editText.getText().toString();
               if(TextUtils.isEmpty(x)){
                   editText.setError("Empty User Input");
               }else{
                   double y,z;
                   y=Double.parseDouble(x);
                   z=y*0.92;
                   DecimalFormat number = new DecimalFormat("#.00");
                   textView.setText(""+number.format(z));
               }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String a = editText.getText().toString();
               if(TextUtils.isEmpty(a)){
                   textView.setError("Empty User Input");
               }else{
                   double b,c;
                   b=Double.parseDouble(a);
                   c=b*0.019;
                   DecimalFormat numberformat = new DecimalFormat("#.00");
                   textView.setText(""+numberformat.format(c));
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    textView.setError("Empty User Input");
                }else{
                    double x , y;
                    x= Double.parseDouble(z);
                    y=x*0.018;
                    DecimalFormat number = new DecimalFormat("#.00");
                    textView.setText(""+number.format(y));

                }
            }
        });
    }
}
