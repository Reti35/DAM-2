package app;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcio = 0;
		int id = 0;
		String titol;
		String autor;
		String anyPublicacio;
		String editorial;
		String nombrePagines;
		
		System.out.println("Benvingut a la biblioteca");
		
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
		
		do {
			
			System.out.println("Trie una opcio : ");
			System.out.println("1) Mostrar tots els títols de la biblioteca");
			System.out.println("2) Mostrar informació detallada d’un llibre");
			System.out.println("3) Crear nou llibre");
			System.out.println("4) Actualitzar llibre");
			System.out.println("5) Borrar llibre");
			System.out.println("6) Tanca la biblioteca");
			opcio = sc.nextInt();
			
			switch (opcio) {
			
			case 1:
				
				@SuppressWarnings("rawtypes") List listaLibros = new ArrayList<>();
				listaLibros = session.createQuery("FROM Libro").list();

				
				for (Object objeto : listaLibros) {
					Libro libro = (Libro) objeto;
					System.out.println(libro.titulos());
					
				}
				
				break;
			
			case 2:
				
				System.out.println("Introduce la id de el libro que quieres recuperar");
				id = sc.nextInt();
				
				try {
					
					Libro llibre = session.get(Libro.class, id);
					System.out.println(llibre.toString());
					
				} catch (Exception e) {
					
					System.err.println("Id incorrecto: " + id);
					
				}
				
				break;
				
			case 3:
				
				Libro llibre = new Libro();
				
				System.out.println("Introduiu el titol : ");
				titol = sc.next();
				llibre.setTitol(titol);
				
				System.out.println("Introduiu l'autor : ");
				autor = sc.next();
				llibre.setAutor(autor);
				
				System.out.println("Introduiu l'any de publicació : ");
				anyPublicacio = sc.next();
				llibre.setAnyPublicacio(anyPublicacio);
				
				System.out.println("Introduiu l'editorial : ");
				editorial = sc.next();
				llibre.setEditorial(editorial);
				
				System.out.println("Introduiu el nombre de pagines : ");
				nombrePagines = sc.next();
				llibre.setNombrePagines(nombrePagines);
				
				@SuppressWarnings("unused") Serializable id1 = session.save(llibre);
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			default:
				
				System.err.println("Valor inesperado: " + opcio);
				
			}
			
		} while (opcio != 6);
		
		sc.close();

	}

}
