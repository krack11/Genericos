/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxparametrizado;

/**
 *
 * @author alumno
 */
public class usarBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Box<Integer> a = new Box<Integer>();
        Box<Integer> b = new Box<Integer>();
        a.escribir(7);
        b.escribir(8);
        int c = a.leer() + b.leer();
        System.out.println("El valor de c:"+c);
        System.out.println("\n");
        
        Box<String> st = new Box<String>();
        st.escribir("En un lugar de la Mancha ...");
        System.out.println(st.leer().substring(3, 10));
        
        
        
    }
    
}
