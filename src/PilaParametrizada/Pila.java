/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaParametrizada;

/**
 *
 * @author FMR
 */
public class Pila <T> {

    private Nodo<T> cima;
    
    public Pila(){
        this.cima=null;
    }
    
    public void poner(T contenido){
        // Pone el objeto en lo alto de la pila (cima)
        Nodo aux = new Nodo(contenido);
        if (cima==null) {
            aux.siguiente=null;
        }else{
            aux.siguiente=cima;
        }
        cima=aux;
    }
    public T coger(){
        // Devuelve el objeto de lo alto de la pila (cima) pero no lo borra 
        if (cima==null){
            return null;
        }else{
            return this.cima.contenido;
        }     
    }
    public int length(){
        Nodo aux = this.cima;
        int longi=0;
        while (aux!=null){
            aux=aux.siguiente;
            longi++;  
        }
        return longi;
    }
    public T[] toArray(){
        // Devuelve un array con todos los objetos de la Pila
        T[] r= (T[]) new Object[this.length()]; 
        Nodo aux=cima;
        for (int i = 0; i < r.length; i++) {
            r[i]=(T)aux.contenido;
            aux=aux.siguiente;  
        }
        return r;
    }

    
    
}
