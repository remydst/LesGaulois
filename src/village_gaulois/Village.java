package village_gaulois;

import personnages.Gaulois;

public class Village {
    private String nom;
    private Gaulois chef;
    private int nbVillageois = 0;
    private Gaulois[] villageois;

  
    public Village(String nom, Gaulois chef, int nbVillageoisMax) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[nbVillageoisMax];
    }

    public String getNom() {
        return nom;
    }
    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        }
    }

    public Gaulois trouverVillageois(int numero) {
        if (numero > 0 && numero <= nbVillageois) {
            return villageois[numero - 1];
        }
        System.out.println("Il n'y a pas autant d'habitants dans notre village !");
        return null;
    }

    public void afficherVillage() {
        System.out.println("Village de " + nom + " dirigé par " + chef.getNom());
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
    public static void main(String[] args) {
    	Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des irréductibles",Abraracourcix, 30);
		Gaulois gauloisNull = village.trouverVillageois(29);
		Gaulois Asterix = new Gaulois("Astérix", 8);
	    village.ajouterVillageois(Asterix);
	    Gaulois gaulois = village.trouverVillageois(1);
	    System.out.println(gaulois);
	    gaulois = village.trouverVillageois(2);
	    System.out.println(gaulois);
	    Gaulois Obelix = new Gaulois("Obelix",25);
	    village.ajouterVillageois(Obelix);
	    village.afficherVillage();
	    Gaulois Doublepolemix = new Gaulois("Doublepolemix",4);
	    village.ajouterVillageois(Doublepolemix);
	    village.afficherVillage();
	    Abraracourcix.sePresenter();
	    Asterix.sePresenter();
	    Doublepolemix.sePresenter();
	}
 
}


