public class DeclarationOperateur {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Check des conditions
        // Check directement dans les output pour réduire le nombre de ligne
        System.out.println(a>0 && b<10);
        System.out.println(a>0 || b<10);

        // Différente méthode pour changer la valeur d'une variable
        a= a+1;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a+=1;
        System.out.println("a = " + a);

        // Une condition ternaire : [Condition] ? [Si true] : [Si false]
        String c = a>0 ? "a est plus grand que 0" : "a est inférieur a 0";
        System.out.println(c);
    }
}
