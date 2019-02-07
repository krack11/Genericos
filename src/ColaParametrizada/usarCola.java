/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaParametrizada;

/**
 *
 * @author alumno
 */
public class usarCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cola c=new cola();
        c.poner("Persona_1");
        c.poner("Persona_2");
        c.poner("Persona_3");
        System.out.println(c.coger());
        Object [] a = c.toArray();
        cola c2 = cola.toLista(a);
        
        System.out.println("Longitud del array:"+a.length);
        System.out.println(c);
        System.out.println("Sacando:..."+c.sacar());
        System.out.println(c);
        System.out.println(c2);
        
        
        
    }
    
}
