package com.mycompany.tarea;

/**
 *
 * @author Robert
 */

import java.util.Arrays;
import java.util.Scanner;
 
public class parcial {
     
    static Scanner sc = new Scanner(System.in);
    static int[] numeros;
     
    public static void main(String[] args) {
         
        numeros = new int[leerEntero("Introduce la dimension del array: ")];
        llenarArray();
        System.out.println("\n\nArray");
        visualizar();
        System.out.println("\n\nArray ordenado");
        Arrays.sort(numeros);
        visualizar();
    }
     
    private static void llenarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = leerEntero("Inserta el valor " + (i+1) + ": ");
        }
    }
     
    private static void visualizar(){
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
     
    private static int leerEntero(String s){
        System.out.print(s);
        return sc.nextInt();    
    }
}

