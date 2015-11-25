package travail;

public class Club
{
   String nom, adresse, cp, ville, nomPresident;
    public Club(String pNom,String pAdresse,String pCP,String pVille, String pNomPresident ){
        nom = pNom;
        adresse = pAdresse;
        cp = pCP;
        ville = pVille;
        nomPresident = pNomPresident;
    }
    public Club(){
        
    }
    public String getNom(){
        return nom;
    }
    public String getAdresse(){
        return adresse;
    }
    public String getCP(){
        return cp;
    }
    public String getVille(){
        return ville;
    }
    public String getNomPresident(){
        return nomPresident;
    }
    public void setNom(String pNom){
        nom = pNom;
    }
    public void setAdresse(String pAdresse){
        adresse = pAdresse;
    }
    public void setCP(String pCP){
        cp = pCP;
    }
    public void setVille(String pVille){
        ville = pVille;
    }
    public void setNomPresident(String pNomPresident){
        nomPresident = pNomPresident;
    }
    
}
