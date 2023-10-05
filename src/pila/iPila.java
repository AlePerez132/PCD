/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pila;

/**
 *
 * @author alepd
 */
public interface iPila {
    public int GetNum();
    
    public void apila(Object elemento) throws Exception;
    
    public Object desapila() throws Exception;
    
    public Object primero() throws Exception;
}
