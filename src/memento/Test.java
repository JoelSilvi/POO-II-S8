package memento;

public class Test {
	
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Inventario m = new Inventario();
		Inventario d = new Inventario();
		m.setModelo("Montaña");
		d.setDescripcion("A toda Prueba");
		
		caretaker.addMemento(m.guardarAMemento());
		
		caretaker.addMemento(d.guardarAMemento());
				
		Memento m1 = caretaker.getMemento(0);
		Memento m2 = caretaker.getMemento(1);
		
		System.out.println(m1.obtenerEstadoModelo());
		System.out.println(m2.obtenerEstadoDescripcion());
		
		
	}

}
