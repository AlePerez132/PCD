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
        PilaLenta pila = new PilaLenta(10);
        
        Consumidor hc1 = new Consumidor(pila);
        Consumidor hc2 = new Consumidor(pila);
        
        Productor p = new Productor(pila);
        Thread hp1 = new Thread(p);
        Thread hp2 = new Thread(p);
        
        
    }

}
