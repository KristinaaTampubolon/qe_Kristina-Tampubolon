package Challenge2;

public class Tabung {
    private int jarijari;
    private int tinggi;

    //Volume
    public int getVolume(int jarijari, int tinggi){
        return (int) Math.ceil(Math.PI * jarijari * jarijari * tinggi);
    }

    //Setter
    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //Getter
    public int getJarijari() {
        return jarijari;
    }
    public int getTinggi() {
        return tinggi;
    }
}
