package com.grupo5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBar1 extends AppCompatActivity {

    private SeekBar miSeekBar;
    private TextView textoResultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        textoResultado =(TextView) findViewById(R.id.txtCalificacion);
        miSeekBar = (SeekBar)findViewById(R.id.sbAtenccion);

        miSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               textoResultado.setText("Calificacion:"+miSeekBar.getProgress() + "/" + miSeekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("SEEKBAR","INICIADO");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(miSeekBar.getProgress()>=8){
                    textoResultado.setTextColor(Color.BLUE);

                }else{
                    textoResultado.setTextColor((Color.BLACK));
                }

            }
        });

    }
    public void Siguinte(View view){
        Intent siguiente=new Intent( this,RatingBar1.class);
        startActivity(siguiente);
    }
}
