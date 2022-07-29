package nullObject;

public class Fabrica {

	public static final String[] modelos = { "Urbanas", "Rutas", "Plegables" };

	public static SistemaInventario getModelo(String _modelo) {

		for (int i = 0; i < modelos.length; i++) {
			if (modelos[i].equalsIgnoreCase(_modelo)) {
				return new ModeloReal(_modelo);
			}
		}
		return new ModeloNulo();
	}

}
