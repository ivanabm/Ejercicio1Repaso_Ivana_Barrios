package ejercicios;

public class Ejercicio19 {

    public static void main(String[] args) {
        int a = 28;
        int sumaDivisores = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }

        }
    }



