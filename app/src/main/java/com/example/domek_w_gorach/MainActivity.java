package com.example.domek_w_gorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button polubienia = findViewById(R.id.Like);
        Button usun = findViewById(R.id.unlike);
        Button zapisz = findViewById(R.id.zapisz);
        TextView licznik = findViewById(R.id.licznik);
        final int[] counter = {0};

        polubienia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter[0]++;

                licznik.setText(String.valueOf(counter[0] + " polubień"));


            }
        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter[0]<1){
                    Toast.makeText(MainActivity.this, "Nie można dać minusowej ilości polubień", Toast.LENGTH_SHORT).show();
                }else {
                    counter[0]--;
                }

                licznik.setText(String.valueOf(counter[0] + " polubień"));
            }
        });

        };
    }
