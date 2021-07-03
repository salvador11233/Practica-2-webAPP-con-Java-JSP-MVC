package mx.edu.itspa.dto;

public class Libro {
	private Integer codLibro = null;
	private Integer isbn;
	private String titulo;
	private String codAutor;
	private String codEditorial;
	private Double precio;
	
	public Integer getCodLibro() {
		return codLibro;
	}
	
	public void setCodLibro(Integer codLibro) {
		this.codLibro = codLibro;
	}
	
	public Integer getIsbn() {
		return isbn;
	}
	
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getCodAutor() {
		return codAutor;
	}
	
	public void setCodAutor(String codAutor) {
		this.codAutor = codAutor;
	}
	
	public String getCodEditorial() {
		return codEditorial;
	}
	
	public void setCodEditorial(String codEditorial) {
		this.codEditorial = codEditorial;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
