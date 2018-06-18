package modelos;

import java.util.ArrayList;
import java.util.Random;

public class CatalogoDeProducto {
	
	String descripcion;
	ArrayList<EspecificacionDelProducto> collectionProductos;
	
	CatalogoDeProducto(){
		
		this.descripcion="Catalogo 2018";

		//Aca hacemos un Dummy del catalogo con productos de ejemplo
	    for (int i = 0; i < 20; ++i) {

	    	Random rand = null;
			int precio = rand.nextInt();
			String descProducto= "Producto Ejemplo "+i;
			EspecificacionDelProducto nuevoProducto= new EspecificacionDelProducto(descProducto,precio,i);
	    	this.collectionProductos.add(nuevoProducto);
	    }
	}
	

}
