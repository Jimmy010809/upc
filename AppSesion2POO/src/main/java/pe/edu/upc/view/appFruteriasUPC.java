package pe.edu.upc.view;
import pe.edu.upc.entitity.Fruta;

public class appFruteriasUPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFrut = new Fruta("Mango", "Amarillo","Dulce");
		System.out.println(objFrut.toString());
		
		Fruta.LugarOrigen = "Otro Lugar";
		System.out.println(Fruta.LugarOrigen);
	}

}
