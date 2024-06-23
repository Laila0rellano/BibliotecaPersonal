package biblioteca;

import java.util.InputMismatchException; //importado para validar entradas
import java.util.Scanner; //importar scanner

public class Main {
	static Scanner scanner = new Scanner(System.in); //objeto scanner
	public static void main(String[] args) {
		GestionLibros gestionLibros = new GestionLibros(); //nuevo objeto para GestionLibros
		String opcion; //selección de opciones
		do { 
			System.out.println("----📖 MENÚ DE OPCIONES 📖----"); 
			System.out.println("1- Agrega un nuevo libro");
			System.out.println("2- Eliminar libro por título");
			System.out.println("3- Ver lista completa");
			System.out.println("4- Buscar por título");
			System.out.println("5- Salir de la app");
			System.out.println("Seleccione una opción:"); 
			opcion= scanner.nextLine();
			switch (opcion) { 
			//opcion para agregar los libros con sus respectivas entradas
			case "1": 
				generarRenglonG();
				System.out.print("Ingrese el ID del libro: ");
				int id = obtenerInt(); scanner.nextLine(); //validadas para evitar letras
				generarRenglonC();//detalle de divisipn
				
				System.out.print("Ingrese el título del libro: ");
				String titulo = scanner.nextLine();
				generarRenglonC(); //detalle de divisipn
			
				System.out.print("Ingrese el autor: ");
				String autor = scanner.nextLine();
				generarRenglonC(); //detalle de divisipn
				
				System.out.print("Ingrese el género del libro: ");
				String genero = scanner.nextLine();
				generarRenglonC();//detalle de divisipn
			
				System.out.print("Ingrese el año de publicación: ");
				int año = obtenerInt(); scanner.nextLine(); //validadas para evitar letras
				generarRenglonC(); //detalle de divisipn
				
				Libros nuevoLibro = new Libros(id, titulo, autor, año, genero);
				gestionLibros.agregarLibro(nuevoLibro);
				break;
				
			case "2": //opcion para borrar los libros
				System.out.print("Ingrese el título del libro a eliminar: ");
				String borrar= scanner.nextLine();
				generarRenglonC(); //detalle de divisipn
				gestionLibros.eliminarLibro(borrar);
				break;


	
			case "3": //muestra todos los libros en una lista + funciones asociadas en la gestion
				gestionLibros.mostrarLibros();
				break;
				
			case "4": //busqueda + funciones asociadas en la gestión
				System.out.print("-Ingrese el nombre del libro a buscar:");
				String nombreLibro = scanner.nextLine();
				gestionLibros.buscarLibro(nombreLibro);
				generarRenglonC(); //detalle de división
				break;
			
				
			case "5": //cierra el programa
				System.out.print("Saliendo...📖");
				break;
				
			default: //por si la entrada es inválida
				System.out.println("Opción no válida. Intente nuevamente.");
				generarRenglonG(); //detalle de division
				}
			
			
				
		} while (!opcion.equals("5")); //validación de entradas
		scanner.close();
		

		
	}
 
	//funcion de separador publica paa usarla en todo el programa
	public static void generarRenglonG() {
		System.out.println("-----------------------------📖");
		System.out.println();
		
	}
	
	//funcion de separador publica paa usarla en todo el programa
	public static void generarRenglonC() {
		System.out.println("▶");
		
	}
	
	//validacion de entradas numericas/enteros
	private static int obtenerInt() {
		int i = 0;
		while (i == 0) {
		try {
		int nro = scanner.nextInt();
		i = nro;
		} catch (InputMismatchException e) {
		System.out.println("Solo puede ingresar un valor numérico");
		scanner.next();
		System.out.print("Por favor ingrese un valor numérico: ");
		}
		}
		return i;
	}


}


