package main;

import java.util.Scanner;

import dominio.Agua;
import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.Gaseosa;
import dominio.TipoAlcohol;
import dominio.TipoGaseosa;

public class MostradorAlmacen {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Almacen nuevoAlmacen = new Almacen();
		BebidaAlcoholica nuevaBebida = null;
		Gaseosa nuevaGaseosa = null;
		Agua nuevaAgua = null;
		int opcion = 0;

		// FALTA COMPLETAR ALGUNOS TEST , TERMINAR LA INTERFAZ, REE VER LAS PROMOCIONES,
		// METODOS Y VER EL TEMA ENUMS

		do {

			System.out.println("INGRESE 1 PARA GUARDAR UNA GASEOSA");
			System.out.println("INGRESE 2 PARA GUARDAR UNA BEBIDA CON ALCOHOL");
			System.out.println("INGRESE 3 PARA GUARDAR AGUA");
			System.out.println("INGRESE 4 PARA VER LO QUE ESTA TOMANDO");
			System.out.println("INGRESE 5 PARA VER LA LISTA DE PRECIOS");
			System.out.println("INGRESE 6 PARA ELIMINAR UNA BEBIDA ");
			//AGREGAR OPCION BUSCAR BEBIDA 
			

			opcion = teclado.nextInt();

			// AGREGAR LAS VARIABLES NECESaRIAS
			// AGREGAR LAS VARIABLES NECESaRIAS
			// AGREGAR LAS VARIABLES NECESaRIAS
			// AGREGAR LAS VARIABLES NECESaRIAS
			String marca;
			Double cantidad;
			Double precio;
			Integer id;
			Double porcentajeAzucar;
			TipoAlcohol tipoAlcohol; 
			TipoGaseosa tipoGaseosa; 

			switch (opcion) {
			case 1:
				System.out.println("BEBIDA SIN ALCOHOL");
				
				//AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				
				System.out.println("INGRESE SU CANDIDA DE ML");
				cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				precio = teclado.nextDouble();

				System.out.println("INGRESE SU MARCA");
				marca = teclado.next();

				// completar para que se recorra solo
				// MOSTRAR ID DE LA BEBIDAS


				// ree ver la promocion , deberia dar solo el precio de la promo
				
				
				do {
				
				System.out.println("INGRESE EL TIPO DE GASEOSA ");
				char opcionGaseosa = teclado.next().charAt(0);
				switch (opcionGaseosa) {
				case 1:
					tipoGaseosa = TipoGaseosa.BEBIDA_COLA;
					break;
				case 2:
					tipoGaseosa = TipoGaseosa.BEBIDA_LIMA;
					break;
				case 3:
					tipoGaseosa = TipoGaseosa.BEBIDA_NARANJA;
					break;
				case 0:
					System.out.println("FIN");
					break;
				default:
					break;
				} while (opcion != 0);

				nuevaGaseosa = new Gaseosa(cantidad, precio, marca, tipoGaseosa);  

				if (nuevoAlmacen.agregarProductoSinAlcohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GURADAR");
				}
				break; 

			case 2:
				System.out.println("BEBIDA CON ALCOHOL");

				System.out.println("INGRESE SU CANDIDA DE ML");
				cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				precio = teclado.nextDouble();

				System.out.println("INGRESE SU MARCA");
				marca = teclado.next();
				
				System.out.println("INGRESE SU EDAD");
				Integer edad = teclado.nextInt(); 

				if (nuevoAlmacen.siEsMayor(edad)) {
					System.out.println("USTED PUEDE CONSUMIR BEBIDAS ALCOHOLICAS");
				} else {
					System.out.println("USTED NO TIENE NO TIENE LA EDAD NECESARIA PARA BEBER");
				}

				do {
					
					System.out.println("INGRESE EL TIPO DE BEBIDA ALCOHOLICA");

					char opcionAlcohol = teclado.next().charAt(0);
					switch (opcionAlcohol) {
					case 1:
						tipoAlcohol = TipoAlcohol.CERVEZA;
						break;
					case 2:
						tipoAlcohol = TipoAlcohol.FERNET;
						break;
					case 3:
						tipoAlcohol = TipoAlcohol.GANCIA;
						break;
					case 4:
						tipoAlcohol = TipoAlcohol.VODKA;
						break;
					case 0:
						System.out.println("FIN");
						break;
					default:
						break;
					}
				}while (opcion != 0);
				nuevaBebida = new BebidaAlcoholica(cantidad, precio, marca, tipoAlcohol);
				if (nuevoAlmacen.agregarProductoConAlchohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GUARDAR");
				}
                       
				break;
			case 3:
				System.out.println("AGREGAR AGUA");
				// Double cantidad, Double precio, String marca, Integer id
				
				//AGREGAR ENUM DE ML DE AGUA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE AGUA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE AGUA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE AGUA 500ML, 1L, 2L
				//AGREGAR ENUM DE ML DE AGUA 500ML, 1L, 2L

				System.out.println("INGRESE LA CANTIDAD DE ML DE LA BOTELLA");
				cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				precio = teclado.nextDouble();
				System.out.println("INGRESAR LA MARCA");
				marca = teclado.next();


				nuevaAgua = new Agua(cantidad, precio, marca, id);
                if(nuevoAlmacen.agregarProductoSinAlcohol(nuevaAgua)) {
				    System.out.println("AGUA GUARDADA");	
				} else {
					System.out.println("NO SE PUDO GUARDAR");
				}
			
				break;

			case 4:
				
				//AGREGAR UN COMPORTAMIENTO DISTINTO
				//AGREGAR UN COMPORTAMIENTO DISTINTO
				//AGREGAR UN COMPORTAMIENTO DISTINTO
				//AGREGAR UN COMPORTAMIENTO DISTINTO
				//AGREGAR UN COMPORTAMIENTO DISTINTO

				//System.out.println("USTED ESTA BEBIENDO UN " + nuevoAlmacen.mostrarBebida());  

				break;

			case 5:
				System.out.println("INGRESE UNA MARCA PARA SABER SU PRECIO ");
				String marcaABuscar = teclado.next();

				nuevoAlmacen.calcularPrecioDeLaBebida(marcaABuscar);
				break;
				//METODO INCOMPLETO !HAY QUE TERMINARLO!
				//METODO INCOMPLETO !HAY QUE TERMINARLO!
				//METODO INCOMPLETO !HAY QUE TERMINARLO!
				//METODO INCOMPLETO !HAY QUE TERMINARLO!
			case 6:
				System.out.println("INGRESE EL ID DE LA BEBIDA A ELEMINAR");
				Integer bebidaAEliminar = teclado.nextInt();

				if (nuevoAlmacen.eliminarBebida(bebidaAEliminar)) {
					System.out.println("BEBIDA ELIMINADA");
				} else {
					System.out.println("NO SE PUDO ELIMINAR LA BEBIDA");
				} 

				break;

				//AGREGAR CASE 7 BUSCARBEBIDA POR ID
				//AGREGAR CASE 7 BUSCARBEBIDA POR ID
				//AGREGAR CASE 7 BUSCARBEBIDA POR ID
			default:
				System.out.println("OPCION INVALIDA");
				break;
			}
		} while (opcion != 9);
	}


