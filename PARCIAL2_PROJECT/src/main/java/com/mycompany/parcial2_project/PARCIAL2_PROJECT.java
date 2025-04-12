/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.parcial2_project;

/**
 *
 * @author sgrue
 */
public class PARCIAL2_PROJECT {

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        while (criatura1.estaViva() && criatura2.estaViva()) {
            criatura1.atacar(criatura2);
            if (criatura2.estaViva()) {
                criatura2.atacar(criatura1);
            }
        }

        System.out.println("¡Batalla terminada!");
        System.out.println(criatura1.getNombre() + " está " + (criatura1.estaViva() ? "vivo" : "muerto"));
        System.out.println(criatura2.getNombre() + " está " + (criatura2.estaViva() ? "vivo" : "muerto"));
    }
}
