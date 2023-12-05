package Clase_02;

public class HolaMundo {
    public static void main(String[] args) {
        //Actividad 1
        System.out.println("Is Alive!!!!");
        String a = "HOOOLA a todos";
        System.out.println(a);

        //Actividad 2
        int contador = 1;

        System.out.println("Hecho A Mano");

        System.out.println("Día " + contador++ + " Lunes");
        System.out.println("Día " + contador++ + " Martes");
        System.out.println("Día " + contador++ + " Miércoles");
        System.out.println("Día " + contador++ + " Jueves");
        System.out.println("Día " + contador++ + " Viernes");
        System.out.println("Día " + contador++ + " Sábado");
        System.out.println("Día " + contador++ + " Domingo");

        System.out.println("Hecho A bucle");

        String[] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";


        for (int i = 0; i < dias.length ; i++){
            int temp = i+1;
            System.out.println("Día " + temp  + " " + dias[i]);
        }


    }
}
