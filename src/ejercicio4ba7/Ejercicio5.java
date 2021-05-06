package ejercicio4ba7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

    /**
     *Ejercicio para calcular las palabras que tiene un fichero
     *
     * @param ruta
     */
    public static  void calcularNumeroPalabras(String ruta){

        try
        {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            //buffer para leer del fichero indicado con la ruta

            String linea;//variable para definir una linea del fichero
            int palabras = 0;//variable para contar las palabras
            while((linea = lector.readLine()) != null)//cuando la linea sea nula se para de contar,
            // es decir, se cuenta mientras hay al menos un caracter en la linea
            {
                System.out.println(linea);//Se printea la linea
                for(int i=0; i < linea.length(); i++)//for para recorrer la linea caracter a caracter
                {
                    if(i==0)//if para controlar que la posicion sea 0
                    {//al ser 0, no hay que tener en cuenta que antes tenga un espacio porque es el primero
                        if(linea.charAt(i)!=' ')
                            palabras++;
                    }
                    else
                    {//al ser distinto de 0, se debe comprobar el caracter anterior para ver si es un espacio
                        if(linea.charAt(i-1)==' ')//si el anterior es un espacio en blanco y el actual no lo es,
                            // se cuenta como palabra
                            if(linea.charAt(i)!=' ')
                                palabras++;
                    }
                }
            }
            System.out.println("\nEL archivo contiene "+palabras+" palabras");
            lector.close();//cerrar el buffer
        }
        catch(IOException a)
        {
            System.out.println(a);
        }
    }

    /**
     *Ejercicio para calcular las parrafos que tiene un fichero
     *
     * @param ruta
     */
    public static void calcularNumeroParrafos(String ruta){
    int lineasNulas = 0, parrafos = 1;
    boolean nulo = true;

        try
        {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            //buffer para leer del fichero indicado con la ruta

            String linea;//variable para definir una linea del fichero
            while(lineasNulas < 2) {
                linea = lector.readLine();

                if (linea == null) {

                    lineasNulas++;
                    nulo = true;

                } else {
                    if (nulo){
                        parrafos++;
                    }
                    nulo = false;
                }
            }
            System.out.println("\nEL archivo contiene "+parrafos+" parrafos");
            lector.close();//cerrar el buffer
        }
        catch(IOException a)
        {
            System.out.println(a);
        }
    }


    /**
     *Ejercicio para calcular los caracteres que tiene un fichero
     *
     * @param ruta
     */
    public static void calcularNumeroCaracteres(String ruta){

        try
        {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            //buffer para leer del fichero indicado con la ruta

            String linea;//variable para definir una linea del fichero
            int caracteres = 0;//variable para contar las palabras
            while((linea = lector.readLine()) != null)//cuando la linea sea nula se para de contar,
            // es decir, se cuenta mientras hay al menos un caracter en la linea
            {
                System.out.println(linea);//Se printea la linea
                for(int i=0; i < linea.length(); i++)//for para recorrer la linea caracter a caracter
                {
                    if(linea.charAt(i)!=' ')
                        caracteres++;
                    }

            }
            System.out.println("\nEL archivo contiene "+caracteres+" caracteres");
            lector.close();//cerrar el buffer
        }
        catch(IOException a)
        {
            System.out.println(a);
        }
    }

    /**
     *Ejercicio para calcular la media de caracteres por palabra que tiene un fichero
     *
     * @param ruta
     */
    public static  void calcularMediaCaracteres(String ruta){

        try
        {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            //buffer para leer del fichero indicado con la ruta

            String linea;//variable para definir una linea del fichero
            double caracter = 0,  palabras = 0;//variable para contar las palabras
            while((linea = lector.readLine()) != null)//cuando la linea sea nula se para de contar,
            // es decir, se cuenta mientras hay al menos un caracter en la linea
            {
                System.out.println(linea);//Se printea la linea
                for(int i=0; i < linea.length(); i++)//for para recorrer la linea caracter a caracter
                {
                    if(i==0)//if para controlar que la posicion sea 0
                    {//al ser 0, no hay que tener en cuenta que antes tenga un espacio porque es el primero
                        if(linea.charAt(i)!=' ')
                            palabras++;
                    }
                    else
                    {//al ser distinto de 0, se debe comprobar el caracter anterior para ver si es un espacio
                        if(linea.charAt(i-1)==' ')//si el anterior es un espacio en blanco y el actual no lo es,
                            // se cuenta como palabra
                            if(linea.charAt(i)!=' ')
                                palabras++;
                    }
                    if (i == 0 && linea.charAt(i)!=' '|| linea.charAt(i-1)!=' '){
                        caracter++;
                    }
                }
            }
            System.out.println("\nLa media de caracteres por palabra es de  "+caracter/palabras+" palabras");
            lector.close();//cerrar el buffer
        }
        catch(IOException a)
        {
            System.out.println(a);
        }
    }

    /**
     *Ejercicio para calcular la media de palabras por parrafo que tiene un fichero
     *
     * @param ruta
     */
    public static void calcularMediaPalabraParrafos(String ruta){


        try
        {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            //buffer para leer del fichero indicado con la ruta

            int lineasNulas = 0;
            double palabras = 0, parrafos = 0;
            boolean nulo = true;
            String linea;//variable para definir una linea del fichero
            while(lineasNulas < 2) {
                linea = lector.readLine();

                if (linea == null) {

                    lineasNulas++;
                    nulo = true;

                } else {
                    if (nulo) {
                        parrafos++;
                    }
                    nulo = false;

                    for (int i = 0; i < linea.length(); i++)//for para recorrer la linea caracter a caracter
                    {
                        if (i == 0)//if para controlar que la posicion sea 0
                        {//al ser 0, no hay que tener en cuenta que antes tenga un espacio porque es el primero
                            if (linea.charAt(i) != ' ')
                                palabras++;
                        } else {//al ser distinto de 0, se debe comprobar el caracter anterior para ver si es un espacio
                            if (linea.charAt(i - 1) == ' ')//si el anterior es un espacio en blanco y el actual no lo es,
                                // se cuenta como palabra
                                if (linea.charAt(i) != ' ')
                                    palabras++;
                        }
                    }
                }
            }
            System.out.println("\nEL numero medio de palabras por parrafos es de  "+palabras/parrafos);
            lector.close();//cerrar el buffer
        }
        catch(IOException a)
        {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //System.out.print("Escribe el nombre del archivo de texto: ");
        //String ruta = teclado.next();
        String ruta = "C:\\Users\\smartinez\\Desktop\\Programacion\\Ficheros\\Boletin11.1\\ficheros\\prueba.txt";

        //calcularNumeroPalabras(ruta);
        //calcularNumeroParrafos(ruta);
        //calcularNumeroCaracteres(ruta);
        //calcularMediaCaracteres(ruta);
        calcularMediaPalabraParrafos(ruta);

    }
}
