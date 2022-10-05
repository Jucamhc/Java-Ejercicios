/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Juan
 */
public class Arbol {

    NodoArbol inicial;
    int num = 0;
    int cantidad = 0;
    int[] arr = new int[10];
    int con = 0;

    public Arbol() {
        this.inicial = null;
    }

    public void insertar(int valor) {

        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);

        } else {
            this.inicial.insertar(valor);
        }

        cantidad++;
        arr[cantidad] = valor;
    }

    public void dispararPreorden() {
        this.preorden(this.inicial);
    }

    public void preorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.print(nodo.getValor() + ", ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodeDerecho());

        }

    }

    public void dispararInorden() {
        this.inorden(this.inicial);
    }

    public void inorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        } else {
            inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor() + ", ");
            inorden(nodo.getNodeDerecho());
        }
    }

    public void dispararPostorden() {
        this.postorden(this.inicial);
    }

    public void postorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        } else {
            postorden(nodo.getNodoIzq());
            postorden(nodo.getNodeDerecho());
            System.out.print(nodo.getValor() + ", ");
        }
    }

    public void dispararBuscar() {
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                con++;
            }
        }
        if (con > 0) {
            System.out.println("El valor Si esta");
        } else {
            System.out.println(("El valor No esta"));
        }
    }
}
