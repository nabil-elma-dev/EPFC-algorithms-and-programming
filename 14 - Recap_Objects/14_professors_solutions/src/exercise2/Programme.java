package objets.cio;

import eu.epfc.prm3.Array;

public class Programme {

    public static void nouvelleMedaille(Array<MedaillePays> medailles, String pays) {
        int idx = 0;
        while (idx < medailles.size() && medailles.get(idx).pays.compareTo(pays) != 0) {
            ++idx;
        }
        if (idx == medailles.size()) {
            medailles.add(new MedaillePays(1, pays));
        } else {
            ++medailles.get(idx).medailles;
            positionne(medailles, idx);
        }
    }

    public static void positionne(Array<MedaillePays> medailles, int idx) {
        if (idx > 0) {
            MedaillePays m = medailles.get(idx);

            while (idx > 0 && medailles.get(idx - 1).compareTo(m) < 0) {
                medailles.set(idx, medailles.get(idx - 1));
                --idx;
            }
            medailles.set(idx, m);
        }

    }

    public static void affiche(Array<MedaillePays> medailles) {
        System.out.println("Médailles des pays :");
        for (MedaillePays m : medailles) {
            System.out.println(m);
        }
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        Array<MedaillePays> medailles = new Array<>();
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
        nouvelleMedaille(medailles, "France");
        affiche(medailles);
        nouvelleMedaille(medailles, "France");
        affiche(medailles);
        nouvelleMedaille(medailles, "Allemagne");
        affiche(medailles);
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
    }
}
