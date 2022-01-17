package clases;

/**
 * Clase libro
 * @author René Ribera Medrano
 *
 */
public class Libro {

	int id;
	String titol;
	String autor;
	int anyNaixement;
	int anyPublicacio;
	String editorial;
	int nombrePagines;
	
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
	public Libro(int id, String titol, String autor, int anyNaixement, int anyPublicacio, String editorial, int nombrePagines) {

		this.id = id;
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

	public int getAnyNaixement() {
		
		return anyNaixement;
		
	}

	public void setAnyNaixement(int anyNaixement) {
		
		this.anyNaixement = anyNaixement;
		
	}

	public int getAnyPublicacio() {
		
		return anyPublicacio;
		
	}

	public void setAnyPublicacio(int anyPublicacio) {
		
		this.anyPublicacio = anyPublicacio;
		
	}

	public String getEditorial() {
		
		return editorial;
		
	}

	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
		
	}

	public int getNombrePagines() {
		
		return nombrePagines;
		
	}

	public void setNombrePagines(int nombrePagines) {
		
		this.nombrePagines = nombrePagines;
		
	}
	
	

}
