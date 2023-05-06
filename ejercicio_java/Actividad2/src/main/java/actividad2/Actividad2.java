package actividad2;

import java.util.Scanner;

/**
 *
 * @author Diego Alencastro
 */
public class Actividad2 {

    public static void main(String[] args) {
        int menuPrincipal;
        Scanner scannerEnteros = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("--SISTEMA DE GESTIÓN DE UNIVERSIDADES--");
            System.out.println("1.Lista de Universidades registradas");
            System.out.println("2.Agregar Universidad");
            System.out.println("3.SALIR");
            System.out.println("Escoja una opción:");
            menuPrincipal = scannerEnteros.nextInt();

            switch (menuPrincipal) {
                case 1:
                    System.out.println("--LISTADO DE UNIVERSIDADES REGISTRADAS--");

                    break;
                case 2:
                    System.out.println("REGISTRO DE NUEVA UNIVERSIDAD");
                    break;
                case 3:
                    System.out.println("---Gracias por usar nuestro sistema---");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }

        } while (menuPrincipal != 3);
    }
}
