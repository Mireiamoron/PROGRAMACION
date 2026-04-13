package ra4y7.moron;

public class Garaje {
	private Vehiculo vehiculoActual;
	
	public void entrar(Vehiculo v) {
		if (vehiculoActual == null) {// cuantos vehiculos detecta
			vehiculoActual = v;
			System.out.println("Vehículo dentro del garaje");
		}else {
			System.out.println("El garaje esta ocupado");
		}	
	}
	
	public Vehiculo salir() {
		Vehiculo v = vehiculoActual;
		vehiculoActual = null;
		return v;
		
	}
	
	public void mostrarEstado() {
		if (vehiculoActual == null) {// si hay huecos, devolverá que el garaje esta vacio
			System.out.println("Garaje vacio");
		}else {
			
			System.out.println("Hay un " + vehiculoActual.mostrarTipo() + "dentro.");
		}
	}
		
	
	
	}
	
	
	
