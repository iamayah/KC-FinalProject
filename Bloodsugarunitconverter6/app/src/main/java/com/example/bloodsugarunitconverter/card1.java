package com.example.bloodsugarunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class card1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        EditText entr = findViewById(R.id.entrq);
        Button calc = findViewById(R.id.calc);
        TextView thetotal = findViewById(R.id.total);
        Button rst = findViewById(R.id.reset);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(entr.getText().toString());

                double ttl = num1 * 18 ;
                thetotal.setText(String.valueOf(ttl));


                if (ttl <= 70){

                    Toast.makeText(card1.this, "يرجى الإنتباه. معدل السكر لديك منخفض", Toast.LENGTH_LONG).show();

                }else if (ttl >= 200){

                    Toast.makeText(card1.this, "معدل السكر لديك مرتفع", Toast.LENGTH_LONG).show();

                }else {

                    Toast.makeText(card1.this, "معدل السكر لديك طبيعي ", Toast.LENGTH_LONG).show();
                }







            }
        });

       rst.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               entr.setText(null);
               entr.dispatchDisplayHint(View.VISIBLE);

               thetotal.setText("___");


           }
       });


    }
}