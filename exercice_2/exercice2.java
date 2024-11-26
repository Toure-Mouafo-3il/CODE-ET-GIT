public class GestionnaireNotes {

	/**
	 * afficher les notes
	 * @param notes est l'ensemble des notes qu'on veut afficher
	 */
	public void afficherNotes(int[] notes) {
		for (int note : notes) {
            System.out.println("- " + note);
        }
	}
	/**
	 * calculer la moyenne des notes
	 * @param notes est le tableau des notes dont on veut la moyenne
	 */
	public double moyenneNotes(int[] notes) {
		int somme=0;
		for (int note : notes) {
            somme += note;
        }
		return (double) somme/notes.length;
	}
	/**
	 * afficher la moyenne des notes
	 * @param notes est le tableau des notes dont la moyenne sera affichee
	 */
	public void afficherMoyenne(int[] notes) {
		System.out.printf("Moyenne : " + moyenneNotes(notes));
	}
    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        afficherNotes(notes);
        //Affichage de la moyenne
        afficherMoyenne(notes);
   
      
    }
}
 