/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2_project;

/**
 *
 * @author sgrue
 */
public class Mago extends Criatura implements Magico {
    private String hechizos;
    private Arma arma;

    public Mago(String nombre, int salud, int fuerza, String hechizos, Arma arma) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
        this.arma = arma;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza el hechizo: " + hechizos);
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " ha aprendido un nuevo hechizo.");
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza + arma.getDañoAdicional();
        objetivo.defender(daño);
    }
}

