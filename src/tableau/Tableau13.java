/*EXERCICE 13
Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule le « JOKE »
des deux tableaux. Pour calculer le « JOKE », il faut multiplier chaque élément du tableau 1 par
chaque élément du tableau 2, et additionner le tout.
 */

package tableau;

public class Tableau13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab1 = { 4, 8, 7, 12 };
		int[] tab2 = { 3, 6 };
		int resultat = 0;

		for (int i = 0; i < tab1.length; i++) {

			for (int j = 0; j < tab2.length; j++) {

				resultat = resultat + (tab1[i] * tab2[j]); 
			}
		}

		System.out.println(resultat);
	}
}
