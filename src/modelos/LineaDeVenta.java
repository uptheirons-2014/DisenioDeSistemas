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
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public EspecificacionDelProducto getProducto() {
		return producto;
	}

	public void setProducto(EspecificacionDelProducto producto) {
		this.producto = producto;
	}

	public int getSubtotal() {
		int subtotal = this.producto.getPrecio()*cantidad;
		return subtotal;
	}
	

}
