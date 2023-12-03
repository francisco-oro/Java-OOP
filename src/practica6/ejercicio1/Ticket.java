package practica6.ejercicio1;

import java.util.List;

public class Ticket {
    private double total;
    private Integer[] asientos;
    private int codigo;
    private static int currentTicketCode = 0;
    private Funcion funcion;

    public Ticket(int asientos, Funcion funcion) {
        this.asientos = funcion.obtenerAsientos(asientos);
        this.codigo = currentTicketCode++;
        this.total = asientos * funcion.getCost();
        this.funcion = funcion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer[] asientos) {
        this.asientos = asientos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCurrentTicketCode() {
        return currentTicketCode;
    }

    public static void setCurrentTicketCode(int currentTicketCode) {
        Ticket.currentTicketCode = currentTicketCode;
    }
}
