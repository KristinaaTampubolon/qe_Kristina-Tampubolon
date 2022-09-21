package Challenge1;

public class Segitiga {
    private int alas;
    private int tinggi;

    //Luas
    public int getLuas(int alas, int tinggi){
        return (alas*tinggi)/2;
    }

    //Keliling
    public int getKeliling(int alas, int tinggi){
        return alas*tinggi;
    }

    //Setter
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //Getter
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }
}
