package com.example.parksnap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;import java.sql.*;
import java.util.Objects;


public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        String jdbc = "jdbc:sqlite:parksnap.db"; // used to connect to the SQLite database file
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:myDatabase.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Intent mainIntent = getIntent();

        String dblot;
        String lotname = mainIntent.getStringExtra(MainActivity.LOTNAME);
        if (Objects.equals(lotname, "Library"))
            dblot = "LibLot";
        else if(Objects.equals(lotname, "Auditorium"))
            dblot = "AudLot";
        else
            dblot = "GymLot";


        String spotnum = mainIntent.getStringExtra(MainActivity.SPOTNUM);

        TextView lot = (TextView) findViewById(R.id.lotName);
        TextView spot = (TextView) findViewById(R.id.boxnumber);


        lot.setVisibility(View.VISIBLE);
        lot.setText(lotname);

        spot.setVisibility(View.VISIBLE);
        spot.setText(spotnum);


        Intent byeActivity = new Intent(this, GoodbyeActivity.class);

        Button next = (Button) findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String update = "Update '"+ dblot + "' Set isOccupied='0' Where spotNum = '"+spotnum+"'";
                try {
                    Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                    Statement st = c.createStatement();

                    st.executeUpdate(update);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                startActivity(byeActivity);
            }
        });

    }
}