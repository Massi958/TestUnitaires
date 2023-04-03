package Entities.Exo1;

public class Forage extends Captage
{
public int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debitMax, int diametre) {
        super(idCaptage, nom, hauteur, debitMax);
        this.diametre = diametre;
    }
    public Double GetVolume(int diametre,int hauteur){
        double volume =Math.PI*diametre*hauteur;
        return volume;
    }
    public String GetDescription(String nom,int hauteur,int debitMax,int diametre){
        String description = nom +" - "+ hauteur+" mètres - "+debitMax+" litres - diametre "+diametre;
        return description;
    }
}
