package Clase_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        ArrayList<Integer> listadenumeros = new ArrayList<>();

        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        while(numero <= 500)
        {
            listadenumeros.add(numero);
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
        }
        int cant_elementos = listadenumeros.size() + 1;
        System.out.println("Cantidad de numeros ingresados: " + cant_elementos);

        System.out.println(listadenumeros);

        for(int i = 0; i < listadenumeros.size(); i++){
            System.out.println("Elemento " + i + ": " + listadenumeros.get(i) );
        }

        if( listadenumeros.size() < 10) {
            System.out.println("Se ingresaron pocos numeros");
        }
        else
        {
                System.out.println("Se exedieron la cantidad");
        }
    }
}
