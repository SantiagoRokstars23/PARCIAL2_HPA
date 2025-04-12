/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2_project;

/**
 *
 * @author sgrue
 */
public class Guerrero extends Criatura {
    private String arma;
    private Arma armaObjeto;

    public Guerrero(String nombre, int salud, int fuerza, String arma, Arma armaObjeto) {
        super(nombre, salud, fuerza);
        this.arma = arma;
        this.armaObjeto = armaObjeto;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza + armaObjeto.getDañoAdicional();
        objetivo.defender(daño);
    }
}

