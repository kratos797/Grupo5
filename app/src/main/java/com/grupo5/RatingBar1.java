package com.grupo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBar1 extends AppCompatActivity {
    private RatingBar ratinbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        ratinbar=(RatingBar)findViewById(R.id.ratingBar);
        ratinbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(RatingBar1.this,"Usted ha votado con: "+rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}
