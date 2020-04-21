package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText ett;
    Button bkt,bkt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ett = findViewById(R.id.ett);
        bkt = findViewById(R.id.bkt);
        bkt1 = findViewById(R.id.bkt1);

        bkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ett.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity3.this,"",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String email = ett.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("email",email);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();
                }
            }
        });
        bkt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                Activity3.this.finish();
            }
        });
    }
}
