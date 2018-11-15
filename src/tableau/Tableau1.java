/*EXERCICE 1
 * Ecrire un algorithme qui déclare un tableau de 10 éléments, le remplir du chiffre 0 au 
 * chiffre 9 et affiche ensuite à l'utilisateur toutes les valeurs de ce tableau.
 */

package tableau;

public class Tableau1 {

	public static void main(String[] args) {
		
		int tab[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			tab[i] = i;

			System.out.println(tab[i] + " ");
		}
	}
}
