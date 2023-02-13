import entity.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Etudiant> etudiants = new ArrayList<Etudiant>();

        etudiants.add(new Etudiant("CAMARA", "Sidiki", 'M', 35, 3, "ISI"));
        etudiants.add(new Etudiant("Diallo", "Binta", 'F', 65, 33, "SSI"));


            try {

                System.out.println(etudiants.get(0).getPrenom());
                System.out.println(etudiants.get(1).getPrenom());
                System.out.println(etudiants.get(2).getPrenom());


            }catch (NullPointerException  e){
//            MANAGE ERROR HERE
                System.err.println(e.getMessage());

            }    }

}