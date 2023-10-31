/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alepd
 */
public class Consumidor implements Runnable {

    private Pila pila;

    public Consumidor(Pila pila) {
        this.pila = pila;
    }

    public void consumir() throws InterruptedException {

        for (int i = 0; i < 15; i++) {

            //System.out.println("Soy el consumidor y procedo a desapilar por " + (i + 1) + " º ésima vez");

            Object n = -1;
            try {
                n = pila.desapila();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Soy el consumidor y he desapilado el numero " + (int) n);

            Random rand = new Random(System.currentTimeMillis());
            double tiempo = 1 + rand.nextDouble() * 2;
            int tiempoSleep = (int) (tiempo * 1000);
            sleep(tiempoSleep);
        }
    }

    @Override
    public void run() {
        try {
            consumir();
        } catch (Exception ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
