package ra4y7.moron;

public abstract class Vehiculo {
	protected String nombre;
	protected int capacidadMaxima;
	protected int personasTransportadas;
	
	public Vehiculo(String nombre, int capacidadMaxima) {
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
		this.personasTransportadas = 0;
	}
	
	public void transportar(int personas)
	
	{
	
		if(personasTransportadas + personas <= capacidadMaxima) {
			personasTransportadas += personas;
			
		} else {
			System.out.println("No se pueden transportar tantas personas.Capacidad excedida");
		}
	}
			
			public abstract String mostrarTipo();
			
		
				
		
	}	



	

