package logica;

public class Dama extends Pieza{
	public Dama(int fila, int columna) {
        super(fila, columna);
    }
	public int calcularMovimientos() {
        int movimientos = 0;
        
        movimientos += 7;  
        movimientos += 7;  
        
        int movDiagonal1 = Math.min(8 - fila, 8 - columna);  
        int movDiagonal2 = Math.min(fila - 1, columna - 1);  
        int movDiagonal3 = Math.min(8 - fila, columna - 1);  
        int movDiagonal4 = Math.min(fila - 1, 8 - columna);  
        movimientos += movDiagonal1 + movDiagonal2 + movDiagonal3 + movDiagonal4;
        
        return movimientos;
    }
}
