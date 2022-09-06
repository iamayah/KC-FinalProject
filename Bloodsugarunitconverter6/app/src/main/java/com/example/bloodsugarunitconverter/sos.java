package com.example.bloodsugarunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);


        Button call = findViewById(R.id.callbtn);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cintent = new Intent(Intent.ACTION_DIAL);
                cintent.setData(Uri.parse("tel:112"));
                startActivity(cintent);
            }
        });
    }
}