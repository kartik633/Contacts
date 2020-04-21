package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView tt1,tt2;
    Button bnt;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tt1 = findViewById(R.id.tt1);
        tt2 = findViewById(R.id.tt2);
        bnt = findViewById(R.id.bnt);
        edt = findViewById(R.id.edt);

        String name = getIntent().getStringExtra("name");
        tt1.setText("hi, its " + name);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity2.this,"",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int value = Integer.parseInt(edt.getText().toString().trim());
                    if(value>18)
                    {
                        tt2.setText("You Are Above 18 years of age");
                    }
                    else
                    {
                        tt2.setText("You Are Below 18 years of age");
                    }
                }
            }
        });
    }
}
