
/**
 * 
 * @author René Ribera Medrano Activitat AE03_T1_3_XML
 *
 */

// Clase llibre
public class Llibre {

	// Atributs
	private int identificador;
	private String titol;
	private String autor;
	private int anyPublicacio;
	private String editorial;
	private int nombrePagines;

	// Constructors
	public Llibre() {

	}

	/**
	 * @param identificador
	 * @param titol
	 * @param autor
	 * @param anyPublicacio
	 * @param editorial
	 * @param nombrePagines
	 */
	public Llibre(int identificador, String titol, String autor, int anyPublicacio, String editorial,
			int nombrePagines) {
		
		this.identificador = identificador;
		this.titol = titol;
		this.autor = autor;
		this.anyPublicacio = anyPublicacio;
		this.editorial = editorial;
		this.nombrePagines = nombrePagines;

	}

	// Getters y setters
	public int getIdentificador() {
		
		return identificador;
		
	}

	public void setIdentificador(int identificador) {
		
		this.identificador = identificador;
		
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
