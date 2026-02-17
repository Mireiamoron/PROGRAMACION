package entorno_desarrollo;

public class GITHUB {
	

	    public static void main(String[] args) { 
	        ArrayList<Double> precios = new ArrayList<>(); 
	        precios.add(40.0); 
	        precios.add(60.0); 
	        precios.add(100.0); 

	        double total = calcularTotal(precios); 
	        total = aplicarDescuento(total, true); 
	        double media = calcularMedia(precios); 

	        System.out.println("TOTAL FINAL: " + total); 
	        System.out.println("PRECIO MEDIO: " + media); 
	    } 

	    public static double calcularTotal(ArrayList<Double> precios){ 
	        double total = 0; 

	        for(int i = 0; i < precios.size(); i++){  // ERROR: estaba i <= precios.size() → causaba IndexOutOfBoundsException. Debe ser < porque los índices van de 0 a size()-1
	            total += precios.get(i); 
	        } 

	        return total; 
	    } 

	    public static double aplicarDescuento(double total, boolean vip){ 
	        if(vip == true){  // ERROR: estaba vip = true (asignación). Debe ser comparación (==) o simplemente if(vip)
	            total = total - total * 15 / 100; 
	        } 

	        if(total > 150){ 
	            total = total - 20; 
	        } 

	        return total; 
	    } 

	    public static double calcularMedia(ArrayList<Double> precios){ 

	        double suma = 0; 

	        for(Double p : precios){ 
	            suma += p; 
	        } 

	        if(precios.size() == 0){   // ERROR : división por 0 si la lista está vacía
	            return 0;              // Se controla para que funcione con listas de cualquier tamaño
	        }

	        return suma / precios.size();   // ERROR: estaba precios.size() - 1 → cálculo incorrecto de la media
	    } 


		    public static double aplicarDescuento(double total, boolean vip){ 
		        if(vip = true){  
		            total = total - total * 15 / 100; 
		        } 
		 
		        if(total > 150){ 
		            total = total - 20; 
		        } 
		 
		        return total; 
		    } 
		 
		    public static double calcularMedia(ArrayList<Double> precios){ 
		 
		        double suma = 0; 
		 
		        for(Double p : precios){ 
		            suma += p; 
		        } 
		 
		        return suma / (precios.size() - 1);    
		    }
		    }
		    



