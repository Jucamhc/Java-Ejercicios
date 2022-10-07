/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sacar_la_moda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Camilo Hoyos C
 */
public class main_moda {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(45);
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(47);
        list.add(65);

        Long max = Long.MIN_VALUE;
        int moda = 0;

        for (int i = 0; i < list.size(); i++) {
            long maxTemp = contarVeces(list, i);
            if (max < maxTemp) {
                max = maxTemp;
                moda = i;
            }
        }

        System.out.println(moda);
    }

    private static long contarVeces(List<Integer> numeros, int numerosBuscados) {
        return numeros.stream().filter(n -> n == numerosBuscados).count();
    }

}
