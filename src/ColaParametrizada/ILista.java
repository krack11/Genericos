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
public interface ILista <T> {
    
    public void poner(T o);
    public T coger();
    public T sacar();
    public int length();
    public T[] toArray();
    @Override
    public String toString();
    
}
