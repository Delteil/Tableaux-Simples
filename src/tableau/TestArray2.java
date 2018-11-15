/*EXERCICE 2
Créer une classe TestArray2 
•Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; 
•Quelle est la moyenne des éléments du tableau ? 
•Quel est l’index dans le tableau de l’entier 15 ? 
•Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau */

package tableau;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int somme = 0;
		int moyenne = 0;

		// moyenne des valeurs du tableau

		for (int i = 0; i < array.length; i++) {

			somme = somme + array[i];
			moyenne = somme / array.length;
		}
		System.out.println("la moyenne des valeurs du tableau est " + moyenne);

		// afficher l'index associé à la valeur 15

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 15) {

				System.out.println("l'index de la valeur 15 est " + i);
			}
		}

		// Nombre de doublons dans le tableau

		int nbDoublon = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) { // deuxième index pour parcourir le tableau, et ainsi éviter le
															// out of bounds

				if (array[i] == array[j]) {

					nbDoublon++; // compteur : ajoute un 1 à chaque fois que la condition est remplie
				}
			}
		}
		System.out.println("le nombre de doublon est " + nbDoublon);
	}
}