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
public class UsarPila {
    public static void main(String[] args) {
        Pila p=new Pila();
        p.poner("Plato_1");
        p.poner("Plato_2");
        p.poner("Plato_3");
        System.out.println(p.coger());
        Object [] a = p.toArray();
        for (Object a1 : a) {
            System.out.println(a1);
        }
    }
}
