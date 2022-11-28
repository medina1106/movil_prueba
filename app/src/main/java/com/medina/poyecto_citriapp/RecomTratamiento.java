package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RecomTratamiento extends AppCompatActivity implements View.OnClickListener {
    LinearLayout lnlLimon, lnlNaraja, lnlMandarina, lnlLima, lnlTorinja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom_tratamiento);
        refereniar();
    }

    private void refereniar() {
        lnlLimon = findViewById(R.id.lnlLimon);
        lnlLimon.setOnClickListener(this);
        lnlNaraja =findViewById(R.id.lnlNaranja);
        lnlNaraja.setOnClickListener(this);
        lnlMandarina=findViewById(R.id.lnlMandarina);
        lnlMandarina.setOnClickListener(this);
        lnlLima=findViewById(R.id.lnlLima);
        lnlLima.setOnClickListener(this);
        lnlTorinja=findViewById(R.id.lnlTorinja);
        lnlTorinja.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}