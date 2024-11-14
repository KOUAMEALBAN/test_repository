import java.util.ArrayList;
import java.util.List;

import Ci.modele.Adresse;
import Ci.modele.Personne;

public class App {
    public static void main(String[] args) throws Exception {
      
     Personne p = new Personne("kouame", "alban", 19 ,1.98f, true);
     System.out.println("---------------------------------------------------------------");
     p.setNom("charles");
     System.out.println(p.getNom());
     p.afficher();
       /* p.nom = "kouame";
        p.prenom = "alban";
        p.age = 19;
        p.taille = 1.98f;
        p.hasjob = true ;
        System.out.println("bonjour"+ p.nom + " "+ p.prenom + " , vous avez " + p.age + " ans et vous mesurez " + p.taille + " , vous etes actuellement " );
*/
 
      System.out.println("---------------------------------------------------------------");
        Personne p1 = new Personne("kouakou","koffi", 25, 1.82f, true);
        System.out.println("---------------------------------------------------------------");
        p1.afficher();
        String situation = p1.getSituationprofessionnelle();
        System.out.println(situation);
      /*  p1.nom = "kouakou";
        p1.prenom = "koffi";
        p1.age = 25;
        p1.taille = 1.82f;
        p1.hasjob = true;
        System.out.println("bonjour"+ p1.nom + " "+ p1.prenom + " , vous avez " + p1.age + " ans et vous mesurez " + p1.taille + " , vous etes actuellement " );
   */
      Personne p2 = new Personne("kouaKOU", "koffi", 21 , 1.56f , true);
      p2.afficher();
      String situation2 = p2.getSituationprofessionnelle(false);
      System.out.println(situation2);
      /*p2.nom = "kouadio";
      p2.prenom = "koffi";
      p2.age = 21;
      p2.taille = 1.56f;
      p2.hasjob = true ;
      System.out.println("bonjour"+ p2.nom + " "+ p2.prenom + " , vous avez " + p2.age + " ans et vous mesurez " + p2.taille + " , vous etes actuellement " );*/
      
      Personne pers[] = new Personne[2];
      pers[0] = p2;
      pers[1] = p1;

          
      for (Personne personne : pers) {
        personne.afficher();
      }
        List<Personne> maList = new ArrayList<>();
        maList.add(p1);
        maList.add(p2);
        for (Personne personne : maList) {
        //personne.afficher();
         // System.out.println(personne.toString());
         //System.out.println(personne.equals(maList));
        }      

        boolean isEquals = p1.equals(p2);
        System.out.println(isEquals);

      Adresse adr = new Adresse("abidjan", "b15284","rue yuh");
       adr.afficher();

       p.setResidence(adr);

       p.afficher();

       List<String> maList2 = new ArrayList<>();
       maList2.add("bac");
       maList2.add("bts");
       maList2.add("master");
       maList2.add("doctorat");

       p.setDiplomes(maList2);
       p.afficher();
        
    

    }
  
        

    


}
