package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar cantidad de numeros naturales a mostrar: ");
        int n = scanner.nextInt();
        System.out.print("Ingresar cantidad de apariciones para el digito deseado: ");
        int m = scanner.nextInt();
        System.out.print("Ingresar digito deseado: ");
        int d = scanner.nextInt();

        scanner.close();

        int numerosNaturalesEncontrados = 0;

        for(int i = 0; numerosNaturalesEncontrados < n ; i++) {
            String iString = String.valueOf(i);
            char dChar = (char) (d+'0');
            int cantAparicionesDeCaracter = cantidadAparicionesDeCaracter(iString,dChar);
            if(cantAparicionesDeCaracter >= m) {
                System.out.println(i);
                numerosNaturalesEncontrados++;
            }
        }
    }

    public static int cantidadAparicionesDeCaracter(String s, char c) {
        int cantidadEncontrada = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                cantidadEncontrada++;
            }
        }
        return cantidadEncontrada;
    }
}
