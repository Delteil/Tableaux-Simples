/*EXERCICE 8
Ecrivez un algorithme permettant à l'utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées 
dans un tableau.
L'utilisateur doit donc commencer par entrer le nombre de valeurs qu'il compte saisir. Il effectuera ensuite cette saisie.
Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs multiples de 3 
et le nombre de valeurs non multiple de 3.
*/

package tableau;

import java.util.Scanner;

public class Tableau8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int multiple = 0;
		int nonMultiple = 0;

		System.out.println("entrez la taille du tableau");
		int taille = sc.nextInt();
		int[] tableau = new int[taille];

		for (int i = 0; i < tableau.length; i++) {

			System.out.println("entrez un nombre");
			tableau[i] = sc.nextInt();

			if (tableau[i] % 3 == 0) {
				multiple++;

			} else {
				nonMultiple++;
			}
		}

		System.out.println(multiple + " valeurs multiples de 3");
		System.out.println(nonMultiple + " valeurs non multiples de 3");
		
		sc.close();
	}
}
