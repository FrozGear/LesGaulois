package personnages;

public class Druide {
	private String nom;
	private int effetPotionsMin;
	private int effetPotionsMax;

	public Druide(String nom, int effetPotionsMin, int effetPotionsMax) {
		this.nom = nom;
		this.effetPotionsMin = effetPotionsMin;
		this.effetPotionsMax = effetPotionsMax;
		parler("Bonjour, je suis le druide ", + nom + " et ma potion leut aller d'une force " + effetPotionsMin + " à " + effetPotionsMax + "." );
		
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole() + "<<" + texte + ">>");
		
	}
	
	private String prendreparole() {
		// TODO Auto-generated method stub
		return "Le druide " + nom + " : ";
	}
}
