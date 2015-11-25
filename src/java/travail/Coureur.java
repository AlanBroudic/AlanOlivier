/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail;

/**
 *
 * @author alan
 */
public class Coureur 
{
    String nomClub, nom, prenom, sexe, adresse, email, CP, ville, tel;
    int anNais, ptsPrec, ptsAct;
  public Coureur(String pNomClub, String pNom, String pPrenom, String pSexe, int pAnNais, String pAdresse, String pCP, String pVille, String pTel, String pEmail, int pPtsPrec, int pPtsAct)
  {
      nomClub = pNomClub;
      nom = pNom;
      prenom = pPrenom;
      sexe = pSexe;
      anNais = pAnNais;
      adresse = pAdresse;
      CP = pCP;
      ville = pVille;
      tel = pTel;
      email = pEmail;
      ptsPrec = pPtsPrec;
      ptsAct = pPtsAct;
  }
  
  public Coureur()
  {
      
  }
  
  public String getNomClub()
  {
      return nomClub;
  }
  
  public String getNom()
  {
      return nom;
  }
  
  public String getPrenom()
  {
      return prenom;
  }
  
  public String getSexe()
  {
      return sexe;
  }
  
  public int getAnNais()
  {
      return anNais;
  }
  
  public String getAdresse()
  {
      return adresse;
  }
  
  public String getCP()
  {
      return CP;
  }
  
  public String getVille()
  {
      return ville;
  }
  
  public String getTel()
  {
      return tel;
  }
  
  public String getEmail()
  {
      return email;
  }
  
  public int getPtsPrec()
  {
      return ptsPrec;
  }
  
  public int getPtsZct()
  {
      return ptsAct;
  }
  
  public void setNom(String pNom)
  {
      nom = pNom;
  }
  
  public void setPrenom(String pPrenom)
  {
      prenom = pPrenom;
  }
  
  public void setSexe(String pSexe)
  {
      sexe = pSexe;
  }
  
  public void setAnNais(int pAnNais)
  {
      anNais = pAnNais;
  }
  
  public void setAdresse(String pAdresse)
  {
      adresse = pAdresse;
  }
  
  public void setCP(String pCP)
  {
      CP = pCP;
  }
  
  public void setVille(String pVille)
  {
      ville = pVille;
  }
  
  public void setTel(String pTel)
  {
      tel = pTel;
  }
  
  public void setEmail(String pEmail)
  {
      email = pEmail;
  }
  
  public void setPtsPrec(int pPtsPrec)
  {
      ptsPrec = pPtsPrec;
  }
  
  public void setPtsAct(int pPtsAct)
  {
      ptsAct = pPtsAct;
  }
}
