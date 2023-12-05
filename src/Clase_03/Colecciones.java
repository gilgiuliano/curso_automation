package Clase_03;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        //Ejemplo de creación, acceso y modificación de un array
        int[] arreglo_entero;
        arreglo_entero = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(arreglo_entero[1]);
        arreglo_entero[1] = 100;
        System.out.println(arreglo_entero[1]);

        //Ejemplo array list
        ArrayList<Integer> ListaDeEnteros;
        ListaDeEnteros = new ArrayList<>();
        ListaDeEnteros.add(1);
        ListaDeEnteros.add(2);
        ListaDeEnteros.add(3);
        ListaDeEnteros.add(3,100);
        System.out.println("Imprimo elemento 1 de la lista: "+ ListaDeEnteros.get(1));
        ListaDeEnteros.remove(1);
        System.out.println("Imprimo elemento 1 de la lista: "+ ListaDeEnteros.get(1));
        System.out.println("Imprimo elemento 3 de la lista: "+ ListaDeEnteros.get(2));
        System.out.println("Imprimo elemento 3 de la lista: "+ ListaDeEnteros);
    }
}
