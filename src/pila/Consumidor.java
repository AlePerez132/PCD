/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Random;

/**
 *
 * @author alepd
 */
public class Consumidor implements Runnable{
    private Pila p;
    
    public Consumidor(int capacidadPila){
        p = new Pila(capacidadPila);
    }

    public void producir() throws Exception{
        Random r = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            int numeroRandom = r.nextInt(100);

            System.out.println((i+1) + "º Apilo el umero aleatorio " + numeroRandom);

            p.apila(numeroRandom);
        }
    }
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
