package ra4y7.moron;

public class Avioneta extends VehiculoAereo {
	public avioneta(String nombre, int capacidadMaxima, int altitud, String codigoOACI) {
		
		super(nombre, capacidadMaxima, altitud, String codigoOACI) {
			
		}
		@Override
		public String volar() {
			return "Avioneta volando a " + altitud + "pies"
		}
		
		@Override
		public String mostrarTipo() {
			return "Avioneta"
		}
		
	
	
}
}
