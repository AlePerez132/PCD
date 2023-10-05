/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

import java.util.Random;

/**
 *
 * @author alepd
 */
public class UsaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila p;
        p = new Pila(10);

        Random r = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            int numeroRandom = r.nextInt(100);

            System.out.println((i+1) + "º Numero aleatorio " + numeroRandom);

            if (numeroRandom % 2 == 0) {
                System.out.println("Inserto el numero " + numeroRandom);
                try {
                    p.apila(numeroRandom);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } else {
                System.out.println("Procedo a desapilar la pila");
                Object desapilado = -1;
                try {
                     desapilado = p.desapila();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("He desapilado el numero " + desapilado);
            }
        }
    }

}
