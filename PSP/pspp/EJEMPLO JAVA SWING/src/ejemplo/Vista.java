package ejemplo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Vista {

	private JButton btnTexto1;
	private JButton btnTexto2;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Vista window = new Vista();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnTexto1 = new JButton("Boton texto 1");
		btnTexto1.setBounds(137, 50, 140, 46);
		frame.getContentPane().add(btnTexto1);

		btnTexto2 = new JButton("Boton texto 2");
		btnTexto2.setBounds(137, 163, 140, 46);
		frame.getContentPane().add(btnTexto2);
		
		frame.setVisible(true);
		
	}

	public JButton getbtnTexto1() {
		return btnTexto1;
	}

	public JButton getbtnTexto2() {
		return btnTexto2;
	}

	public void mostrarMensaje(String mensaje) {

		JOptionPane.showMessageDialog(new JFrame(), mensaje, "INFO", JOptionPane.INFORMATION_MESSAGE);

	}

}
