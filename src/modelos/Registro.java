package modelos;

import java.util.ArrayList;
import java.util.Iterator;

public class Registro {
	
	int numero;
	CatalogoDeProducto catalogo;


	public Registro(){

		this.catalogo=new CatalogoDeProducto();  
		
		System.out.println("CATALOGO");
		System.out.println("----------------------------");
		System.out.println("DESCRIPCION: " + this.catalogo.descripcion);
		
		Iterator<EspecificacionDelProducto> iterator = this.catalogo.collectionProductos.iterator();
		while(iterator.hasNext()){
			EspecificacionDelProducto unaEP = iterator.next();
			System.out.println(unaEP.getDescripcion() + " ---- $ " + unaEP.getPrecio() );
		}

	}
	
	
	/**
	 * Este metodo tiene la responsabilidad de crear una nueva instancia 
	 * de venta y retornala 
	 * */
	public Venta crearNuevaVenta() {
		Venta nuevaVenta= new Venta();
		return nuevaVenta;
	}
	
	
	public EspecificacionDelProducto introducirArticulo(int articuloID) {
		return this.catalogo.getEspectProducto(articuloID);
		
	}
	
	public void finalizarVenta(Venta unaVenta) {
		unaVenta.seHaCompletado();
	}
	
	
	public void realizarPago() {
		
		
		
	}
	

}
