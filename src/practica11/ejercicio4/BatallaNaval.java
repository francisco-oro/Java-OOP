package practica11.ejercicio4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BatallaNaval {
    private static final int NUM_TABLEROS = 5;
    private static final int TAM_TABLERO = 6;
    private static final int MAX_INTENTOS = 20;
    private static final int[] TAM_BARCOS = {4, 3, 2, 2};
    private static final String NOMBRE_ARCHIVO = "juego#FechaHora";

    private Tablero[] tableros;
    private int numJuego;
    private int intentos;

    public BatallaNaval() {
        tableros = new Tablero[NUM_TABLEROS];
        for (int i = 0; i < NUM_TABLEROS; i++) {
            tableros[i] = new Tablero(TAM_TABLERO, TAM_BARCOS);
        }
        numJuego = 1;
        intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean ganado = false;
        while (!ganado && intentos < MAX_INTENTOS) {
            System.out.println("Juego #" + numJuego);
            System.out.println("Intentos restantes: " + (MAX_INTENTOS - intentos));
            System.out.println("Tablero de posiciones enemigas:");
            for (int i = 0; i < NUM_TABLEROS; i++) {
                System.out.println("Tablero " + (i + 1) + ":");
                tableros[i].mostrarTablero(false);
            }
            System.out.println("Ingrese la fila del disparo (1-" + TAM_TABLERO + "):");
            int fila = scanner.nextInt();
            System.out.println("Ingrese la columna del disparo (1-" + TAM_TABLERO + "):");
            int columna = scanner.nextInt();
            boolean acierto = false;
            for (Tablero tablero : tableros) {
                if (tablero.marcarDisparo(fila - 1, columna - 1, )) {
                    acierto = true;
                    break;
                }
            }
            intentos++;
            if (acierto) {
                System.out.println("¡Acierto!");
            } else {
                System.out.println("¡Fallaste!");
            }
            for (Tablero tablero : tableros) {
                tablero.contarBarcosHundidos();
            }
            ganado = true;
            for (Tablero tablero : tableros) {
                if (!tablero.todosHundidos()) {
                    ganado = false;
                    break;
                }
            }
        }
        if (ganado) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
        guardarArchivo(ganado);
    }

    private void guardarArchivo(boolean ganado) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime fechaHora = LocalDateTime.now();
        String nombreArchivo = NOMBRE_ARCHIVO.replace("#", String.valueOf(numJuego))
                .replace("FechaHora", fechaHora.format(formatter));
        File archivo = new File(nombreArchivo);
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Tablero de posiciones enemigas:\n");
            for (int i = 0; i < NUM_TABLEROS; i++) {
                escritor.write("Tablero " + (i + 1) + ":\n");
                escritor.write(tableros[i].toString());
            }
            escritor.write("Turnos jugados: " + intentos + "\n");
            escritor.write("Resultado: " + (ganado ? "Ganado" : "Perdido") + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar archivo.");
        }
    }

    public static void main(String[] args) {
        BatallaNaval juego = new BatallaNaval();
        juego.jugar();
    }
}