/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alepd
 */
public class Productor extends Thread {

    private Pila pila;

    public Productor(Pila pila) {
        this.pila = pila;
    }

    public void producir() throws InterruptedException {
        try {
            for (int i = 0; i < 15; i++) {

                Random r = new Random(System.nanoTime());
                //System.out.println("Soy el hilo " + java.lang.Thread.currentThread().getName() + " e inserto el " + (i + 1) + "º Numero aleatorio");

                int numeroRandom = r.nextInt(100);
                pila.apila(numeroRandom);
                System.out.println("Soy el hilo " + java.lang.Thread.currentThread().getName() + " e inserto el numero " + numeroRandom);

                Random rand = new Random(System.currentTimeMillis());
                
                int tiempoSleep = ((1 + rand.nextInt(2)) * 1000);
                sleep(tiempoSleep);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void run() {
        try {
            producir();
        } catch (Exception ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
