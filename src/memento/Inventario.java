package memento;

public class Inventario {
	private String modelo, descripcion;
	
	
	public Memento guardarAMemento() {
		System.out.println("Guardando Memento...");
		return new Memento(modelo, descripcion);
	}
	
	
	public void restaurarDeMemento(Memento m, Memento d ) {
		modelo = m.obtenerEstadoModelo();
		descripcion = m.obtenerEstadoDescripcion();
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
