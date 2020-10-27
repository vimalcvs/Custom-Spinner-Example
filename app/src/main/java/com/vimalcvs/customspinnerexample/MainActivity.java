package com.vimalcvs.customspinnerexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

/**
 *   VimalCVS - 29/10/2020
 **/

public class MainActivity extends AppCompatActivity {
    private ArrayList<SpinnerItem> mCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner_countries);

        SpinnerAdapter mAdapter = new SpinnerAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerItem clickedItem = (SpinnerItem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(MainActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new SpinnerItem("India", R.drawable.india));
        mCountryList.add(new SpinnerItem("Israel", R.drawable.israel));
        mCountryList.add(new SpinnerItem("USA", R.drawable.usa));
        mCountryList.add(new SpinnerItem("Afghanistan", R.drawable.afghanistan));
        mCountryList.add(new SpinnerItem("Australia", R.drawable.australia));
        mCountryList.add(new SpinnerItem("Pakistan", R.drawable.pakistan));


    }
}