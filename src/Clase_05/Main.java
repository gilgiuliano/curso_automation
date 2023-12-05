package Clase_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante(570, "Rodrigo Gil Giuliano", 7.1f);
        System.out.println("ID de estudiante por defecto: "+ estudiante1.getId());

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un nuevo Id para el estudante:  ");
        int numero = ingreso.nextInt();

        estudiante1.setId(numero);

        System.out.println("El nuevo valor del ID del estudiante es: "+estudiante1.getId());

        System.out.println("FIN DEL EJEMPLO");
    }
}
