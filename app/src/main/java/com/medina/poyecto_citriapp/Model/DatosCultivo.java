package com.medina.poyecto_citriapp.Model;

public class DatosCultivo {
    Integer id;
    String name_cultive;
    String citrico_id;
    String start_production;
    String finca_id;

    public  DatosCultivo(){

    }

    public DatosCultivo(Integer id, String name_cultive, String citrico_id, String start_production, String finca_id) {

        this.id = id;
        this.name_cultive = name_cultive;
        this.citrico_id = citrico_id;
        this.start_production = start_production;
        this.finca_id = finca_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_cultive() {
        return name_cultive;
    }

    public void setName_cultive(String name_cultive) {
        this.name_cultive = name_cultive;
    }

    public String getCitrico_id() {
        return citrico_id;
    }

    public void setCitrico_id(String citrico_id) {
        this.citrico_id = citrico_id;
    }

    public String getStart_production() {
        return start_production;
    }

    public void setStart_production(String start_production) {
        this.start_production = start_production;
    }

    public String getFinca_id() {
        return finca_id;
    }

    public void setFinca_id(String finca_id) {
        this.finca_id = finca_id;
    }

    @Override
    public String toString() {
        return "DatosCultivo{" +
                "id=" + id +
                ", name_cultive='" + name_cultive + '\'' +
                ", citrico_id='" + citrico_id + '\'' +
                ", start_production='" + start_production + '\'' +
                ", finca_id='" + finca_id + '\'' +
                '}';
    }
}
