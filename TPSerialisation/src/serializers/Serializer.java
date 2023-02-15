package serializers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.User;

public class Serializer {

	public void serialize(User user, String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(user);
			System.out.println(user + " sérialisé dans 'user.ser'.");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	
	public void deSerialize(String fileName) {
		try (FileInputStream fis = new FileInputStream (fileName);
				ObjectInputStream ois = new ObjectInputStream (fis)) {
					User user = (User) ois.readObject () ;
					System.out.println (user + " désérialisé avec succès ...");
					System.out.println ("Login : " + user.getLogin());
					System.out.println ("Password : " + user.getPassword());
					System.out.println ("Identifiant : " + user.getIdentifiant());
				
				} catch (IOException ioe) {

					System.out.println ("An error occured : " + ioe.getMessage());

				} catch (ClassNotFoundException e) {
					System.out.println ("User class not found : " + e.getMessage());
				}
	}

}
