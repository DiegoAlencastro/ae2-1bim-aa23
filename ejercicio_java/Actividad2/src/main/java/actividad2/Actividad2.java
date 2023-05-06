package actividad2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Alencastro
 */
public class Actividad2 {

    public static void main(String[] args) {
        int menuPrincipal;
        String auxiliarIngreso;
        List<Universidad> lista_universidad = new ArrayList<>();

        Scanner scannerEnteros = new Scanner(System.in);
        Scanner scannerTextos = new Scanner(System.in);

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
                    for (int i = 0; i < lista_universidad.size(); i++) {
                        System.out.println("Nombre: " +lista_universidad.get(i).getNombre());
                        System.out.println("Ciudad: " +lista_universidad.get(i).getCiudad());
                        System.out.println("Numero de carreras: " +lista_universidad.get(i).getLista_carrera().size());
                        
                        for (int j = 0; j < lista_universidad.get(i).getLista_carrera().size(); j++) {
                        	System.out.println("Carrera: "+ lista_universidad.get(i).getLista_carrera().get(j).getNombre());
						}
                        System.out.println("--------------------------------------------------");    
                    }
                    break;
                case 2:
                	System.out.println("REGISTRO DE NUEVA UNIVERSIDAD");
                    int numeroCarreras = 0,
                     auxValor = 0;
                    double costoAux = 0.0;
                    Universidad universidadAuxiliar = new Universidad();
                    System.out.println("Ingrese el nombre de la universidad:");
                    auxiliarIngreso = scannerTextos.nextLine().toUpperCase();
                    universidadAuxiliar.setNombre(auxiliarIngreso);
                    System.out.println("Ingrese el nombre del rector:");
                    auxiliarIngreso = scannerTextos.nextLine();
                    universidadAuxiliar.setRector(auxiliarIngreso);
                    System.out.println("Ingrese la Ciudad en la que se encuentra ubicada:");
                    auxiliarIngreso = scannerTextos.next();
                    universidadAuxiliar.setCiudad(auxiliarIngreso);
                    System.out.println("Ingrese las modalidades que ofrece la Universidad (Presencial o Virtual:)");
                    auxiliarIngreso = scannerTextos.next();
                    universidadAuxiliar.setTipo(auxiliarIngreso);
                    System.out.println("Ingrese la categoría de la Universidad (A-B-C-D):");
                    auxiliarIngreso = scannerTextos.next();
                    universidadAuxiliar.setCategoria(auxiliarIngreso);

                    lista_universidad.add(universidadAuxiliar);

                    System.out.println("Cuantas carreras tiene la universidad: " + universidadAuxiliar.getNombre());
                    numeroCarreras = scannerEnteros.nextInt();
                    scannerTextos.nextLine();
                    for (int i = 0; i < numeroCarreras; i++) {
                        Carrera carreraAux = new Carrera();
                        System.out.println("Ingrese el nombre de la carrera:");
                        auxiliarIngreso = scannerTextos.nextLine();
                        carreraAux.setNombre(auxiliarIngreso);
                        System.out.println("Ingrese el nombre del director:");
                        auxiliarIngreso = scannerTextos.nextLine();
                        carreraAux.setDirectorCarrera(auxiliarIngreso);
                        System.out.println("Ingrese el costo total:");
                        costoAux = scannerEnteros.nextDouble();
                        carreraAux.setCosto(costoAux);
                        System.out.println("Ingrese la duración:");
                        auxValor = scannerEnteros.nextInt();
                        carreraAux.setDuracion(auxValor);
                        System.out.println("Ingrese el numero total de estudiantes:");
                        auxValor = scannerEnteros.nextInt();
                        carreraAux.setNumEstudiantes(auxValor);

                        universidadAuxiliar.getLista_carrera().add(carreraAux);
                    }

                    System.out.println("Su universidad ha sido registrada.");

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
