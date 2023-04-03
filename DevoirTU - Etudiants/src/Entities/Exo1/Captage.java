package Entities.Exo1;

public class Captage
{
private  int idCaptage;
private String nom;
private int hauteur;
private int debitMax;

    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public Captage() {

    }

    public String GetDescription(){
        String description = nom +" - "+ hauteur+" mètres - "+debitMax+" litres ";
        return description;
    }

    public int getIdCaptage() {
        return idCaptage;
    }
}
