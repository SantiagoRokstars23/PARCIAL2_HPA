package com.mycompany.parcial2_project;

import com.mycompany.parcial2_project.Criatura;


public class Arma {

    private String nombre;
    private int dañoAdicional;

    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    public void atacarConArma(Criatura objetivo) {
        System.out.println("Atacando con " + nombre);
        objetivo.defender(dañoAdicional);
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }
}
