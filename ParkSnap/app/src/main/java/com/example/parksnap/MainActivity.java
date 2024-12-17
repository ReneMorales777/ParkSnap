package com.example.parksnap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.security.Guard;

public class MainActivity extends AppCompatActivity {

    public static final String LOTNAME = "com.example.parksnap.LOTNAME";
    public static final String SPOTNUM = "com.example.parksnap.SPOTNUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make intents
        Intent Gparklot = new Intent(this, GymParkinLot.class);
        Intent Lparklot = new Intent(this, LibraryParking.class);
        Intent Aparklot = new Intent(this, AuditoriumParking.class);

        //make buttons
        ImageButton GymB = (ImageButton) findViewById(R.id.GymImmageButton);
        ImageButton LibB = (ImageButton) findViewById(R.id.LibImmageButton);
        ImageButton AudB = (ImageButton) findViewById(R.id.AudImmageButton);

        GymB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Gparklot);
            }
        });

        LibB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Lparklot);
            }
        });

        AudB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Aparklot);
            }
        });
    }
}