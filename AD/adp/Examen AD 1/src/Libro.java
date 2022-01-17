

/**
 * Clase libro
 * @author René Ribera Medrano
 *
 */
public class Libro {

	int id;
	String titol;
	String autor;
	String anyNaixement;
	String anyPublicacio;
	String editorial;
	String nombrePagines;
	
	public Libro() {
		
	}

	/**
	 * 
	 * @param titol
	 * @param autor
	 * @param anyNaixement
	 * @param anyPublicacio
	 * @param editorial
	 * @param nombrePagines
	 */
	public Libro(String titol, String autor, String anyNaixement, String anyPublicacio, String editorial, String nombrePagines) {
		
		this.titol = titol;
		this.autor = autor;
		this.anyNaixement = anyNaixement;
		this.anyPublicacio = anyPublicacio;
		this.editorial = editorial;
		this.nombrePagines = nombrePagines;

	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
		
	}

	public String getTitol() {
		
		return titol;
		
	}

	public void setTitol(String titol) {
		
		this.titol = titol;
		
	}

	public String getAutor() {
		
		return autor;
		
	}

	public void setAutor(String autor) {
		
		this.autor = autor;
		
	}

	public String getAnyNaixement() {
		
		return anyNaixement;
		
	}

	public void setAnyNaixement(String anyNaixement) {
		
		this.anyNaixement = anyNaixement;
		
	}

	public String getAnyPublicacio() {
		
		return anyPublicacio;
		
	}

	public void setAnyPublicacio(String anyPublicacio) {
		
		this.anyPublicacio = anyPublicacio;
		
	}

	public String getEditorial() {
		
		return editorial;
		
	}

	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
		
	}

	public String getNombrePagines() {
		
		return nombrePagines;
		
	}

	public void setNombrePagines(String nombrePagines) {
		
		this.nombrePagines = nombrePagines;
		
	}

	@Override
	public String toString() {
		return "Libro [ id = " + id + ", titol = " + titol + ", autor = " + autor + ", anyNaixement = " + anyNaixement
				+ ", anyPublicacio = " + anyPublicacio + ", editorial = " + editorial + ", nombrePagines = " + nombrePagines
				+ " ]";
	}
	
	public String titulos() {
		
		return "Titulo : " + titol + " Id : " + id;
		
	}

}
