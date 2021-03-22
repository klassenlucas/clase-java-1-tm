package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un numero entero ");
        int n = scanner.nextInt();

        scanner.close();

        if(esPrimo(n)) {
            System.out.print("El numero "+n+" es primo");
        } else {
            System.out.print("El numero "+n+" no es primo");
        }
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        int contador = 2;
        while (esPrimo && contador!=n) {
            if(n%contador == 0 || n == 1) {
                return false;
            }
            contador++;
        }
        return true;
    }
}
