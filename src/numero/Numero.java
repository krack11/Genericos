/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author alumno
 */
public class Numero implements Comparable {
    
    private int _n;
    
    public Numero(int n){
        this._n=n;
    }

    @Override
    public int valorComparable() {
        return this._n;
    }

    @Override
    public boolean mayorQue(Comparable x) {
        return this.valorComparable() > x.valorComparable();
    }

    @Override
    public boolean menorQue(Comparable x) {
        return this.valorComparable() < x.valorComparable();
    }

    @Override
    public boolean iguales(Comparable x) {
        return this.valorComparable() == x.valorComparable();
    }
    
    @Override
    public String toString(){
        return "-"+this.valorComparable();
    }
    
    
}
