package memento;

public class Memento {
	private String estadoModelo, estadoDescripcion;
	
	public Memento(String _estadoModelo, String _estadoDescripcion ) {
		this.estadoModelo = _estadoModelo;
		this.estadoDescripcion = _estadoDescripcion;
	}
	
	public String obtenerEstadoModelo() {
		return estadoModelo ;
	}
	
	public String obtenerEstadoDescripcion() {
		return estadoDescripcion ;
	}
}
