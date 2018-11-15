/* EXERCICE 9
Ecrivez un algorithme permettant, toujours sur le même principe, à l'utilisateur de saisir un nombre déterminé de valeurs.
Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant quelle position elle occupe dans le tableau.
On prendra soin d'effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur du tableau dans un second temps*/

package tableau;

import java.util.Scanner;

public class Tableau9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int position = 0;

		System.out.println("entrez la taille du tableau");
		int taille = sc.nextInt();
		int[] tableau = new int[taille];

		for (int i = 0; i < tableau.length; i++) {
			System.out.println("entrez un nombre");
			tableau[i] = sc.nextInt();

			if (tableau[i] > max) {
				max = tableau[i];
				position = i;
			}
		}

		System.out.println("la valeur maximale est " + max + " et sa position est " + position);

		sc.close();
	}
}
