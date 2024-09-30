package ejercicios;

public class Ejercicio21 {

    public static void main(String[] args) {
        int a = 49;
        double raiz = a;
        double epsilon = 0.00001;

        while (Math.abs(raiz * raiz - a) > epsilon) {
            raiz = (raiz + a / raiz) / 2;
        }

        System.out.println("La raíz cuadrada de " + a + " es aproximadamente: " + raiz);

        }
    }



