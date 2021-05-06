package ejercicio4ba7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4b {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        char caracter = '1';
        String ruta = "C:\\Users\\smartinez\\Desktop\\Programacion\\Ficheros\\Boletin11.1\\ficheros\\prueba.txt";
        //ruta del fichero prueba

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta)));
        //buffer para escribir en el fichero

        System.out.println("Pulse 0 para salir");
        while(caracter!='0'){
            caracter = teclado.next().charAt(0);
            if (caracter!='0'){
                bw.write(caracter);//caracter que se pasa al fichero para escribirlo
            }
        }
        bw.close();
    }
}
