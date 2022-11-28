package com.medina.poyecto_citriapp.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.medina.poyecto_citriapp.AgregarCul;
import com.medina.poyecto_citriapp.CultivosProduccion;
import com.medina.poyecto_citriapp.R;
import com.medina.poyecto_citriapp.RecomTratamiento;

public class MenuOpc extends AppCompatActivity implements View.OnClickListener {
    CardView crdAgre,crdPro,crdTrata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciar();






    }

    private void referenciar() {
        crdAgre = findViewById(R.id.crdAgre);
        crdAgre.setOnClickListener(this);
        crdPro= findViewById(R.id.crdPro);
        crdPro.setOnClickListener(this);
        crdTrata = findViewById(R.id.crdTrata);
        crdTrata.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.crdAgre:
                Intent intent = new Intent(MenuOpc.this, AgregarCul.class);
                startActivity(intent);

                break;
            case R.id.crdPro:
                Intent intent2 = new Intent(MenuOpc.this, CultivosProduccion.class);
                startActivity(intent2);

                break;

            case  R.id.crdTrata:
                Intent intent3 = new Intent(MenuOpc.this, RecomTratamiento.class);
                startActivity(intent3);

        }

    }
}