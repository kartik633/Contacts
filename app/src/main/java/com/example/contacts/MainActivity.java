package com.example.contacts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etID1,etID2;
    Button btn1,btn2,btn3;
    TextView tvResults;
    final int ACTIVITY3 = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID1 = findViewById(R.id.etID1);
        etID2 = findViewById(R.id.etID2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        tvResults = findViewById(R.id.tvResults);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etID1.getText().toString().isEmpty() || etID2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etID1.getText().toString().trim();
                    String surname = etID1.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,com.example.contacts.Activity1.class);
                    String srk =name + " " + surname;
                    intent.putExtra("name",srk);
                    startActivity(intent);
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etID1.getText().toString().isEmpty() || etID2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etID1.getText().toString().trim();
                    String surname = etID1.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,com.example.contacts.Activity2.class);
                    String srk =name + " " + surname;
                    intent.putExtra("name",srk);
                    startActivity(intent);
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etID1.getText().toString().isEmpty() || etID2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,com.example.contacts.Activity3.class);
                    startActivityForResult(intent,ACTIVITY3);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ACTIVITY3)
        {
            if(resultCode == RESULT_OK)
            {
                tvResults.setText(data.getStringExtra("email"));
            }
            if(resultCode == RESULT_CANCELED)
            {
                tvResults.setText("No Data Received");
            }
        }
    }
}