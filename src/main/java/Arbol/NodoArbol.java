/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Juan
 */
public class NodoArbol {

    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodeDerecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.nodoIzq = null;
        this.nodeDerecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public NodoArbol getNodeDerecho() {
        return nodeDerecho;
    }

    public void insertar(int _valor) {
        if (_valor < this.valor) {
            //Insertar al lado izquierdo
            if (this.nodoIzq == null) {
                this.nodoIzq = new NodoArbol(_valor);
            } else {
                this.nodoIzq.insertar(_valor);
            }
        } else {
            //Insertar al lado Derecha
            if (this.nodeDerecho == null) {
                this.nodeDerecho = new NodoArbol(_valor);
            } else {
                this.nodeDerecho.insertar(_valor);
            }
        }
    }
}
