package com.example.intentsexplicitos9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bWeb, bMap, bMail;

    EditText tUrl, tLatitud, tLongitud, tEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bWeb = findViewById(R.id.bWeb);
        bMap = findViewById(R.id.bMap);
        bMail = findViewById(R.id.bMail);

        tUrl = findViewById(R.id.tUrl);
        tLatitud = findViewById(R.id.tLatitud);
        tLongitud = findViewById(R.id.tLongitud);
        tEmail = findViewById(R.id.tEmail);

        bWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://"+tUrl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        bMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String latitud = tLatitud.getText().toString();
                String longitud = tLongitud.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+longitud+","+latitud));
                startActivity(intent);
            }
        });

        bMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = tEmail.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Soul Society");
                intent.putExtra(Intent.EXTRA_TEXT, "In the dark we're the same, in the concept of time\n" +
                        "We're like a grain in the sand\n" +
                        "And we strive for the flame as if death was our aim\n" +
                        "Cause we cannot understand");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });



    }
}