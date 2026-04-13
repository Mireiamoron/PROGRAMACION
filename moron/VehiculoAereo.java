package ra4y7.moron;

public abstract class VehiculoAereo extends Vehiculo{
	protected int altitud;
	protected String codigoOACI;
	protected static int contadorAereo;
	
	
	
	public VehiculoAereo(String nombre, int capacidadMaxima, int altitud, String codigoOACI) {
		super(nombre, capacidadMaxima);
		this.altitud = altitud;
		this.codigoOACI = codigoOACI;
		contadorAereos++;
	}
	
	 public abstract String volar();
	 
	 public static int getTotalAereos() {
		 return contadorAereos;
		 	 }
		
		
		
		
	}
	
	
	


