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
public class cola <T> implements ILista<T> {
    
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    
    
    public cola(){
        this.primero=null;
        this.ultimo=null;
    }
    
   /* public void put(Object o){
        Nodo nuevo = new Nodo(o);
        nuevo.siguiente=this.ultimo;
        this.ultimo=nuevo;
    }
    
    public Object get(){
        if(ultimo==null){
            return null;
        }else{
            return this.ultimo.contenido;
        }

    }*/
    
    @Override
    public void poner(T o) {
        
        Nodo aux = new Nodo(o);
        
        if(this.primero==null){
            this.primero=aux;
        } else{
            this.ultimo.siguiente=aux;
        }
        this.ultimo=aux;
    }

    @Override
    public T coger() {
       T aux = null;
        if(primero==null){
        } else {
            aux = this.primero.getContenido();
            
        }
        return aux;
    }

    @Override
    public T sacar() {
        Nodo<T> aux= this.primero;
        if(aux==null){
            return null;
        }else{
            if(aux.siguiente==null){
                this.primero=null;
                this.ultimo=null;
            }else{
                this.primero=this.primero.siguiente;
            }
            return aux.contenido;
        }
    }

    @Override
    public int length() {
        Nodo aux = this.primero;
        int longi=0;
        while(aux!=null){
            aux=aux.siguiente;
            longi++;
        }
        return longi;
    }

    @Override
    public T[] toArray() {
        Object[] r=  new Object[this.length()]; 
        Nodo aux=this.primero;
        for(int i=0;i<r.length;i++){
            r[i]=aux.contenido;
            aux=aux.siguiente;
        }
        return (T[]) r;
    }
    
    public static cola toLista(Object[]a){
        cola c=new cola();
        
        for(Object elem : a){
            c.poner(elem);
        }
        return c;
    }
    
    
    
    
    @Override
    public String toString(){
        Nodo aux=this.primero;
        String r="\n------------Lista---------------\n";
        while(aux !=null){
            r+=aux.contenido;
            r+="\n";
            aux=aux.siguiente;
        }
        return r;
    }
    
}
