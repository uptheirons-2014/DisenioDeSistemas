package modelos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Venta {
	
	
	private Date fecha;
	private Boolean esCompleta;
	private SimpleDateFormat hora;
	private ArrayList<LineaDeVenta> lineasDeVenta; 	
	private Pago pago;
	
	/**
	 * Constructor de clase. 
	 * Seteamos la fecha y la hora al momento de crear la venta
	 * */
	Venta(){
		this.fecha= new Date();
		this.hora = new SimpleDateFormat("HH:mm:ss");
		this.esCompleta= false;
	}
	
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getEsCompleta() {
		return esCompleta;
	}


	public void setEsCompleta(Boolean esCompleta) {
		this.esCompleta = esCompleta;
	}


	public SimpleDateFormat getHora() {
		return hora;
	}


	public void setHora(SimpleDateFormat hora) {
		this.hora = hora;
	}
	
	 public void seHaCompletado() {
		 this.esCompleta=true;
	 }
	
	/**
	 * Este metodo Crea una instancia de Linea de Venta y la agrega a la colleccion "lineasDeVenta"
	 * */
	
	public void crearLineaDeVenta(int cantidad, EspecificacionDelProducto producto){
		LineaDeVenta unaLineaDeVenta = new LineaDeVenta(cantidad, producto);
		this.lineasDeVenta.add(unaLineaDeVenta);
	}
	
	public void realizarPago(TipoPago tipo, int cantidad ) {
		
		Pago unPago=new Pago(tipo, cantidad);
		this.pago=unPago;
		
	}
	
	public int getTotal() {
		
		int total=  0 ; 
		Iterator<LineaDeVenta> iterator = this.lineasDeVenta.iterator();
		while(iterator.hasNext()){
			LineaDeVenta unaLineaDeVenta = iterator.next();
			total=total+unaLineaDeVenta.getSubtotal();
		}

		return total;
	}


	

}
