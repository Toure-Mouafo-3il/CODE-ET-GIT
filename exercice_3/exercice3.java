public class StockManager {
	
	/**
	 * gerer l'ajout dans le stock
	 */
	public void operationajout(String produit,int quantite,int stock) {
		stock += quantite;
		System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
	}
	
	/**
	 * gerer le retrait dans le stock
	 */
	public void operationRetrait(String quantite,int quantite,int stock) {
		if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
	}
	
	/**
	 * gerer le stock
	 */
	public void gererStock(String typeOperation,String produit,int quantite,int stock) {
		switch(typeOperation) {
		case "ajout" :	operationAjout(produit,quantite,stock);
        				break;
		case "retrait"	:	operationRetrait(produit,quantite,stock);
							break;
		default	:	System.out.println("Opération inconnue.");
					break;
		}
	}
  