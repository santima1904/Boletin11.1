package ejercicio1a4;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;

public class Ejercicio4 {


    public static void muestraContenido (String ruta){

        File file = new File(ruta);
        File[] contenido = file.listFiles();
        Datos[] retorno = new Datos[contenido.length];//array para meter los datos

        if (contenido == null && contenido.length < 0){
            System.out.println("Esta vacio");
        }

        Arrays.sort(contenido);

        for (int i = 0; i< contenido.length;i++) {
            if (contenido[i].isFile()&&contenido[i].isDirectory()){
                Datos dato = new Datos(contenido[i].getName(), contenido[i].lastModified(), contenido[i].isHidden(), contenido[i].length());

                retorno[i] = dato;
            }

        }

    }

    public static void main(String[] args) {
        muestraContenido(".");
    }
}
