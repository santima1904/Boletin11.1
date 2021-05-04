package ejercicio1a4;

import java.time.LocalDate;

public class Datos {

    private  String nombre;
    private float fecha;
    private boolean oculto;
    private double tamanho;

    public Datos(String nombre) {
        this.nombre = nombre;
        fecha = 0;
        oculto = false;
        tamanho = 0;
    }

    public Datos(String nombre, float fecha, boolean oculto, double tamanho) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.oculto = oculto;
        this.tamanho = tamanho;
    }
}
