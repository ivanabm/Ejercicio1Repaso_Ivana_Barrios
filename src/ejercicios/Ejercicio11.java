package ejercicios;

public class Ejercicio11 {

    public static void main(String[] args) {
        int N = 10;
        int a = 0, b = 1;

        System.out.print("Los primeros " + N + " números de Fibonacci son: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;

        }

        }
    }



