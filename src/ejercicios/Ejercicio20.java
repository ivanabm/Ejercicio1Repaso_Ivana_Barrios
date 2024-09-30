package ejercicios;

public class Ejercicio20 {

    public static void main(String[] args) {
        int a = 153;
        int original = a;
        int suma = 0;
        int numDigitos = String.valueOf(a).length();

        while (a != 0) {
            int digito = a % 10;
            suma += Math.pow(digito, numDigitos);
            a /= 10;
        }

        if (suma == original) {
            System.out.println(original + " es un número Armstrong.");
        } else {
            System.out.println(original + " no es un número Armstrong.");
        }

        }
    }



