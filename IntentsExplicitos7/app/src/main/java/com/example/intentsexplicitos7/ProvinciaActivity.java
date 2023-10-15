package com.example.intentsexplicitos7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ProvinciaActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provincia);

        radioGroup = findViewById(R.id.radioGroup);
        b2 = findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = "";
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == R.id.r1) {
                    texto = getString(R.string.r1);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r2) {
                    texto = getString(R.string.r2);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r3) {
                    texto = getString(R.string.r3);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r4) {
                    texto = getString(R.string.r4);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r5) {
                    texto = getString(R.string.r5);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r6) {
                    texto = getString(R.string.r6);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }else if (selectedId == R.id.r7) {
                    texto = getString(R.string.r7);
                    setResult(RESULT_OK, new Intent().putExtra("data", texto));
                    finish();
                }
            }
        });
    }
}