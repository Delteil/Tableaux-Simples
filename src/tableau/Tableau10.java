/*EXERCICE 10
Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir les notes d'une classe.
Le programme, une fois la saisie terminée, renvoie le nombre des notes supérieures à la moyenne de la classe.*/

package tableau;

import java.util.Scanner;

public class Tableau10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] notes = new int[10];
		int note = 0;
		int somme = 0;
		int moyenne = 0;
		int nbNoteSup = 0;

		for (int i = 0; i < notes.length; i++) {
			System.out.println("Entrez une note");
			note = sc.nextInt();
			notes[i] = note;
			somme = somme + notes[i];
			moyenne = somme / notes.length;
		}

		for (int i = 0; i < notes.length; i++) {

			if (notes[i] > moyenne) {
				nbNoteSup++;
			}
		}
		System.out.println("nombre de notes supérieurs à la moyenne : " + nbNoteSup);
		
		sc.close();
	}
}
