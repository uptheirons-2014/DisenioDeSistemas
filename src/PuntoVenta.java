import java.util.Scanner;

import modelos.EspecificacionDelProducto;
import modelos.Registro;
import modelos.Venta;

public class PuntoVenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registro registro=new Registro();
		
		
		System.out.println("\n\n------------MENU----------------");
		System.out.println("Seleccione la opcion del menú");

		System.out.println("1 - Crear Nueva Venta");
		System.out.println("2 - Otra operacion ");
		System.out.println("3 - Otra operacion 2 ");
		Scanner scanIn = new Scanner(System.in);
		String opcion = scanIn.nextLine();
		scanIn.close();           
		System.out.println("Name entered : " + opcion);
		
		if ( "1".equals(opcion)) {
			Venta nuevaVenta= registro.crearNuevaVenta();
			EspecificacionDelProducto prod=registro.introducirArticulo(4);
			int cantidad= 5;
			nuevaVenta.aniadirLineaDeVenta(prod, cantidad );
			cantidad= 2;
			prod=registro.introducirArticulo(2);
			nuevaVenta.aniadirLineaDeVenta(prod, cantidad );
			cantidad= 6;
			prod=registro.introducirArticulo(18);
			nuevaVenta.aniadirLineaDeVenta(prod, cantidad );
			cantidad= 10;
			prod=registro.introducirArticulo(14);
			nuevaVenta.aniadirLineaDeVenta(prod, cantidad );
					
			nuevaVenta.mostrarDatosVenta();
		}
		
	
		
		
		

	}

}
	