package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView tv1,tv2;
    Button bt1,bt2,bt3,bt4;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);

        String name = getIntent().getStringExtra("name");
        tv1.setText("hi, its " + name);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(ed1.getText().toString().trim());
                double second = Double.parseDouble(ed2.getText().toString().trim());
                double result = first + second ;
                String res = "the answer is " + result;
                tv2.setText(res);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(ed1.getText().toString().trim());
                double second = Double.parseDouble(ed2.getText().toString().trim());
                double result = first - second ;
                String res = "the answer is " + result;
                tv2.setText(res);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(ed1.getText().toString().trim());
                double second = Double.parseDouble(ed2.getText().toString().trim());
                double result = first * second ;
                String res = "the answer is " + result;
                tv2.setText(res);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(ed1.getText().toString().trim());
                double second = Double.parseDouble(ed2.getText().toString().trim());
                double result = first / second ;
                String res = "the answer is " + result;
                tv2.setText(res);
            }
        });
    }
}