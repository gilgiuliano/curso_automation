package Clase_04;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionarios {
    public static void main(String[] args){
        HashMap<String,Integer> mapPalabraNumero = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        while(palabra.equals("parar")!=true)
        {
            mapPalabraNumero.put(palabra,numero);

            System.out.println("Ingrese una palabra: ");
            //String palabra = sc.next();

            System.out.println("Ingrese un numero: ");
            //int numero = sc.nextInt();
        }


        System.out.println("SALIDA: " + mapPalabraNumero);

        System.out.println(mapPalabraNumero.keySet());

    }
}
