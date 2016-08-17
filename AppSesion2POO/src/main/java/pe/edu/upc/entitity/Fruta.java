package pe.edu.upc.entitity;


//clase padre
public class Fruta {

	//los atributos  instancias las 4 primeras, sus valores cambian con sus valores
	
	private String Nombre;
	private String Color;
	private String Sabor;
	private boolean PuedohacerJugo;
	
	
	//atributo de clase,se le coloca static si depende directamente de la clase
	public static String LugarOrigen="UPC";


	//Constructores- instanciar
	
	public Fruta(String nombre, String color, String sabor) {
		super();
		Nombre = nombre;
		Color = color;
		Sabor = sabor;
		PuedohacerJugo = false;
	}

	//sobrecarga
	public Fruta( ) {
		Nombre = "Indefinido";
		Color = "S/C";
		Sabor = "S/C";
	}
	
	
	
	
	//sets y gets
	//metodos de acceso a datos

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}

	public boolean isPuedohacerJugo() {
		return PuedohacerJugo;
	}

	public void setPuedohacerJugo(boolean puedohacerJugo) {
		PuedohacerJugo = puedohacerJugo;
	}

	
	//sobre escritura
	@Override
	public String toString() {
		return "Fruta [Nombre=" + Nombre + ", Color=" + Color + ", Sabor=" + Sabor + ", PuedohacerJugo="
				+ PuedohacerJugo + "]";
	}

	

	
	
	
	
	
	
	
}
