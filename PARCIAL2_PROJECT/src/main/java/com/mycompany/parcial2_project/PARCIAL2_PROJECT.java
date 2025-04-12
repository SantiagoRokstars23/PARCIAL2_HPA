/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.parcial2_project;

/**
 *
 * @author sgrue
 */
public class PARCIAL2_PROJECT {

    public static void main(String[] args) {
        // Crear armas
        Arma espada = new Arma("Espada de Acero", 10);
        Arma baston = new Arma("Bastón Mágico", 8);
        Arma garras = new Arma("Garras de Dragón", 12);

        // Crear criaturas
        Guerrero guerrero = new Guerrero("Santiago", 100, 20, "Espada", espada);
        Mago mago = new Mago("Ronny", 80, 15, "Bastón", baston);
        Dragon dragon = new Dragon("Luis", 150, 25, "Garras", garras);

        // Simular batallas
        System.out.println("=== Batalla: Guerrero vs Mago ===");
        simularBatalla(guerrero, mago);

        System.out.println("\n=== Batalla: Dragon vs Guerrero ===");
        simularBatalla(dragon, guerrero);

        System.out.println("\n=== Batalla: Mago vs Dragon ===");
        simularBatalla(mago, dragon);

        System.out.println("¡Batalla finalizada!");
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {
        int ronda = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("Ronda " + ronda++);

            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }

            System.out.println("→ Estado después de ronda:");
            System.out.println("- " + c1.getNombre() + ": " + c1.salud + " HP");
            System.out.println("- " + c2.getNombre() + ": " + c2.salud + " HP");
        }

        System.out.println("El ganador es: "
                + (c1.estaViva() ? c1.getNombre() : c2.getNombre()));
    }
}
