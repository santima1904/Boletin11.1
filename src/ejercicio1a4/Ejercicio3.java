package ejercicio1a4;

import java.io.File;
import java.util.Arrays;

public class Ejercicio3 {


    public static void muestraContenido (String ruta){

        File file = new File(ruta);
        String[] contenido = file.list();

        if (contenido == null && contenido.length < 0){
            System.out.println("Esta vacio");
        }

        Arrays.sort(contenido);

        for (String i:contenido) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        muestraContenido(".");
    }
}
