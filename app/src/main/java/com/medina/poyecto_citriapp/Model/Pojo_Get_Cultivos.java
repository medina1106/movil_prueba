package com.medina.poyecto_citriapp.Model;

import java.util.List;

public class Pojo_Get_Cultivos {
    String message;
    String info;

    List<DatosCultivo> cultivos;
    public Pojo_Get_Cultivos(){

    }

    public Pojo_Get_Cultivos(String message, String info, List<DatosCultivo> cultivos) {
        this.message = message;
        this.info = info;
        this.cultivos = cultivos;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DatosCultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<DatosCultivo> cultivos) {
        this.cultivos = cultivos;
    }

    @Override
    public String toString() {
        return "Pojo_Get_Cultivos{" +
                "message='" + message + '\'' +
                ", info='" + info + '\'' +
                ", cultivos=" + cultivos +
                '}';
    }
}
