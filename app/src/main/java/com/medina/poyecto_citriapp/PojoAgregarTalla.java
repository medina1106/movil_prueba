package com.medina.poyecto_citriapp;

public class PojoAgregarTalla {
    private String id;
    private String fecha_talla;
    private String talla;
    private String medida;


    public PojoAgregarTalla() {

    }

    public PojoAgregarTalla(String id, String fecha_talla, String talla, String medida) {
        this.id = id;
        this.fecha_talla = fecha_talla;
        this.talla = talla;
        this.medida = medida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha_talla() {
        return fecha_talla;
    }

    public void setFecha_talla(String fecha_talla) {
        this.fecha_talla = fecha_talla;
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
        return "PojoAgregarTalla{" +
                "id='" + id + '\'' +
                ", fecha_talla='" + fecha_talla + '\'' +
                ", talla='" + talla + '\'' +
                ", medida='" + medida + '\'' +
                '}';
    }
}
