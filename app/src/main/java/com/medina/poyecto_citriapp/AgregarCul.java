package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;
import java.util.UUID;

public class AgregarCul extends AppCompatActivity implements View.OnClickListener {

     EditText edtTxtFech;
     int ano, mes, dia;
     Calendar calendar;
     Button btnAgregarCu;
     Spinner spnLug,spnTip,spnMed;
     String[] Medidas={"cm", "m", ""};
     String[] Municipios={"Municipio", "Miranda", "Padilla", "Timbio", "Morales", "La Sierra"};
     String[] TipoCit={"Tipo de citrico", "limon", "naranja", "lima", "mandarina", "tangelo"};
     ArrayAdapter<String> adapter;

     EditText nombre_cultivo,edtTalla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_cul);
        referenciar();

        spnMed=(Spinner) findViewById(R.id.spnMed);
        spnLug = (Spinner) findViewById(R.id.spnLug);
        spnTip = (Spinner) findViewById(R.id.spnTip);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Medidas);
        spnMed.setAdapter(adapter);


        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, TipoCit);
        spnTip.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Municipios);
        spnLug.setAdapter(adapter);

        edtTxtFech = findViewById(R.id.edtTxtFech);
        edtTxtFech.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v == edtTxtFech) {
                    final Calendar c = Calendar.getInstance();
                    dia = c.get(Calendar.DAY_OF_MONTH);
                    mes = c.get(Calendar.MONTH);
                    ano = c.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog datePickerDialog = new DatePickerDialog(AgregarCul.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            edtTxtFech.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                        }
                    }
                            , dia, mes, ano);
                    datePickerDialog.show();
                }

            }
        });

    }

     private void referenciar() {
         btnAgregarCu = findViewById(R.id.btnAgregarCu);
         btnAgregarCu.setOnClickListener(this);
         nombre_cultivo = findViewById(R.id.edtTxtNom);
         edtTalla = findViewById(R.id.edtTalla);
     }

     @Override
     public void onClick(View view) {
         switch (view.getId()){
             case R.id.btnAgregarCu:
                 Intent intent = new Intent(AgregarCul.this,CultivosProduccion.class);
                 AgregarCultivo();
                 startActivity(intent);
                 break;
         }

     }


     private void   AgregarCultivo() {


     }

     }






