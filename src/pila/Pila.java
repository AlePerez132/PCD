/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import static java.lang.Thread.sleep;

/**
 *
 * @author alepd
 */
public class Pila implements iPila {

    int cima;

    int capacidad;

    int numElementos;

    Object[] datos;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        datos = new Object[capacidad];
        numElementos = 0;
        cima = 0;
    }

    @Override
    public int GetNum() {
        return numElementos;
    }

    @Override
    public void apila(Object elemento) throws Exception {
        if (!pilaLlena()) {
            sleep(100);
            datos[numElementos] = elemento;
            sleep(100);
            numElementos++;
            sleep(100);
            cima++;
            sleep(100);
        } else {
            throw new Exception("La pila esta llena");
        }
    }

    @Override
    public Object desapila() throws Exception {
        Object aux;
        if (!pilaVacia()) {
            sleep(100);
            aux = primero();
            sleep(100);
            datos[numElementos] = null;
            sleep(100);
            numElementos--;
            sleep(100);
            cima--;
            sleep(100);
        } else {
            throw new Exception("La pila esta vacia (p.desapila)");
        }
        return aux;
    }

    @Override
    public Object primero() throws Exception {
        if (!pilaVacia()) {
            return datos[numElementos - 1];
        } else {
            throw new Exception ("La pila esta vacia (p.primero)");
        }
    }

    public boolean pilaVacia() {
        return numElementos == 0;
    }

    public boolean pilaLlena() {
        return numElementos == capacidad;
    }
}
