package ohtu.matkakortti;

public class Kassapaate {
    private int myytyjaLounaita;
    public static final int HINTA = 5;

    public Kassapaate() {
        this.myytyjaLounaita = 0;
    }
    
    public void lataa(Maksukortti kortti, int summa){
        if(summa>0){
        kortti.lataa(summa);
        }
    }
    
    public void ostaLounas(Maksukortti kortti) {
        if(kortti.getSaldo() > 4){
        kortti.osta(HINTA);
        this.myytyjaLounaita++;
        }
    }

    public int getMyytyjaLounaita() {
        return myytyjaLounaita;
    }
}
