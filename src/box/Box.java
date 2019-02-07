/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author alumno
 */
public class Box {
    
    private Object _valor;
    
    public Object leer(){   //es un get
        return (_valor);
    }
    public void escribir (Object x){    //es un set
        _valor=x;
    }
    
    
    
}
