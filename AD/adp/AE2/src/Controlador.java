import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private String textoBuscar, textoReemplazar;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		control();
	}

	
	public void control() {

		modelo.ficheroEscritura();
		modelo.ficheroLectura();
		vista.getTextAreaOriginal().setText(modelo.contenidoFichero());

		vista.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textoBuscar = vista.getTextFieldBuscar().getText();
				vista.getPopUp(modelo.buscarTexto(textoBuscar));

			}
		});

		vista.getBtnReemplazar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textoReemplazar = vista.getTextFieldReemplazar().getText();
				
				vista.getTextAreaModificado().setText(""+reemplazarTexto(modelo.contenidoFichero(), textoReemplazar));

			}
		});

	}


	public String reemplazarTexto(String textoBuscar, String textoReemplazar) {

		String palabraBuscar = vista.getTextFieldBuscar().getText();

		textoBuscar = textoBuscar.replace(palabraBuscar, textoReemplazar);

		modelo.guardarTextoEscritura(textoBuscar);
		
		return textoBuscar;

	}

}
