package logica;

public abstract class Pieza {
	protected int fila;
	protected int columna;
	
	
	public Pieza(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
		
	}
	public void setColumna(int columna) {
		this.columna=columna;
	}
	public void setFila(int fila) {
		this.fila=fila;
	}
	public int getColumna() {
		return columna;
		
	}
	public int getFila() {
		return fila;	
	}
	public abstract int calcularMovimiento();
	
}