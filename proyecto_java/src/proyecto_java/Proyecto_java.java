/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proyecto_java.transportes.Aereo;
import proyecto_java.transportes.Maritimo;
import proyecto_java.transportes.Terrestre;

/**
 *
 * @author Dev 01
 */
public class Proyecto_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        List<Aereo> transportesAereos = new ArrayList();
        List<Maritimo> transportesMaritimo = new ArrayList();
        List<Terrestre> transportesTerrestre = new ArrayList();
        
        menuTransportes(menuPrincipal());
    }

    public static int menuPrincipal() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Medios de Transporte \n\n1. Ingreso de Medio de transporte\n2. Ingreso de Transporte Aéreo"
                    + "\n3. Ingreso de Transporte Marítimo\n4. Ingreso de Transporte Terrestre\n5. Creditos\n6. Salir\n\nIngrese su opción: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 6);
        System.out.println("\n\n");
        return opcion;
    }

    public static void menuTransportes(int opcion) {
        Scanner sc = new Scanner(System.in);

        switch (opcion) {
            case 1:
                do {
                    System.out.print("Seleccione el Medio de Transporte\n\n1. Aéreo\n2. Marítimo\n3. Terrestre\n4. Volver al Menú anterior\n\nIngrese su opción: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 4);
                break;
            case 2:
                do {
                    System.out.print("Seleccione el Medio de Aéreo\n\n1. Avión\n2. Helicóptero\n3. Volver al Menú anterior\n\nIngrese su opción: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 3);
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        menuTransportes(1);
                        break;
                }
                break;
            case 3:
                do {
                    System.out.print("Seleccione el Medio de Transporte Marítimo\n\n1. Barco\n2. Submarino\n3. Volver al Menú anterior\n\nIngrese su opción: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 3);
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        menuTransportes(1);
                        break;
                }
                break;
            case 4:
                do {
                    System.out.print("Seleccione el Medio de Transporte Terrestre\n\n1. Auto\n2. Moto\n3. Volver al Menú anterior\n\nIngrese su opción: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 3);
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        menuTransportes(1);
                        break;
                }
                break;
            case 5:
                menuTransportes(menuPrincipal());
                break;
            case 6:
                System.exit(0);
                return;
        }
    }
}
