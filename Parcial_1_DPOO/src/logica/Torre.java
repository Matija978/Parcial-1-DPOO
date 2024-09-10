package logica;

public class Torre extends Pieza {
    public Torre(int fila, int columna) {
        super(fila, columna);
    }
    
    @Override
    public int calcularMovimiento() {
        if (fila>1){
            return (8-fila);  
        } 
        else {
        return 0;
        }
    }
    
}