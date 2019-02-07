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
public class usarBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Box m = new Box();
        m.escribir(new Integer(10));
        System.out.println("El contenido es: ");
        System.out.println((Integer)m.leer());
        
        Box a = new Box();
        Box b = new Box();
        a.escribir(7);
        b.escribir(8);
        System.out.println((Integer)a.leer());
        
        Box s = new Box();
        s.escribir("String de prueba");
        System.out.println(s.leer());
    }
    
}
