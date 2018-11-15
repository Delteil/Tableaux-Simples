/*EXERCICE 12
Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur
préalablement saisis. Le nouveau tableau sera la somme des éléments des deux tableaux de départ.
 */

package tableau;

public class Tableau12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab1 = {4,8,7,9,1,5,4,6};
		int[] tab2 = {7,6,5,2,1,3,7,4};
		int[] tabSomme = new int[8];

		for (int i = 0; i < tab1.length; i++) {

			tabSomme[i] = tab1[i] + tab2[i];

			System.out.print(tabSomme[i] + " ");
		}
	}
}
