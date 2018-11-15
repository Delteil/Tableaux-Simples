package tableau;

public class TriBulle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 2, 5, 1, 8, 0, -1, 6 };
		boolean permuteP = true;
		int valeurTemp;

		while (permuteP == true) {

			permuteP = false;

			for (int i = 0; i < tab.length - 1; i++) {

				if (tab[i] > tab[i + 1]) {

					valeurTemp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = valeurTemp;
					permuteP = true;
				}
			}
		}

		afficheTableau(tab);

	}

	public static void afficheTableau(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");

		}

		System.out.println();
	}
}
