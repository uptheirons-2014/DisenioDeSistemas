package modelos;

public class EspecificacionDelProducto {
	
	private String descripcion;
	private int precio;
	private int articuloId;
	
	public EspecificacionDelProducto(String descripcion, int precio, int articuloID) {
		// TODO Auto-generated constructor stub
		this.descripcion=descripcion;
		this.precio=precio;
		this.articuloId=articuloID;
	}
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getArticuloId() {
		return articuloId;
	}
	public void setArticuloId(int articuloId) {
		this.articuloId = articuloId;
	}
	
	
	
	
}
