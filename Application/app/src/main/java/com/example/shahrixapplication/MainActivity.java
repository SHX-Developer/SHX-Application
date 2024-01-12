package com.example.shahrixapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button cities_button;
    Button rate_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cities_button = (Button) findViewById(R.id.find_cities_button);
        cities_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCitiesPage();
            }
        });
    }
        public void OpenCitiesPage(){
            Intent intent = new Intent(this, Cities.class);
            startActivity(intent);
    }
}
