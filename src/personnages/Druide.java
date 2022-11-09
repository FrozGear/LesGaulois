package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionsMin;
	private int effetPotionsMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionsMin, int effetPotionsMax) {
		this.nom = nom;
		this.effetPotionsMin = effetPotionsMin;
		this.effetPotionsMax = effetPotionsMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion leut aller d'une force " + effetPotionsMin + " à " + effetPotionsMax + "." );
		
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole() + "<<" + texte + ">>");
		
	}
	
	public void preparerPotion(){
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionsMax-effetPotionsMin)+effetPotionsMin;
		if(forcePotion >= 7) {
			System.out.println("« J'ai préparé une super potion de force " + forcePotion + "»");
		}
		else {
			System.out.println("« Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion + "»");
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("obelix")) {
			System.out.println("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);

		}
	}

	private String prendreparole() {
		// TODO Auto-generated method stub
		return "Le druide " + nom + " : ";
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}