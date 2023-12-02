package practica11.ejercicio4;

class Tablero {
    private char[][] tablero;
    private int[] barcos;
    private int barcosHundidos;

    public Tablero(int tam, int[] tamBarcos) {
        tablero = new char[tam][tam];
        barcos = tamBarcos;
        barcosHundidos = 0;
        generarBarcos();
    }

    private void generarBarcos() {
        for (int size : barcos) {
            boolean colocado = false;
            while (!colocado) {
                int fila = (int) (Math.random() * tablero.length);
                int columna = (int) (Math.random() * tablero[0].length);
                int orientacion = (int) (Math.random() * 2);
                if (comprobarPosicion(fila, columna, size, orientacion)) {
                    colocarBarco(fila, columna, size, orientacion);
                    colocado = true;
                }
            }
        }
    }

    private boolean comprobarPosicion(int fila, int columna, int size, int orientacion) {
        if (orientacion == 0) {
            if (columna + size > tablero[0].length) {
                return false;
            }
            for (int i = columna; i < columna + size; i++) {
                if (tablero[fila][i] != '\u0000') {
                    return false;
                }
            }
        } else {
            if (fila + size > tablero.length) {
                return false;
            }
            for (int i = fila; i < fila + size; i++) {
                if (tablero[i][columna] != '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    private void colocarBarco(int fila, int columna, int size, int orientacion) {
        for (int i = 0; i < size; i++) {
            if (orientacion == 0) {
                tablero[fila][columna + i] = 'B';
            } else {
                tablero[fila + i][columna] = 'B';
            }
        }
    }

    public void marcarDisparo(int fila, int columna, boolean acierto) {
        if (acierto) {
            tablero[fila][columna] = 'X';
        } else {
            tablero[fila][columna] = 'O';
        }
    }

    public void mostrarTablero() {
        mostrarTablero(true);
    }

    public void mostrarTablero(boolean ocultarBarcos) {
        System.out.print("  ");
        for (int i = 0; i < tablero[0].length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((char) (i + 'A') + " ");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 'B' && ocultarBarcos) {
                    System.out.print('\u0000' + " ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void contarBarcosHundidos() {
        int[] sizes = {4, 3, 2, 2};
        for (int size : sizes) {
            int aciertos = 0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    if (tablero[i][j] == 'X') {
                        if (comprobarBarco(i, j, size, 0)) {
                            aciertos++;
                        } else if (comprobarBarco(i, j, size, 1)) {
                            aciertos++;
                        }
                    }
                }
            }
            if (aciertos == size) {
                barcosHundidos++;
            }
        }
    }

    private boolean comprobarBarco(int fila, int columna, int size, int orientacion) {
        if (orientacion == 0) {
            if (columna + size > tablero[0].length) {
                return false;
            }
            for (int i = columna; i < columna + size; i++) {
                if (tablero[fila][i] != 'X') {
                    return false;
                }
            }
        } else {
            if (fila + size > tablero.length) {
                return false;
            }
            for (int i = fila; i < fila + size; i++) {
                if (tablero[i][columna] != 'X') {
                    return false;
                }
            }
        }
        return true;
    }
}