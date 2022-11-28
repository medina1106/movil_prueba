package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class CultivoProdu extends AppCompatActivity implements View.OnClickListener {
    Button btnAgregarCu,btnAgregarTalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivo_produ);
         referenciar();

    }

    private void referenciar() {
        btnAgregarTalla = findViewById(R.id.btnAgregarTalla);
        btnAgregarTalla.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAgregarTalla:
                Intent intent = new Intent(CultivoProdu.this,CultivosProduccion.class);
                startActivity(intent);
                break;
        }


    }
}