package Entities.Exo1;

public class Cuve extends Captage
{
private int largeur;
private int longueur;

    public Cuve(int idCaptage, String nom, int hauteur, int debitMax, int largeur, int longueur) {
        super(idCaptage, nom, hauteur, debitMax);
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public Double GetVolumeCuve(int longueur,int largeur){
        double volume =largeur*longueur;
        return volume;
    }
    public String GetDescription(String nom,int hauteur,int debitMax,int largeur,int longueur){
        String description = nom +" - "+ hauteur+" mètres - "+debitMax+" litres - longueur"+longueur+" - largeur"+largeur;
        return description;
    }
}
