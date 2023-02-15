package connexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnexion {
	
	public Connection getConnexion() {
		Connection connexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8","root", "rootroot");
            System.out.println("Connexion reussit");
        }catch (Exception exception){
            System.out.println("Connexion non reussit \n" + exception);
        }

        return connexion ;
    }
}
