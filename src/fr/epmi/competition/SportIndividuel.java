package fr.epmi.competition;

public class SportIndividuel extends Activite {
    private String genre; 
    private boolean estRecordBattuRecemment;

    public SportIndividuel(String nom, int duree, double prixDeBase, int capacite, String genre, boolean estRecordBattuRecemment) {
        super(nom, duree, prixDeBase, capacite);
        this.genre = genre;
        this.estRecordBattuRecemment = estRecordBattuRecemment;
    }

    public String getGenre() {
		return genre;
	}
    
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public boolean isEstRecordBattuRecemment() {
		return estRecordBattuRecemment;
	}

	public void setEstRecordBattuRecemment(boolean estRecordBattuRecemment) {
		this.estRecordBattuRecemment = estRecordBattuRecemment;
	}

	@Override
    public double calculerPrix() {
        // Si le record du monde a été battu récemment, l'épreuve attire plus de monde, le prix augmentera de 20%
        if (this.estRecordBattuRecemment) {
            return this.prixDeBase * 1.2;
        }
        return this.prixDeBase;
    }

	@Override
	public String toString() {
		return "SportIndividuel [genre=" + genre + ", estRecordBattuRecemment=" + estRecordBattuRecemment + "]";
	}

}