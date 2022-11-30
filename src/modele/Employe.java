package modele;
public class Employe
{
 private String reffEmploye;
 private String nom;
 private String prenom;
 private String sexe;
 private String adresse;
 private int cp;
 private int tel;
 
 public Employe()
 {
 }
 
 public Employe(String reffEmploye, String nom, String prenom, String sexe, String adresse, int cp, int tel)
 {
 this.reffEmploye = reffEmploye;
 this.nom = nom;
 this.prenom = prenom;
 this.sexe = sexe;
 this.adresse = adresse;
 this.cp = cp;
 this.tel = tel;
 }

    public String getReffEmploye()
    {
        return reffEmploye;
    }

    public void setReffEmploye(String reffEmploye)
    {
        this.reffEmploye = reffEmploye;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getSexe()
    {
        return sexe;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public int getCp()
    {
        return cp;
    }

    public void setCp(int cp)
    {
        this.cp = cp;
    }

    public int getTel()
    {
        return tel;
    }

    public void setTel(int tel)
    {
        this.tel = tel;
    }
 
 
}