/*EXERCICE 3
•Créer une classe TestArrayTri 
•Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
•Utiliser la classe Arrays pour trier le tableau  */

package tableau;

import java.util.Arrays;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// utiliser Arrays pour trier le tableau

		Arrays.sort(array); 		/* class pour trier un tableau (ou tout autre type de variable.... Arrays.sort
									importe automatiquement la class Arrays*/
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}
}
