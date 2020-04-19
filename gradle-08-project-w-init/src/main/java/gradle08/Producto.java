package gradle08;

public class Producto {
	private int precio;
	private String nombre;

	public Producto(String _nombre, int _precio){
		nombre=_nombre;
		precio=_precio;
	}

	public void updatePrecio(int _precio){
		precio=_precio;
	}

	public void showPrecio(){
		System.out.println("Precio: "+precio);

	}

}