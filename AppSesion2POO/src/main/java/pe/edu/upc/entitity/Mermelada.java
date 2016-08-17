package pe.edu.upc.entitity;

public class Mermelada extends Fruta {
	
	private int duraciones;
	private String tipoEnvases;
	
	
	
	public String PreparaMermelada()
	{
		return ("Preparando mermelado con alegria"+this.getNombre());
		
		
		
	}
	public Mermelada(String nombre, String color, String sabor, int duraciones, String tipoEnvase) {
		super(nombre, color, sabor);
		this.duraciones= duraciones;
		this.tipoEnvases = tipoEnvase;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
