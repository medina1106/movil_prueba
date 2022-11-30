package com.medina.poyecto_citriapp.Model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Pojo_Get_Cultivos {


    ArrayList<DatosCultivo> cultivos;

public Pojo_Get_Cultivos(){

}

    public Pojo_Get_Cultivos(ArrayList<DatosCultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public ArrayList<DatosCultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<DatosCultivo> cultivos) {
        this.cultivos = cultivos;
    }

    @Override
    public String toString() {
        return "Pojo_Get_Cultivos{" +
                "cultivos=" + cultivos +
                '}';
    }
}
