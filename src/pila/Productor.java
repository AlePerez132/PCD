/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author alepd
 */
public class Productor extends Thread{
    private Pila p;
    
    public Productor(int capacidadPila){
        p = new Pila(capacidadPila);
    }
}
