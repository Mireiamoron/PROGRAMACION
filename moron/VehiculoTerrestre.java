package ra4y7.moron;

// clase no instanciable 
public abstract class VehiculoTerrestre extends Vehiculo implements Comparable<VehiculoTerrestre>{
	
	protected String matricula;
	protected int anioFabricacion;
	protected Color color;
	
	public VehiculoTerrestre(String nombre, int capacidadMaxima, String matricula, int anioFabricacion , Color color ) {
		super(nombre, capacidadMaxima);
		this.matricula = matricula;
		this.anioFabricacion = anioFabricacion; 
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!obj instanceof VehiculoTerrestre)) return false;
		VehiculoTerrestre v = (VehiculoTerrestre) obj;
		return 
				this.matricula.equals(v.matricula);// matricula ordenada
	}
	
	@Override
	public int compareTo(o.matricula);
}

	public static int compararPorAnio(VehiculoTerrestre, t1, VehiculoTerrestre, t2) { // vehiculos ordenados por año
		return 
				Integer.compare(t1.anioFabricacion, t2.anioFabricacion);// vehiculos comparados
	
		
	
	}
	