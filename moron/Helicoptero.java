package ra4y7.moron;

public class Helicoptero extends VehiculoAereo {
	public Helicoptero(String nombre, int capacidadMaxima, int altitud, String codigoOACI) {
		
		super(nombre, capacidadMaxima, altitud, String codigoOACI) {
			
		}
		@Override
		public String volar() {
			return "Helicoptero volando a " + altitud + "pies"
		}
		
		@Override
		public String mostrarTipo() {
			return "Helicoptero"
		}
		
	}
	

		
		
		
		
		
	
		
	

