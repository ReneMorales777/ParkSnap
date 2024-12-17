package com.example.parksnap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.sql.*;


public class LibraryParking extends AppCompatActivity {

    public int i = 14;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_parking);

        String jdbc = "jdbc:sqlite:parksnap.db"; // used to connect to the SQLite database file

        int myColor = getResources().getColor(R.color.gray);

        Intent mainIntent = getIntent();
        TextView spotsAvailable = (TextView) findViewById(R.id.textView5);

        ToggleButton[] lot = new ToggleButton[16];

        lot[0] = (ToggleButton) findViewById(R.id.A1);
        lot[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "A1";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'A1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[0].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'A1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[0].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });

        lot[1] = (ToggleButton) findViewById(R.id.A2);
        lot[1].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "A2";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'A2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[1].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'A2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[1].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);

            }
        });
        lot[2] = (ToggleButton) findViewById(R.id.A3);
        lot[2].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "A3";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'A3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[2].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'A3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[2].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[3] = (ToggleButton) findViewById(R.id.A4);
        lot[3].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "A4";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'A4'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[3].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'A4'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[3].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });

        lot[4] = (ToggleButton) findViewById(R.id.B1);
        lot[4].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'B1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[4].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'B1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[4].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[5] = (ToggleButton) findViewById(R.id.B2);
        lot[5].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "B2";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'B2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[5].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'B2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[5].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[6] = (ToggleButton) findViewById(R.id.B3);
        lot[6].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "B3";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'B3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[6].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'B3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[6].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });

        lot[8] = (ToggleButton) findViewById(R.id.C1);
        lot[8].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "C1";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'C1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[8].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'C1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[8].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[9]= (ToggleButton) findViewById(R.id.C2);
        lot[9].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "C2";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'C2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[9].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'C2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[9].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[10] = (ToggleButton) findViewById(R.id.C3);
        lot[10].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "C3";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'C3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[10].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'C3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[10].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });

        lot[12] = (ToggleButton) findViewById(R.id.D1);
        lot[12].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "D1";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'D1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[12].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'D1'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[12].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[13] = (ToggleButton) findViewById(R.id.D2);
        lot[13].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "D2";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'D2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[13].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'D2'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[13].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[14] = (ToggleButton) findViewById(R.id.D3);
        lot[14].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "D3";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'D3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[14].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'D3'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[14].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });
        lot[15] = (ToggleButton) findViewById(R.id.D4);
        lot[15].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    num = "D4";
                    String update = "Update AudLot Set isOccupied='1' Where spotNum = 'D4'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();

                        st.executeUpdate(update);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[15].setBackgroundColor(Color.GREEN);
                    i--;
                }
                else{
                    String downdate = "Update AudLot Set isOccupied='0' Where spotNum = 'D4'";
                    try {
                        Connection c = DriverManager.getConnection("jdbc:sqlite:parksnap.db");
                        Statement st = c.createStatement();
                        int count = st.executeUpdate(downdate);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    lot[15].setBackgroundColor(myColor);
                    i++;
                }
                spotsAvailable.setText("Spots available: " + i);
            }
        });

        Intent outActivity = new Intent(this, CheckoutActivity.class);

        Button next = (Button) findViewById(R.id.ConfirmGym);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outActivity.putExtra(MainActivity.LOTNAME, "Library");
                outActivity.putExtra(MainActivity.SPOTNUM, num);
                startActivity(outActivity);
            }
        });



    }

}