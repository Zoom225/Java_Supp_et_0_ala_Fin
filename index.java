import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'introduire 10 nombres
        int[] tableau = new int[10];
        System.out.println("Veuillez entrer 10 nombres entiers : ");
        for (int i = 0; i < 10; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Afficher le tableau initial
        System.out.println("Tableau initial : ");
        afficherTableau(tableau);

        // Demander à l'utilisateur quel nombre supprimer
        System.out.println("Entrez le nombre que vous voulez supprimer : ");
        int nombreASupprimer = scanner.nextInt();

        // Vérifier si le nombre est présent dans le tableau
        int index = trouverIndex(tableau, nombreASupprimer);

        if (index != -1) {
            // Supprimer le nombre et décaler les éléments suivants
            for (int i = index; i < tableau.length - 1; i++) {
                tableau[i] = tableau[i + 1];
            }
            tableau[tableau.length - 1] = 0; // Ajouter 0 comme dernier élément

            // Afficher le tableau résultant
            System.out.println("Tableau après suppression : ");
            afficherTableau(tableau);
        } else {
            System.out.println("Le nombre n'est pas présent dans le tableau.");
        }

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour afficher un tableau
    private static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }

    // Méthode pour trouver l'index d'un nombre dans un tableau
    private static int trouverIndex(int[] tableau, int nombre) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombre) {
                return i;
            }
        }
        return -1; // Retourne -1 si le nombre n'est pas trouvé
    }
}
