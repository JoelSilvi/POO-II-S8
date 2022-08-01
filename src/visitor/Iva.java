package visitor;

public class Iva implements Visitor {
	private final double impuestoNormal = 1.25;
	private final double impuestoReducido = 1.105;
	
	public double visit(ProductoNormal normal) {
		return normal.getPrecio() * impuestoNormal;
	}
	
	public double visit(ProductoDescuento reducido) {
		return reducido.getPrecio() * impuestoReducido;
	}
}
