package Challenge2;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    //Volume
    public int getVolume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }

    //Setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //Getter
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public int getTinggi() {
        return tinggi;
    }
}
