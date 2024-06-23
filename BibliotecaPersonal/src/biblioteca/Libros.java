package biblioteca;

public class Libros {
	
	private int id;
	private String titulo;
	private String autor;
	private int año; 
	private String genero;
	
	public Libros(int id, String titulo, String autor, int año, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libros [ titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", genero=" + genero
				+ "]";
	}
	
	


}
