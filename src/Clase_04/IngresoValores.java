package Clase_04;

import java.util.Scanner;

public class IngresoValores {
    public static void main(String[] args){

        Scanner ingreso = new Scanner(System.in);
        int numero = ingreso.nextInt();
        String cadena = ingreso.next();
        //Double numcoma = ingreso.nextDouble();

        System.out.println("Numero: "+ numero);
        System.out.println("Cadena: "+ cadena);
        //System.out.println("Decimal: "+ numcoma);
    }
}
