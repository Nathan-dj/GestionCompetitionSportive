package fr.epmi.competition;

public class Visiteur {
    private String nom;
    private String prenom;
    private int age;
    private String typeBillet; // "Standard", "VIP", "Etudiant"

    public Visiteur(String nom, String prenom, int age, String typeBillet) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.typeBillet = typeBillet;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTypeBillet() {
		return typeBillet;
	}

	public void setTypeBillet(String typeBillet) {
		this.typeBillet = typeBillet;
	}

	@Override
	public String toString() {
		return "Visiteur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", typeBillet=" + typeBillet + "]";
	}

}