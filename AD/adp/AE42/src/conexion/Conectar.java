package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase conexio es la que fa que es conecte a la base de dades
 * @author René Ribera Medrano
 *
 */
public class Conectar {

	Connection conexion = null;
	final String driver = "com.mysql.jdbc.Driver";
	final String user = "conecta";
	final String password = "Qwert_12";
	final String url = "jdbc:mysql://127.0.0.1/bibliotecaae";
	public Statement s;
	public PreparedStatement ps;
	public int res;
	public ResultSet rs;

	public Conectar() {

		try {

			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);
			s = conexion.createStatement();

			System.out.println("Conexion con exito");
			System.out.println();

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Conexion fallida");
			e.printStackTrace();

		}

	}

	/**
	 * 
	 * @return
	 */
	public Connection getConexion() {
		return conexion;
	}



	public void desconectar() {

		try {

			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
