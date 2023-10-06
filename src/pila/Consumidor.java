/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alepd
 */
public class Consumidor implements Runnable{
    private PilaLenta pila;
    
    public Consumidor(PilaLenta pila){
        this.pila=pila;
    }

    public void consumir() throws Exception{

        for (int i = 0; i < 10; i++) {

            System.out.println("Procedo a desapilar por " + (i+1) + " º ésima vez");

            Object n = pila.desapila();
            
            System.out.println("He desapilado el numero " + (int)n);
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
