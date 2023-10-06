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
public class Productor extends Thread{
    private PilaLenta pila;
    
    public Productor(PilaLenta pila){
        this.pila=pila;
    }
    
    public void producir() throws Exception{
        for (int i = 0; i < 10; i++) {

            Random r = new Random(System.currentTimeMillis());
            System.out.println((i+1) + "º Numero aleatorio");
            
            int numeroRandom = r.nextInt(100);
            System.out.println("Inserto el numero " + numeroRandom);
            pila.apila(numeroRandom);
        }
    }
}
