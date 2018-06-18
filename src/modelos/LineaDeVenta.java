package modelos;

public class LineaDeVenta {
	
	private int cantidad;
	private EspecificacionDelProducto producto;
	
	
	/**
	 * Contructor de la clase.
	 * METODO DE CLASE 
	 * 	 * */
	LineaDeVenta(int cantidad, EspecificacionDelProducto producto){
		this.cantidad=cantidad;
		this.producto=producto;
	}
	
	public int getSubtotal() {
		int subtotal = this.producto.getPrecio()*cantidad;
		return subtotal;
	}
	

}
