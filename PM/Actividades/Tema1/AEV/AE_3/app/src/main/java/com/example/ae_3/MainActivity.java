package com.example.ae_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvClick = findViewById(R.id.clickLargo);
        TextView tvRating = findViewById(R.id.rating);
        RatingBar rb = findViewById(R.id.ratingBar);

        tvClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this, "Texto de ejemplo", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tvRating.setText(v+"/5");
            }
        });

    }

    public void muestar(View v) {

        CheckBox mostrar = findViewById(R.id.muestra);

        if (mostrar.isChecked() == true) {

            TextView tv = findViewById(R.id.oculto);
            tv.setVisibility(View.VISIBLE);

        } else if(mostrar.isChecked() == false){

            TextView tv = findViewById(R.id.oculto);
            tv.setVisibility(View.GONE);

        }

    }

    public void fondoRojo(View v) {

        LinearLayout cambioFondo = findViewById(R.id.cambioFondo);

        cambioFondo.setBackgroundColor(0xffff0000);

    }

    public void cambiarColorLetras(View v) {

        Button letrasRojas = findViewById(R.id.letrasRojas);

        letrasRojas.setTextColor(0xffff0000);

    }

    public void ponerImagenDeFondo(View v) {

        Switch sw = findViewById(R.id.switch1);
        LinearLayout ll = findViewById(R.id.LINEAR);



    }

}