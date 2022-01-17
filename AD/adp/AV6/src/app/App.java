package app;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MongoCursor<Document> cursor;
		try (MongoClient mongoClient = new MongoClient("localhost", 27017)) {
			MongoDatabase database = mongoClient.getDatabase("bibliotecaae");
			MongoCollection<Document> coleccion = database.getCollection("libros");
			int opcio;

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

					cursor = coleccion.find().iterator();
					while (cursor.hasNext()) {

						JSONObject obj = new JSONObject(cursor.next().toJson());
						System.out.println("ID : " + obj.getString("Id") + " Titol : " + obj.getString("Titol"));

					}
					System.out.println();

					break;

				case 2:

					System.out.println("Introduce la id de el libro del cual quieres ver detalles");
					String id = sc.next();

					Bson query = eq("Id", id);
					cursor = coleccion.find(query).iterator();

					JSONObject obj = new JSONObject(cursor.next().toJson());
					System.out.println("ID : " + obj.getString("Id"));
					System.out.println("Titol : " + obj.getString("Titol"));
					System.out.println("Autor : " + obj.getString("Autor"));
					System.out.println("Any naixement : " + obj.getString("Any naixement"));
					System.out.println("Any publicacio : " + obj.getString("Any publicacio"));
					System.out.println("Editorial : " + obj.getString("Editorial"));
					System.out.println("Nombre de pagines : " + obj.getString("Nombre de pagines"));
					System.out.println();

					break;

				case 3:

					Document doc = new Document();

					System.out.println("Introduce la id : ");
					id = sc.next();

					System.out.println("Introduce el titulo : ");
					String titulo = sc.next();

					System.out.println("Introduce el autor : ");
					String autor = sc.next();

					System.out.println("Introduce el año de nacimiento : ");
					String anyNaixement = sc.next();

					System.out.println("Introduce el año de publicacion : ");
					String anyPublicacio = sc.next();

					System.out.println("Introduce la editorial : ");
					String editorial = sc.next();

					System.out.println("Introduce el numero de paginas : ");
					String nombrePagines = sc.next();

					doc.append("Id", id);
					doc.append("Titol", titulo);
					doc.append("Autor", autor);
					doc.append("Any naixement", anyNaixement);
					doc.append("Any publicacio", anyPublicacio);
					doc.append("Editorial", editorial);
					doc.append("Nombre de pagines", nombrePagines);

					coleccion.insertOne(doc);
					
					System.err.println("Libro añadido");
					System.out.println();

					break;

				case 4:

					System.out.println("Introduce la id de el libro a modificar : ");
					id = sc.next();

					System.out.println("Introduce el titulo : ");
					titulo = sc.next();

					System.out.println("Introduce el autor : ");
					autor = sc.next();

					System.out.println("Introduce el año de nacimiento : ");
					anyNaixement = sc.next();

					System.out.println("Introduce el año de publicacion : ");
					anyPublicacio = sc.next();

					System.out.println("Introduce la editorial : ");
					editorial = sc.next();

					System.out.println("Introduce el numero de paginas : ");
					nombrePagines = sc.next();

					coleccion.updateOne(eq("Id", id),
							new Document("$set", new Document().append("Titol", titulo).append("Autor", autor)
									.append("Any naixement", anyNaixement).append("Any publicacio", anyPublicacio)
									.append("Editorial", editorial).append("Nombre de pagines", nombrePagines)));
					System.err.println("Libro actualizado");
					System.out.println();

					break;

				case 5:

					System.out.println("Introduce la id de el libro a eliminar : ");
					id = sc.next();

					coleccion.deleteOne(eq("Id", id));
					
					System.err.println("Libro eliminado");
					System.out.println();

					break;

				case 6:

					System.err.println("Gracias po usar la aplicacion");
					break;

				default:

					System.err.println("Opcion incorrecta : " + opcio);

				}

			} while (opcio != 6);
		} catch (JSONException e) {

			System.err.println("ERROR");
			e.printStackTrace();
		}
		sc.close();

	}

}
