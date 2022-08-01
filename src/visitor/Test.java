package visitor;

public class Test {
	public static void main(String[] args) {
		ProductoDescuento producto1 = new ProductoDescuento();
		producto1.setPrecio(100);
		ProductoNormal producto2 = new ProductoNormal();
		producto2.setPrecio(100);
		
		Iva iva = new Iva();
		double resultado1 = producto1.accept(iva);
		double resultado2 = producto2.accept(iva);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
