package objets.cio;

public class MedaillePays {
    public int medailles;
    public String pays;

    public MedaillePays(int medailles, String pays) {
        this.medailles = medailles;
        this.pays = pays;
    }
    
    public int compareTo(MedaillePays other) {
        return this.medailles - other.medailles;
    }
    
    @Override
    public String toString() {
        return pays + " :\t\t" + medailles + " médaille(s)";
    }
}
