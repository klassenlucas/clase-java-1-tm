package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un numero entero ");
        int n = scanner.nextInt();

        scanner.close();

        for (int i = 0; i<n; i++) {
            if(esPrimo(i)) {
                System.out.println(i);
            }
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
