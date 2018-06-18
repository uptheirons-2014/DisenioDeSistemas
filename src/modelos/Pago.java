package modelos;

public class Pago {

	private TipoPago tipo;
	private int cantidad;
	
	
	Pago(TipoPago tipo, int cantidad){
		this.tipo=tipo;
		this.cantidad=cantidad;
	}
	
	
	public TipoPago getTipo() {
		return tipo;
	}
	public void setTipo(TipoPago tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
