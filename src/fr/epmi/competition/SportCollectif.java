package fr.epmi.competition;

public class SportCollectif extends Activite {
    private String equipe1;
    private String equipe2;
    private String niveauTournoi; // Ex: "Poule", "Demi-Finale", "Finale"

    public SportCollectif(String nom, int duree, double prixDeBase, int capacite, String equipe1, String equipe2, String niveauTournoi) {
        super(nom, duree, prixDeBase, capacite);
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.niveauTournoi = niveauTournoi;
    }

    public String getEquipe1() {
		return equipe1;
	}
    
	public void setEquipe1(String equipe1) {
		this.equipe1 = equipe1;
	}

	public String getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}

	public String getNiveauTournoi() {
		return niveauTournoi;
	}

	public void setNiveauTournoi(String niveauTournoi) {
		this.niveauTournoi = niveauTournoi;
	}

	// Redéfinition de la méthode de l'interface ICalcul
    @Override
    public double calculerPrix() {
        // Une finale de sport collectif est très demandée, le prix augmente de 50%
        if (this.niveauTournoi.equalsIgnoreCase("Finale")) {
            return this.prixDeBase * 1.5; 
        }
        return this.prixDeBase;
    }

	@Override
	public String toString() {
		return "SportCollectif [equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", niveauTournoi=" + niveauTournoi + "]";
	}
	
}