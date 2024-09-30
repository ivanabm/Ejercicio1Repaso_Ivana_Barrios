package ejercicios;

public class Ejercicio24 {

    public static void main(String[] args) {
        int a = 3;
        int suma = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % a == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los múltiplos de " + a + " entre 1 y 50 es: " + suma);


    }
    }



