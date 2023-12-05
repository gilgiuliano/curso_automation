package Clase_03;

public class EstructurasDeControl {
    public static void main(String[] args){
        int valor = 100;

        if(valor >=0){
            System.out.println("Valor es Positivo y es igual a: "+ valor);
        }
        else{
            System.out.println("Valor es Negativo y es igual a: "+ valor);
        }

        System.out.println("Ejemplo de Swithc");
        switch (valor){
        case 100:
            System.out.println("Valor es igual a 100 ");
            break;
        case 200:
            System.out.println("Valor es igual a 100 ");
            break;
        default:
        System.out.println("Valor no es igual a 100 o a 200 ");
        }

        System.out.println("Ejemplo While");
        int contador = 1;
        while (contador<= 10){
            System.out.println("Iteracion While " + contador);
            contador ++;
        }



        System.out.println("Ejemplo For");
        for(int countFor=0; countFor <10; countFor++){
            System.out.println("Iteracion For " + (countFor +1));
        }
    }
}
