package com.example.bloodsugarunitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity implements View.OnClickListener {

    public CardView c1 , c2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView call = findViewById(R.id.soscall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this , sos.class);
                startActivity(i);
            }
        });









        ImageView minfo = findViewById(R.id.moreinfo);
         minfo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               Intent intent = new Intent(home.this , Moreinfo.class);
               startActivity(intent);
             }
         });


        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {
            case R.id.c1:
                i = new Intent(this , card1.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this , card2.class);
                startActivity(i);
                break;

        }


    }
}