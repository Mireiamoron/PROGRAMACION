package ra4y7.moron;

public class Motocicleta extends VehiculoTerrestre {
	public Motocicleta(String nombre, int capacidadMaxima, String matricula, int anioFabricacion, Color color) {
		super(nombre, capacidadMaxima, matricula, anioFabricacion, color);
		
	}

	@Override
	public String mostrarTipo() {
		return "Motocicleta";
	}
	
}
