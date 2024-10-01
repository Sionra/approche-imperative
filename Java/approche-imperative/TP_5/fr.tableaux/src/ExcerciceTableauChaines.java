public class ExcerciceTableauChaines {
    public static void main(String[] args) {
        String[] nomVille = new String[5];
        nomVille[0] = "Toulouse";
        nomVille[1] = "Montpellier";
        nomVille[2] = "Bordeaux";
        nomVille[3] = "Nime";
        nomVille[4] = "Nice";

        //Utilisation d'un for each, facilite l'écriture d'une boucle ou l'on doit parcourir un tableau
        for(String ville : nomVille){
            System.out.println(ville);
        }

        System.out.println(nomVille.length);

        nomVille[3] = "Reims";

        for(String ville : nomVille){
            System.out.println(ville);
        }
    }
}
