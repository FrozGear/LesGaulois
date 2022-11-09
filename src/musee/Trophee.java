package musee;
import personnages.Gaulois;
import personnages.Equipement;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
//---------------------Le_constructeur------------------------	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
//---------------------Les_deux_getteurs----------------------	
	public Gaulois getGaulois() {
		return gaulois;
	}
	public Equipement getEquipement() {
		return equipement;
	}

	public String donnerNom() {
		return Gaulois.getNom();
	}
	
	public donnerTrophees(gaulois) {
		
	}
}
