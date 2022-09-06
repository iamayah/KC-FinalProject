package com.example.bloodsugarunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class card2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);

        EditText entrr = findViewById(R.id.entrq2);
        Button calcc = findViewById(R.id.calc2);
        TextView thetotall = findViewById(R.id.total2);
        Button rstt = findViewById(R.id.reset2);

        calcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(entrr.getText().toString());

                double totl = n1 / 18;

                thetotall.setText(String.valueOf(totl));



                if (totl <= 3.9 ){

                    Toast.makeText(card2.this, "يرجى الإنتباه. معدل السكر لديك منخفض", Toast.LENGTH_LONG).show();

                }else if (totl >= 11){

                    Toast.makeText(card2.this, "معدل السكر لديك مرتفع", Toast.LENGTH_LONG).show();

                }else {

                    Toast.makeText(card2.this, "معدل السكر لديك طبيعي ", Toast.LENGTH_LONG).show();
                }



            }
        });



        rstt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrr.setText(null);
                entrr.dispatchDisplayHint(View.VISIBLE);

                thetotall.setText("___");
            }
        });

    }
}