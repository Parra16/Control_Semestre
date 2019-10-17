/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishproject;

import java.io.Serializable;


/**
 *
 * @author M05H
 */
public class Nodo implements Serializable
{
    private static long serialVersionUID =1L; 
    private String etiqueta;
    private Object obj;
    private Nodo siguiente;
    private Nodo anterior;
    private Nodo arriba;
    private Nodo abajo;
    

    public Nodo(String etiqueta, Object obj) {
        this.etiqueta = etiqueta;
        this.obj = obj;
        siguiente = null;
    }

    

    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior()
    {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior)
    {
        this.anterior = anterior;
    }

    /**
     * @return the arriba
     */
    public Nodo getArriba()
    {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodo arriba)
    {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public Nodo getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Nodo abajo)
    {
        this.abajo = abajo;
    }

    

    
    
    
}
