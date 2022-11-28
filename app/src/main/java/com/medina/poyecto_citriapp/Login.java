package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.medina.poyecto_citriapp.Controller.MenuOpc;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        referenciar();
    }

    private void referenciar() {
        btnInicio=findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnInicio:
                Intent intent = new Intent(Login.this, MenuOpc.class);
                startActivity(intent);
                break;
        }

    }
}