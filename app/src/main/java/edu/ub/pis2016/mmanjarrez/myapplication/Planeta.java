package edu.ub.pis2016.mmanjarrez.myapplication;

/**
 * Created by orla_ on 05/07/2016.
 */

public class Planeta {

    String nombre, desc;

    public Planeta(String nombre, String desc) {
        this.nombre = nombre;
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return desc;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
