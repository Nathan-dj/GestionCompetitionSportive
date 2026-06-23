package fr.epmi.competition;

import java.util.ArrayList;

public class MainCompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GESTIONNAIRE DE COMPETITION OMNISPORTS\n");

        ArrayList<Activite> listeEpreuves = new ArrayList<>();
        ArrayList<Visiteur> listeVisiteurs = new ArrayList<>();

        listeEpreuves.add(new SportCollectif("Basket-ball Hommes", 120, 40.0, 15000, "France", "USA", "Finale"));
        listeEpreuves.add(new SportCollectif("Football Femmes", 90, 30.0, 20000, "Espagne", "Angleterre", "Poule"));
        listeEpreuves.add(new SportIndividuel("100m Athlétisme", 15, 50.0, 80000, "Hommes", true));
        listeEpreuves.add(new SportIndividuel("Natation 200m", 30, 25.0, 5000, "Femmes", false));
        
        // Activité avec une petite capacité pour tester notre fonctionnalité personnelle
        listeEpreuves.add(new SportIndividuel("Escrime Fleuret", 45, 20.0, 2, "Hommes", false)); 

        listeVisiteurs.add(new Visiteur("DUPONT", "Jean", 25, "Standard"));
        listeVisiteurs.add(new Visiteur("MARTIN", "Sophie", 19, "Etudiant"));
        listeVisiteurs.add(new Visiteur("BERNARD", "Luc", 45, "VIP"));
        listeVisiteurs.add(new Visiteur("PETIT", "Alice", 30, "Standard"));
        listeVisiteurs.add(new Visiteur("ROUX", "Kevin", 16, "Etudiant"));

        // Affichage avec une boucle for each
        System.out.println("LISTE DES VISITEURS");
        for (Visiteur v : listeVisiteurs) {
            System.out.println("- " + v.getNom() + " " + v.getPrenom() + " (Billet: " + v.getTypeBillet() + ")");
        }

        // Recherche par nom d'activité
        System.out.println("\nRECHERCHE D'UNE EPREUVE");
        String rechercheEpreuve = "100m Athlétisme";
        System.out.println("Recherche de l'épreuve : " + rechercheEpreuve);
        
        for (Activite a : listeEpreuves) {
            if (a.getNom().equalsIgnoreCase(rechercheEpreuve)) {
                System.out.println("-> Épreuve trouvée ! Prix du billet : " + a.calculerPrix() + "€");
            }
        }

        // Fonctionnalité personnelle : Simulation de Billetterie et de Capacité
        System.out.println("\nFONCTIONNALITE PERSONNELLE : BILLETTERIE");
        Activite escrime = listeEpreuves.get(4); // L'escrime a une capacité de 2 places
        System.out.println("Vente de billets pour : " + escrime.getNom() + " (Capacité : " + escrime.getCapacite() + " places)");
        
        // Tentative de vente de 3 billets pour un stade de 2 places
        for(int i = 1; i <= 4; i++) {
            boolean achatReussi = escrime.vendreBillet();
            if(achatReussi) {
                System.out.println("Achat n°" + i + " : Succès ! Billet vendu " + escrime.calculerPrix() + "€.");
            } else {
                System.out.println("Achat n°" + i + " : ECHEC ! L'événement est COMPLET.");
            }
        }
        
	}

}
