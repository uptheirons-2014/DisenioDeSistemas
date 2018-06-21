package modelos;

import java.util.ArrayList;
import java.util.Random;

public class CatalogoDeProducto {
	
	String descripcion;
	ArrayList<EspecificacionDelProducto> collectionProductos;
	
	public CatalogoDeProducto(){
		
		this.descripcion="Catalogo 2018";
		this.collectionProductos= new ArrayList<EspecificacionDelProducto>();
		//Aca hacemos un Dummy del catalogo con productos de ejemplo
	    for (int i = 0; i < 20; ++i) {

	    	Random r = new Random();
			
			int precio = r.nextInt(100);
			
			String descProducto= "Producto Ejemplo "+i;
			EspecificacionDelProducto nuevoProducto= new EspecificacionDelProducto(descProducto,precio,i);
	    	this.collectionProductos.add(nuevoProducto);
	    }
	}
	

}
