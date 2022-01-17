public class Libro {
	
	private int id;
	private String titulo;
	private String autor;
	private String anyoNacimiento;
	private String anyoPublicacion;
	private String editorial;
	private String numeroPaginas;

	public Libro() {
		
		this.id = 0;
		this.titulo = "";
		this.autor = "";
		this.anyoNacimiento = "0";
		this.anyoPublicacion = "0";
		this.editorial = "";
		this.numeroPaginas = "0";
		
	}

	public Libro(String titulo, String autor, String anyoNacimiento, String anyoPublicacion, String editorial,
			String numeroPaginas) {
		
		this.id = 0;
		this.titulo = titulo;
		this.autor = autor;
		this.anyoNacimiento = anyoNacimiento;
		this.anyoPublicacion = anyoPublicacion;
		this.editorial = editorial;
		this.numeroPaginas = numeroPaginas;
		
	}

	public int getId() {
		
		return this.id;
		
	}

	public String getTitulo() {
		
		return this.titulo;
		
	}

	public String getAutor() {

		return this.autor;

	}

	public String getAnyoNacimiento() {

		return this.anyoNacimiento;

	}

	public String getAnyoPublicacion() {

		return this.anyoPublicacion;

	}

	public String getEditorial() {

		return this.editorial;

	}

	public String getNumeroPaginas() {

		return this.numeroPaginas;

	}

	public void setId(int id) {

		this.id = id;

	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;

	}

	public void setAutor(String autor) {

		this.autor = autor;

	}

	public void setAnyoNacimiento(String anyoNacimiento) {

		this.anyoNacimiento = anyoNacimiento;

	}

	public void setAnyoPublicacion(String anyoPublicacion) {

		this.anyoPublicacion = anyoPublicacion;

	}

	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
		
	}

	public void setNumeroPaginas(String numeroPaginas) {
		
		this.numeroPaginas = numeroPaginas;
		
	}

}