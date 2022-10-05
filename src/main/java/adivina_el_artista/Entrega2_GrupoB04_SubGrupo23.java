/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package adivina_el_artista;

import java.util.Scanner;

/*
 * @author 
 * JUAN CAMILO HOYOS CASTAÑO
 */
public class Entrega2_GrupoB04_SubGrupo23 {

    public static void main(String[] args) {
        int juego = 0;
        int entrar = 0;
        int comenzar = 0;
        Scanner leer = new Scanner(System.in);

        do {
            //MENU DE LOGICA DEL PROGRAMA / GESTIONA LA ACCION DEL JUEGO
            System.out.println("1. Quieres jugar Adivina El Personaje");
            System.out.println("2. No quiere Jugar");
            entrar = leer.nextInt();
            
            if (entrar == 1) {
                System.out.print("Adivina el personaje, Eliga uno de los personaje de la lista \nRadamel Falcao García, \nGoku, \nMichael Jordan, \nEminem, \nDarth Vader, \nAdam"
                        + "Sandler, \nBruce Wayne, \nTin Tin, \nAyudante de Santa, \nJoe Biden, \nJosé Saramago, \nGünter Grass\n y Kim Jong Un \n\n ");
            
            System.out.println("ESCRIBE 1 SI SU PERSONAJE ES UNA CELEBRIDAD O ESCRIBE 2 SI ES UN PERSONAJE FICTICIO");
            comenzar = leer.nextInt();
            
            }

            switch (comenzar) { //UTILIZAMOS METODO SWITCH PARA ESCOGER LA CATEGORIA  

                case 1://OPCIÓN UNO, CELEBRIDADES
                    System.out.println("¿SU PERSONAJE ES DEPORTISTA?");
                    juego = leer.nextInt();
                    if (juego == 1) {
                        System.out.println("¿SU PERSONAJE ES FUTBOLISTA?");
                        juego = leer.nextInt();
                        if (juego == 1) {
                            System.out.println("SU PERSONAJE ES Radamel Falcao García");
                            break;
                        } else {
                            System.out.println("SU PERSONAJE ES Michael Jordan");
                            break;
                        }
                    } else {
                        System.out.println("¿SU PERSONAJE ES ESCRITOR?");
                        juego = leer.nextInt();
                        if (juego == 1) {
                            System.out.println("¿SU PERSONAJE ES PORTUGUES?");
                            juego = leer.nextInt();
                            if (juego == 1) {
                                System.out.println("SU PERSONAJE ES José Saramago");
                                break;
                            } else {
                                System.out.println("SU PERSONAJE ES Günter Grass");
                                break;
                            }
                        } else {
                            System.out.println("¿SU PERSONAJE ES POLITICO?");
                            juego = leer.nextInt();
                            if (juego == 1) {
                                System.out.println("¿SU PERSONAJE ES ESTADOUNIDENSE?");
                                juego = leer.nextInt();
                                if (juego == 1) {
                                    System.out.println("SU PERSONAJE ES Joe Biden");
                                    break;
                                } else {
                                    System.out.println("SU PERSONAJE ES Kim Jong Un");
                                    break;
                                }
                            } else {
                                System.out.println("¿SU PERSONAJE ES CANTANTE?");
                                juego = leer.nextInt();
                                if (juego == 1) {
                                    System.out.println("SU PERSONAJE ES Eminem ");
                                    break;
                                } else {
                                    System.out.println("SU PERSONAJE ES  Adam Sandler");
                                    break;
                                }

                            }
                        }
                    }

                case 2:// OPCION DOS, PERSONAJES FICITICIOS
                    System.out.println("¿SU PERSONAJE ES DE LOS SIMPSON?");
                    juego = leer.nextInt();
                    if (juego == 1) {
                        System.out.println("SU PERSONAJE ES Ayudante de Santa ");
                        break;
                    } else {
                        System.out.println("¿SU PERSONAJE ES EUROPEO?");
                        juego = leer.nextInt();
                        if (juego == 1) {
                            System.out.println("SU PERSONAJE ES Tin Tin");
                            break;
                        } else {
                            System.out.println("¿SU PERSONAJE ES DC COMICS?");
                            juego = leer.nextInt();
                            if (juego == 1) {
                                System.out.println("SU PERSONAJE ES Bruce Wayne");
                                break;
                            } else {
                                System.out.println("¿SU PERSONAJE ES JAPONES?");
                                juego = leer.nextInt();
                                if (juego == 1) {
                                    System.out.println("SU PERSONAJE ES GOKU");
                                    break;
                                } else {
                                    System.out.println("SU PERSONAJE ES Darth Vader");
                                    break;
                                }
                            }
                        }
                    }
            }

        } while (entrar != 2);
        System.out.println("FELIZ DIA !!!!!!!!!!!");
    }
}
