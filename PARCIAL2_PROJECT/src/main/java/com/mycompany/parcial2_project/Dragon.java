/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2_project;

/**
 *
 * @author ronny
 */
public class Dragon extends Criatura implements Volador {
    private String escamas;
    private Arma arma;

    public Dragon(String nombre, int salud, int fuerza, String escamas, Arma arma) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
        this.arma = arma;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterrizó.");
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza + arma.getDañoAdicional();
        objetivo.defender(daño);
    }
}
