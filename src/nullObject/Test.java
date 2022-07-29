package nullObject;

public class Test {

	public static void main(String[] args) {

		SistemaInventario modelo1 = Fabrica.getModelo("Urbanas");
		SistemaInventario modelo2 = Fabrica.getModelo("Rutas");
		SistemaInventario modelo3 = Fabrica.getModelo("Plegables");
		SistemaInventario modelo4 = Fabrica.getModelo("BMX");

		System.out.println("Modelos");
		System.out.println(modelo1.getModelo());
		System.out.println(modelo2.getModelo());
		System.out.println(modelo3.getModelo());
		System.out.println(modelo4.getModelo());
	}

}
