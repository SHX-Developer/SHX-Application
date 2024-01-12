package com.example.shahrixapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cities extends AppCompatActivity {

    Button tashkent_button;
    Button ferghana_button;
    Button termez_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cities);

        tashkent_button = (Button) findViewById(R.id.tashkent_button);
        tashkent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenTashkentPage();
            }
        });
        ferghana_button = (Button) findViewById(R.id.ferghana_button);
        ferghana_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenFerghanaPage();
            }
        });
        termez_button = (Button) findViewById(R.id.termez_button);
        termez_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenTermezPage();
            }
        });
    }
    public void OpenTashkentPage() {
        Intent intent = new Intent(this, Tashkent.class);
        startActivity(intent);
    }
    public void OpenFerghanaPage() {
        Intent intent = new Intent(this, Ferghana.class);
        startActivity(intent);
    }
    public void OpenTermezPage() {
        Intent intent = new Intent(this, Termez.class);
        startActivity(intent);
    }
}
