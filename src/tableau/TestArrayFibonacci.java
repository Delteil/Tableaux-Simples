/*EXERCICE 5
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
rang N est égal à la somme des nombres de rangs N-1 et N-2
• Créer une classe TestFibonacci
• Demander à l’utilisateur de choisir un rang N
• Ecrire un algorithme qui calcule et affiche le nombre de rang N
 */

package tableau;

import java.util.Scanner;

public class TestArrayFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		// plus court que l'autre méthode cf, après
		
		System.out.println("Entrez une valeur");
		int rangN = sc.nextInt();
		
		if (rangN<2) {
			rangN = 2;
		}
		
		int[] suite = new int[rangN];
		suite[0] = 0;
		suite[1] = 1;
		
		for (int i = 2; i < suite.length; i++) {
		
		suite[i] = suite[i - 1] + suite[i - 2];
		
		}
		
		for(int i = 0; i < suite.length; i++) {
			System.out.print(suite[i] + " ");
		}
		
		//une façon de faire...avec un code un peu long mais avec une seule boucle
		
	/* System.out.println("Entrez une valeur");
		int rangN = sc.nextInt();
		int[] suite = new int[rangN];

		for (int i = 0; i < suite.length; i++) {

			if (i == 0) {
				suite[i] = 0;
			} else if (i == 1) {
				suite[i] = 1;

			} else {
				suite[i] = suite[i - 1] + suite[i - 2];
			}
			
			System.out.print(suite[i] + " ");
		}*/

	}
}
