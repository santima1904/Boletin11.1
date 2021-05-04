package ejercicio1a4;

import java.io.File;
import java.util.Scanner;

public class Ejericicio2 {

    /**
     * Ejercicio 2
     * Muestra las propiedades indicadas del directorio indicado
     *
     * @param teclado
     */
    public static void MostrarPropiedades(Scanner teclado){

        File file = new File(teclado.nextLine());
        File [] propiedades = file.listFiles();

        if (propiedades == null && propiedades.length < 0){
            System.out.println("Esta vacio");

        }else {
            for (int i = 0; i < propiedades.length; i++) {
                file = propiedades[i];

                System.out.println(
                        "Propiedades " + "\n" +
                                "Nombre: " + file.getName() + "\n" +
                                //"Funcion: " + file.isDirectory() ? "Carpeta" : "Archivo" + "\n" +
                                "Longitud: " + file.length() + "\n" +
                                "Ruta: " + file.getPath()
                );
            }
        }
    }

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

         MostrarPropiedades(teclado);




    }

}
