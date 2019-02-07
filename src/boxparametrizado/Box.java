/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxparametrizado;

import box.*;

/**
 *
 * @author alumno
 */
public class Box <T> {
    
    private T _valor;
    
    public T leer(){   //es un get
        return (_valor);
    }
    public void escribir (T x){    //es un set
        _valor=x;
    }
    
    
    
}