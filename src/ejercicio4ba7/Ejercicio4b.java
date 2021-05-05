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

        File file = new File(".");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        while(caracter!='0'){
            System.out.println("Pulse 0 para salir");
            caracter = teclado.next().charAt(0);
            bw.write(caracter);
        }
        bw.close();
    }
}
