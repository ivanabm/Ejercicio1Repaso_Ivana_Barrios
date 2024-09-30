package ejercicios;

public class Ejercicio13 {

    public static void main(String[] args) {
        int a = 1221;
        int original = a;
        int invertido = 0;

        while (a != 0) {
            int digito = a % 10;
            invertido = invertido * 10 + digito;
            a /= 10;
        }

        if (original == invertido) {
            System.out.println(original + " es un palíndromo.");
        } else {
            System.out.println(original + " no es un palíndromo.");
        }

        }
    }



