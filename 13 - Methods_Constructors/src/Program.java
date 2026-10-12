public class Program {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.saisie();
        Person p2 = new Person();
        p2.saisie();
        if (p1.compareTo(p2) < 0) {
            System.out.println("People in alphabetical order: ");
            p1.affiche();
            p2.affiche();
        } else {
            System.out.println("People in alphabetical order: ");
            p2.affiche();
            p1.affiche();
        }
    }
}
