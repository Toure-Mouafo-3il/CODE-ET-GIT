public class FactureManager {
	
	/**
	 * faire la reduction d'un montant suivant un pourcentage
	 */
	public double reduction(double montant, double pourcentage) {
		return montant*(1-pourcentage);
	}
	
	/**
	 * faire la reduction d'un montant suivant la categorie
	 */
	public double reductionCategorie(String typeProduit,double montant) {
		switch(typeProduit) {
			case "Alimentaire"	:	montant=reduction(montant,0.05);
									break;
			case "Electronique"	:	montant=reduction(montant,0.1);
									break;
			case "Luxe"	:			montant=reduction(montant,0.15);
									break;
			default :				return montant;
									break;
		}
		return moyenne;
	}
	
	/**
	 * faire la reduction suivant si le montant est important ou pas
	 */
	public double reductGrosMontant(double montant) {
		if(montant>1000) {
			montant=reduction(montant,0.05);//Reduction de 5%
		}
		return montant;
	}
	
	
    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        total=reductionCategorie(typeProduit);
        // Reduction sur le total
        total=reductGrosMontant(total);
        return total;
    }
}
