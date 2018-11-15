/*EXERCICE 1
•Créer une classe TestArray1 
•Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
•Afficher l’ensemble des éléments du tableau grâce à une boucle 
•Afficherl’ensemble des éléments dans l’ordre inverse du tableau 
•Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 
•Faire une boucle qui affiche uniquement les entiers pairs 
•Afficher le plus grand élément du tableau 
•Afficher le plus petit élément du tableau 
 */

package tableau;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayInverse = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			arrayInverse[(array.length - 1) - i] = array[i]; // inversion des valeurs dans arrayInverse
		}

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i] + "   " + arrayInverse[i]);
		}
		System.out.println();

		System.out.println("Entiers superieurs à 3");
		for (int i = 0; i < array.length; i++) {

			if (array[i] > 3) {

				System.out.print(array[i] + " ");
			}
		}
		System.out.println();

		System.out.println("Entiers pairs");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.print(array[i] + " ");
			}
		}
		System.out.println();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];
			}
		}
		System.out.println("valeur max " + max);

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {

				min = array[i];
			}
		}
		System.out.println("valeur min " + min);

	}

}
