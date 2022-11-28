package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
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

public class AgregTalla extends AppCompatActivity  implements View.OnClickListener {

    EditText edtTxtFech,edtTalla;
    Spinner spnMedi;

    String[] Medidas={"cm", "m", ""};
    ArrayAdapter<String> adapter;
    int ano, mes, dia;


    Button btnAgregartalla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreg_talla);
        referenciar();

        spnMedi= (Spinner) findViewById(R.id.spnMedi);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Medidas);
        spnMedi.setAdapter(adapter);
    }

    private void referenciar() {
        edtTxtFech = findViewById(R.id.edtTxtFech);
        edtTxtFech.setOnClickListener(this);

        edtTalla = findViewById(R.id.edtTalla);
        edtTalla.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {
        if (v == edtTxtFech) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(AgregTalla.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    edtTxtFech.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }
                    , dia, mes, ano);
            datePickerDialog.show();
        }
    }




    }
