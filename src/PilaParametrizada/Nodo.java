/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaParametrizada;

/**
 * @author FMR
 */
class Nodo <T> {
    protected Nodo siguiente;
    protected T contenido;
    
    
    Nodo(T cont){              //Crea un nuevo nodo
        this.siguiente=null;
        this.contenido= cont;
        
    }
    Nodo(T cont, Nodo sig){    // Crea un nuevo nodo y lo pone apuntando al siguiente
        this.siguiente=sig;
        this.contenido= cont;
    }
    
    void setContenido(T cont){
        this.contenido=cont;
    }
    
    T getContenido(){
        return this.contenido;
    } 
    
}
