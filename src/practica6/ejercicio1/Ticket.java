package practica6.ejercicio1;

import java.util.List;

public class Ticket {
    private double total;
    private List<Integer> asientos;
    private int codigo;
    private static int currentTicketCode = 0;

    public Ticket(List<Integer> asientos, int codigo) {
        this.asientos = asientos;
        this.codigo = currentTicketCode++;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Integer> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Integer> asientos) {
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
