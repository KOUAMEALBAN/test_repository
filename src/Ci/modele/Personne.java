package Ci.modele;

import java.util.List;

public class Personne {
     String nom;
     String prenom;
     int age ;
     float taille;
     boolean hasjob ; 
     Adresse residence ;
     List<String> diplomes;
    /*  final int id = 10;
     static String unid = "test" */

     public Personne(){
        System.out.println("constructeur sans parametre Personne");
     }
     public Personne(String n , String p){
        this(n, p, 44, 1.82f, true);

        System.out.println("constructeur personne avec 2 parametres");
     }
    
    public Personne(String nom, String prenom, int age, float taille, boolean hasjob) {
        System.out.println("constructeur personne avec 5 parametres");
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.hasjob = hasjob;
    }

    public void afficher() {
        System.out.println("bonjour"+ this.nom + " "+ this.prenom + " , vous avez " + this.age + " ans et vous mesurez " + this.taille + " , diplomes : " + this.diplomes); 
        if (this.residence != null) {
            this.residence.afficher();
        }
        
    }
    public String getSituationprofessionnelle() {
        String situation = this.hasjob ? "en emploi": "en chomage" ;
        return situation;
       }
       public String getSituationprofessionnelle( boolean hasjob) {
        String situation = hasjob ? "en emploi": "en chomage" ;
        return situation;
       }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public boolean isHasjob() {
        return hasjob;
    }

    public void setHasjob(boolean hasjob) {
        this.hasjob = hasjob;
    }
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille + ", hasjob="
                + hasjob + ", getSituationprofessionnelle()=" + getSituationprofessionnelle() + ", getNom()=" + getNom()
                + ", getClass()=" + getClass() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge()
                + ", getTaille()=" + getTaille() + ", isHasjob()=" + isHasjob() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personne other = (Personne) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equalsIgnoreCase(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equalsIgnoreCase(other.prenom))
            return false;
        return true;

    }
    public Adresse getResidence() {
        return residence;
    }
    public void setResidence(Adresse residence) {
        this.residence = residence;
    }
    public List<String> getDiplomes() {
        return diplomes;
    }
    public void setDiplomes(List<String> diplomes) {
        this.diplomes = diplomes;
    }
   
   
    
    
}