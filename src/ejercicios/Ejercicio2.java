package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un numero entero ");
        int n = scanner.nextInt();
        System.out.print("Ingresar un numero entero ");
        int m = scanner.nextInt();
        scanner.close();

        int contadorPrimos = 0;
        for (int i = 1; contadorPrimos<n && i < m; i++ ) {
            if(m%i==0) {
                System.out.println(i);
                contadorPrimos++;
            }
        }
    }
}
