/*EXERCICE 2
Ecrire un algorithme qui déclare un tableau de 10 notes scolaires, dont on fait ensuite saisir 
les valeurs par l'utilisateur.
La somme des nombres est affichée à l'utilisateur.
La moyenne des notes de ce tableau est aussi affichée à l'utilisateur.*/

package tableau;

import java.util.Scanner;

public class Tableau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int notes[] = new int[10];
		int sum = 0;
		int moy = 0;

		for (int i = 0; i < notes.length; i++) {

			System.out.println("entrez une note");
			notes[i] = sc.nextInt();

			sum = sum + notes[i];	//sommes des notes
			moy = sum / (i + 1);	//moyenne des notes
		}
		System.out.println("la somme des notes est " + sum);
		System.out.println("la moyenne de la classe est de " + moy);
	
		sc.close();
	}
}
