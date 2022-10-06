package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	
	public Village(String nom, Chef chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois newHabitant) {
		this.villageois[this.nbVillageois++] = newHabitant;
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return this.villageois[numeroVillageois];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void AfficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les légendaires gaulois :");
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", null, 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
		// at personnages.Village.trouverHabitant(Village.java:24)
		// at personnages.Village.main(Village.java:37)
		// Il y a un message d'erreur car le village est vide.
		
		Chef chef = new Chef("Abraracourcix", 6,  village);
		Gaulois villageois = new Gaulois("Asterix", 8);
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// Il y a une erreur car il n'y a encore personne dans le village.
		village.setChef(chef);
		village.AfficherVillageois();
		
	}
}
