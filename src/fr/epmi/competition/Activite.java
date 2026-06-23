package fr.epmi.competition;

public abstract class Activite implements ICalcul {
    protected String nom;
    protected int duree; 
    protected double prixDeBase;
    protected int capacite; 
    protected int placesVendues; 

    public Activite(String nom, int duree, double prixDeBase, int capacite) {
        this.nom = nom;
        this.duree = duree;
        this.prixDeBase = prixDeBase;
        this.capacite = capacite;
        this.placesVendues = 0;
    }

    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getPrixDeBase() {
		return prixDeBase;
	}

	public void setPrixDeBase(double prixDeBase) {
		this.prixDeBase = prixDeBase;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getPlacesVendues() {
		return placesVendues;
	}

	public void setPlacesVendues(int placesVendues) {
		this.placesVendues = placesVendues;
	}

	// Fonctionnalité personelle : vendre un billet si la capacité n'est pas atteinte
    public boolean vendreBillet() {
        if (this.placesVendues < this.capacite) {
            this.placesVendues++;
            return true;
        } else {
            return false;
        }
    }

	@Override
	public String toString() {
		return "Activite [nom=" + nom + ", duree=" + duree + ", prixDeBase=" + prixDeBase + ", capacite=" + capacite
				+ ", placesVendues=" + placesVendues + "]";
	}
 
}