package Challenge1;

public class Persegi {
    private int sisi;

    //Luas
    public int getLuas(int sisi){
        return sisi*sisi;
    }

    //Keliling
    public int getKeliling(int sisi){
        return 4*sisi;
    }

    //Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    //Getter
    public int getSisi() {
        return sisi;
    }
}
