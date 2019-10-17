/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishproject;

/**
 *
 * @author M05H
 */
public class NodoArbol
{

    private String etiqueta;
    private Nodo alumno;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol()
    {
    }

    public NodoArbol(String etiqueta, Nodo alumno)
    {
        this.etiqueta = etiqueta;
        this.alumno = alumno;
        izquierdo = derecho = null;
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
     * @return the alumno
     */
    public Nodo getAlumno()
    {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Nodo alumno)
    {
        this.alumno = alumno;
    }

    /**
     * @return the izquierdo
     */
    public NodoArbol getIzquierdo()
    {
        return izquierdo;
    }

    /**
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(NodoArbol izquierdo)
    {
        this.izquierdo = izquierdo;
    }

    /**
     * @return the derecho
     */
    public NodoArbol getDerecho()
    {
        return derecho;
    }

    /**
     * @param derecho the derecho to set
     */
    public void setDerecho(NodoArbol derecho)
    {
        this.derecho = derecho;
    }

    
    
}
