/*EXERCICE 4
Faire un programme avec le menu suivant :
1. Ajouter un nombre
2. Afficher les nombres existants.
Description :
Demander à l’utilisateur de choisir une option dans le menu.
Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.
Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
 * 
 */

package tableau;

import java.util.Scanner;

public class TestArrayOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] tab = new int[0];
		int option = 0;
		int nombre = 0;

		while (option != 2) {

			System.out.println("Veuillez choisir option 1 ou option 2");
			option = sc.nextInt();

			if (option == 1) {

				System.out.println("Entrez un nombre");
				nombre = sc.nextInt();

				int[] tabTemp = new int[tab.length + 1];

				for (int i = 0; i < tab.length; i++) { 	// création d'un teableau temporaire
					tabTemp[i] = tab[i];
				}

				tab = new int[tabTemp.length];

				for (int i = 0; i < tab.length; i++) {
					tab[i] = tabTemp[i];
				}

				tab[tab.length - 1] = nombre;
			}

			if (option == 2) {

				for (int i = 0; i < tab.length; i++) {

					System.out.print(tab[i] + " ");
				}
			}
		}
		sc.close();
	}
}
