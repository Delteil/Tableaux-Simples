/* EXERCICE 3
Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
1. Cet algorithme créer ce tableau et y inscrire les valeurs au fur et à mesure de la saisie. 
Le tableau est affiché à l'utilisateur.
2. Un deuxième tableau devra maintenant contenir les valeurs du premier tableau dans l'ordre inverse que celui de 
la saisie. Ce nouveau tableau est affiché à l'utilisateur.
*/

package tableau;

import java.util.Scanner;

public class Tableau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("entrez la taille du tableau");
		int taille = sc.nextInt();
		int tab[] = new int[taille];
		int tab2[] = new int[taille];

		for (int i = 0; i <= (taille - 1); i++) {

			System.out.println("entrez une valeur");

			tab[i] = sc.nextInt();
			tab2[(taille - 1) - i] = tab[i]; // inversion des valeurs dans tab2

		}

		for (int i = 0; i <= (taille - 1); i++) {

			System.out.println(tab[i] + " " + tab2[i]);

		}
		sc.close();
	}
}
