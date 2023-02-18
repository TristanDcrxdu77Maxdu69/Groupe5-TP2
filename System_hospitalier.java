package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) { //La méthode analyserRequete retourne "requête analysée". 
		//La méthode prend un objet de la classe Requête en paramètre et analyse la maladie du patient
		// Analyser la requête
		return "requête analysée";
	}
	
	private String comparerDonnes() { //la méthode comparerDonnes retourne "Cluster trouvé"
		//Compare les reuqêtes analysées pour déterminer si il y a un cluster
		// Comparaison des données
		return "Cluster trouvé";
	}

}
