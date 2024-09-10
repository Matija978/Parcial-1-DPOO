package logica;

public class Peon extends Pieza {
    public Peon(int fila, int columna) {
        super(fila, columna);
    }
    @Override
    public int calcularMovimiento() {
        if (fila == 2) {
            return 2;  
        } 
        if (fila>2) {
            return 1;  
        } 
        
        else {
            return 0;  
        }
    }
    

    
}