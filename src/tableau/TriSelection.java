package tableau;

public class TriSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 5, 1, 3, 9, 8, -1};

		for (int i = 0; i < tab.length-1; i++) {
			int min = Integer.MAX_VALUE;
			min = tab[i];
			int indiceMin = i;
			int valeurTemp = min;

			for (int j = i + 1; j < tab.length; j++) {

				if (tab[j] < min) {

					min = tab[j];
					indiceMin = j;
				}
			}

			tab[i] = min;
			tab[indiceMin] = valeurTemp;

			
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
