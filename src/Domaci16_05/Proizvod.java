package Domaci16_05;

public class Proizvod {

    public String naziv;
    public int cena;
    public String rokTrajanja;

    public Proizvod(String naziv, int cena, String rokTrajanja){
        this.naziv=naziv;
        this.cena=cena;
        this.rokTrajanja=rokTrajanja;

    }
    public void stampanje(){
        System.out.println("Proizvod "  + this.naziv + " " + "kosta " + this.cena + " " + "i traje do "
                + this.rokTrajanja) ;
    }

}
