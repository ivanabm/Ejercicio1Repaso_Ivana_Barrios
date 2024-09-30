package ejercicios;

public class Ejercicio22 {

    public static void main(String[] args) {
        int a = 987654;
        int contador = 0;

        while (a != 0) {
            a /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");

        }
    }



