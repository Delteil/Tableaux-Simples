/*EXERCICE 11
Ecrivez un algorithme qui permet la saisie d’un nombre quelconque de valeurs.
Toutes les valeurs doivent ensuite être augmentées de 1, et le tableau sera affiché à l’écran.*/

package tableau;

import java.util.Scanner;

public class Tableau11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] suite = new int[3];
		
		for (int i = 0; i <= suite.length; i++) {
			System.out.println("entrez une valeur");
			suite[i] = sc.nextInt();
			
		}
			
			for (int i = 0; i <= suite.length; i++) {
			suite[i]++;

			System.out.println(suite[i] + " ");
			
			sc.close();
		}
	}
}

