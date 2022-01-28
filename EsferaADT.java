/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1adt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Robert
 */
public class EsferaADT {
   double radio, area, volumen, circunferencia, Diametro;
   double PI = 3.1416;
   BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));
   public void sacarArea () throws IOException{
       System.out.println("Ingresa el valor del raido  ");
       radio = Double.parseDouble(Leer.readLine());
       area = 4 *  PI * (radio* radio);
       System.out.println("El area es de "+area);
       
   }
   public void sacarVolumen () {
     volumen = 4 * PI * (radio*radio*radio)/ 3;
     System.out.println("Este es el valor del volumen "+volumen);
   }
 
   public void sacarcircunferencia () {
     circunferencia = 4* PI * (radio*radio);
     System.out.println("Este es el valor del volumen "+volumen);
   }
   
  public void sacarDiametro () {
     Diametro = 2 *radio;
     System.out.println("Este es el valor del volumen "+volumen);
   }
   

   public static void main (String[] args) throws IOException  {
      EsferaADT ob = new EsferaADT ();
      ob.sacarArea () ;
      ob.sacarVolumen();
      ob.sacarDiametro ();
      ob.sacarcircunferencia();
   }
}
