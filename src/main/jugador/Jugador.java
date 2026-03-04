package main.jugador;

import java.util.Random;

import main.core.Tablero;

public abstract class Jugador {

    public static final int NUM_BARCOS = 5;

    protected String nombre;
    protected Tablero miTablero;
    protected Tablero tableroRival;
    protected Barco[] flota;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.miTablero = new Tablero();
        this.flota = new Barco[NUM_BARCOS];
    }

    /**
     * Coloca toda la flota de forma aleatoria buscando posiciones válidas.
     */
    public void colocarAutoTodaLaFlota() {
        Random rnd = new Random();
        for (Barco b : flota) {
            boolean colocado = false;
            int intentos = 0;
            while (!colocado && intentos < 1000) {
                int f = rnd.nextInt(Tablero.TAMAÑO);
                int c = rnd.nextInt(Tablero.TAMAÑO);
                Direccion d = Direccion.values()[rnd.nextInt(Direccion.values().length)];
                colocado = miTablero.colocarBarco(b, new Coordenada(f, c), d);
                intentos++;
            }
            if (!colocado) {
                System.err.println("Error: No se pudo colocar el barco " + b.getNombre() + " tras 1000 intentos.");
            }
        }
    }

}
