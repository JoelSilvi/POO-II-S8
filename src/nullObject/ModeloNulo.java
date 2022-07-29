package nullObject;

public class ModeloNulo extends SistemaInventario {

	@Override
	public String getModelo() {
		return "No disponible en la base de datos de Modelos";
	}

	@Override
	public boolean esNulo() {
		return true;
	}

}
