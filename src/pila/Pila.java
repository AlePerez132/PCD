/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author alepd
 */
public class Pila implements iPila {

    int cima;

    int capacidad;

    int numElementos;

    Object[] datos;

    VistaCanvas canvas;

    public Pila(int capacidad, VistaCanvas vista) {
        this.capacidad = capacidad;
        datos = new Object[capacidad];
        numElementos = 0;
        cima = 0;
        this.canvas = vista;
        for (int i = 0; i < capacidad; i++) {
            datos[i] = -1;
        }
    }

    @Override
    public int GetNum() {
        return numElementos;
    }

    @Override
    public synchronized void apila(Object elemento) throws Exception {
        int intentos = 0;
        while (pilaLlena() && intentos < 3) {
            wait();
            intentos++;
            System.out.println("        Hilo"+Thread.currentThread().getName()+" con "+intentos+" intentos");
        }
        if (!pilaLlena()) {
            datos[numElementos] = elemento;
            numElementos++;
            cima++;
            canvas.representa(datos);
            notifyAll();
            
        } else {
            if (intentos == 3) {
                throw new Exception("         Soy el hilo " + java.lang.Thread.currentThread().getName() + " y he gastado los 3 intentos");
            } else {
                throw new Exception("La pila esta llena");
            }
        }

    }

    @Override
    public synchronized Object desapila() throws Exception {
        Object aux;
        while (pilaVacia()) {
            wait();
        }
        if (!pilaVacia()) {
            aux = primero();
            datos[cima - 1] = -1;
            numElementos--;
            cima--;
            canvas.representa(datos);
            notifyAll();
            

        } else {
            throw new Exception("La pila esta vacia (p.desapila)");
        }
        return aux;
    }

    @Override
    public Object primero() throws Exception {
        if (!pilaVacia()) {
            return datos[cima - 1];
        } else {
            throw new Exception("La pila esta vacia (p.primero)");
        }
    }

    public boolean pilaVacia() {
        return numElementos == 0;
    }

    public boolean pilaLlena() {
        return numElementos == capacidad ;
    }
}
