/*EXERCICE 4
Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
Cet algorithme cree ce tableau et y inscire les valeurs au fur et à mesure de la saisie.
Il indique ensuite à l'utilisateur :
1. Si le tableau est trié par ordre croissant ou non
2. La plus petite valeur du tableau
3. La plus grande valeur du tableau
 */

package tableau;

public class Tableau4 {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE; // Integer.MIN_VALUE = représente la valeur minimal qui puisse être stockée dans
										// une variable Integer.

		int min = Integer.MAX_VALUE; // Integer.MAX_VALUE = représente la valeur maximale qui puisse être stockée
										// dans une variable Integer.

		int courant = Integer.MIN_VALUE;
		boolean croissantP = true;

		int[] tableau = { 0, 2, 4, 3, 7, 10, 15 }; // insertion des valeurs directement dans le tableau, pas de variable
													// déclarée.

		for (int i = 0; i < tableau.length; i++) // i < tableau.length = i <= 0 à taille-1 //
		{
			if (tableau[i] > max) {
				max = tableau[i];
			}

			if (tableau[i] < min) {
				min = tableau[i];
			}

			if (tableau[i] < courant) {
				croissantP = false;

			}

			courant = tableau[i];
		}

		System.out.println("max => " + max);
		System.out.println("min => " + min);
		System.out.println("croissant => " + croissantP);

		afficheTableau(tableau); // pour afficher le tableau, d�coule de la m�thode dessous //
	}

	// m�thode pour afficher tableau //

	public static void afficheTableau(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}

	}

}
