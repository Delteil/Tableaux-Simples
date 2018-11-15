/*EXERCICE 6
 * Ecrire l'algo
 */

package tableau;

public class Tableau6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nombre = new int[7];
		nombre[0] = 1;

		for (int k = 1; k <= 5; k++) {
			nombre[k] = nombre[k - 1] + 2;
		}

		for (int i = 0; i <= 6; i++) {

			System.out.print(nombre[i] + " ");
		}
	}
}
