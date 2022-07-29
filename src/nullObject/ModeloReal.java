package nullObject;

public class ModeloReal extends SistemaInventario {

	public ModeloReal(String _modelo) {
		this.modelo = _modelo;
	}

	@Override
	public String getModelo() {
		return "Modelo no disponible en la base de datos";
	}

	@Override
	public boolean esNulo() {
		return true;
	}

}
