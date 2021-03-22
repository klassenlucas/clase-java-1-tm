package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un numero entero");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++){
            if(esPar(i)) {
                System.out.print(i);
            }
        }

    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

}
