package com.medina.poyecto_citriapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;


import com.medina.poyecto_citriapp.AgregarCul;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class AgregarCultivo {
private String id;
    private String nombre_cultivo;
    private String lugar_siembra;
    private String tipo_citrico;
    private String Fecha;
    private  String talla;
    private  String medida;



    public AgregarCultivo() {

    }

    public AgregarCultivo(String id, String nombre_cultivo, String lugar_siembra, String tipo_citrico, String fecha, String talla, String medida) {
        this.id = id;
        this.nombre_cultivo = nombre_cultivo;
        this.lugar_siembra = lugar_siembra;
        this.tipo_citrico = tipo_citrico;
        Fecha = fecha;
        this.talla = talla;
        this.medida = medida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_cultivo() {
        return nombre_cultivo;
    }

    public void setNombre_cultivo(String nombre_cultivo) {
        this.nombre_cultivo = nombre_cultivo;
    }

    public String getLugar_siembra() {
        return lugar_siembra;
    }

    public void setLugar_siembra(String lugar_siembra) {
        this.lugar_siembra = lugar_siembra;
    }

    public String getTipo_citrico() {
        return tipo_citrico;
    }

    public void setTipo_citrico(String tipo_citrico) {
        this.tipo_citrico = tipo_citrico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "AgregarCultivo{" +
                "id='" + id + '\'' +
                ", nombre_cultivo='" + nombre_cultivo + '\'' +
                ", lugar_siembra='" + lugar_siembra + '\'' +
                ", tipo_citrico='" + tipo_citrico + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", talla='" + talla + '\'' +
                ", medida='" + medida + '\'' +
                '}';
    }
}


