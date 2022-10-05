/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Juan
 */
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(10);
        arbol.insertar(43);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(53);
        arbol.insertar(50);
        arbol.num = 54;
        System.out.println("Valor a buscar: " + arbol.num);
        System.out.println("Formas de ordenamiento ");
        System.out.println("INORDEN: ");
        arbol.dispararInorden();
        System.out.println();
        System.out.println("POSTORDEN: ");
        arbol.dispararPostorden();
        System.out.println();
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
        System.out.println();
        System.out.println("BUSCADOR: ");
        arbol.dispararBuscar();
    }
}
