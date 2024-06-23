package biblioteca;

import java.util.ArrayList; 
import java.util.List;

public class GestionLibros {
	
	 private List<Libros> libroslist;
	 
	 public GestionLibros() {
	 this.libroslist = new ArrayList<>();
	 }

	 //1) OPCION DE AGREGAR LIBROS
	public void agregarLibro(Libros libro) {
		if (libro != null) {
			// Validación de titulo
			 if (libro.getTitulo().isEmpty() || libro.getTitulo().isBlank()) {
				 System.out.println("Error al agregar el libro. El nombre no puede estar vacío");
			 return;
			 }
			 
			// Validación de autor
			 if (libro.getAutor().isEmpty() || libro.getAutor().isBlank()) {
				 System.out.println("Error al agregar el libro. El autor no puede estar vacío");
			 return;
			 }
			 
			// Validación de año
			 if (libro.getAño() <= 0) {
				 System.out.println("Error al agregar el libro.El año debe ser válido");
				
				 return;
				 }
			 
			// Validación de genero
			 if (libro.getGenero().isEmpty() || libro.getGenero().isBlank()) {
				 System.out.println("Error al agregar el libro. El género no puede estar vacío");
			 return;
			 }
			 
			 this.libroslist.add(libro);
			 System.out.println("Libro agregado correctamente!");
			 Main.generarRenglonG(); //detalle separador
			 
			 } else {
				// Validación general para evitar que haya campos vacíos
				 System.out.println("Error al agregar el libro, el libro no puede ser nulo");
			 }
			}

	
	//2) OPCION DE ELIMINAR LIBROS
	
	//para eliminar
	  public void eliminarLibro(String borrar) {
	        Libros libroEliminado = borrar(borrar);
	        if (libroEliminado != null) {
	            this.libroslist.remove(libroEliminado);
	            System.out.println("Libro eliminado correctamente.");
	        } else {
	            System.out.println("No se encontró el libro titulado: " + borrar);
	        }
	    }

	  //para buscar que libros eliminar 
	    private Libros borrar(String borrar) {
	        for (Libros libro : this.libroslist) {
	            if (libro.getTitulo().equals(borrar)) {
	                return libro;
	            }
	        }
	        return null;
	    }
	    
	//3) OPCION DE MOSTRAR LIBROS
	public void mostrarLibros() {
		if (this.libroslist.isEmpty()) {
			System.out.println("No hay libros en la lista.");
			return;
			}
			System.out.println("Lista de libros:");
			Main.generarRenglonC();
			for (Libros libros : this.libroslist) {
			System.out.println(libros);
			System.out.println("✒︎");
			}
	}

	
	//4) OPCION DE BUSCAR LIBROS
		public List<Libros> buscarLibro(String nombreLibro) {
			List<Libros> libroEncontrado = new ArrayList<>();
			for (Libros libro : this.libroslist) {
			if
			(libro.getTitulo().toLowerCase().contains(nombreLibro.toLowerCase())) {
				libroEncontrado.add(libro);
			}
			}
			if (libroEncontrado.isEmpty()) {
			System.out.println("No se encontraron libros con el nombre: " +
			nombreLibro);
			} else {
			System.out.println("Libros encontrados:");
			for (Libros libro : libroEncontrado) {
			System.out.println(libro);
			}
			}
			return libroEncontrado;
			}


	

	
	
	}

	


		
	
		
	

			 
	

			 
			 
			 
			 
			 
			
		
		
		
	


