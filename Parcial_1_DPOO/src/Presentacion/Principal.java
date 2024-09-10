package Presentacion;
import logica.Peon;
import logica.Pieza;
import logica.Torre;
import logica.Dama;
public class Principal {
    public static void main(String[] args) {
        Pieza peon = new Peon(2, 2);
        System.out.println("El Peón puede moverse  " + peon.calcularMovimiento() + " casilla(s).");

        Pieza torre = new Torre(4, 4);
        System.out.println("La Torre puede moverse  " + torre.calcularMovimiento() + " casilla(s).");

        Pieza dama = new Dama(5, 5);
        System.out.println("La Dama puede moverse  " + dama.calcularMovimiento() + " casilla(s).");
    }
}