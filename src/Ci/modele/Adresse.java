package Ci.modele;

public class Adresse {
 private String vile;
 private String codepostal;
 private String rue;

 public Adresse(String vile, String codepostal, String rue) {
    this.vile = vile;
    this.codepostal = codepostal;
    this.rue = rue;
}
public void afficher(){
System.out.println("bonjour" + this.vile + " "+ this.codepostal + " , vous avez " + this.rue +" "); 
}
public String getVile() {
    return vile;
}

public void setVile(String vile) {
    this.vile = vile;
}

public String getCodepostal() {
    return codepostal;
}

public void setCodepostal(String codepostal) {
    this.codepostal = codepostal;
}

public String getRue() {
    return rue;
}

public void setRue(String rue) {
    this.rue = rue;
}
 
}
