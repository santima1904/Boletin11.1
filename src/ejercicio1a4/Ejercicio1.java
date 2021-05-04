package ejercicio1a4;

import java.io.File;

public class Ejercicio1 {

    /**
     * Mostrar contenido del directorio actual
     */
    public static void MostrarDirectorioActual(){
        File file = new File(".");
        String [] contenido = file.list();

        if (contenido == null && contenido.length < 0){
            System.out.println("Esta vacio");
        }

        for (String i:contenido) {
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        MostrarDirectorioActual();
    }

}
