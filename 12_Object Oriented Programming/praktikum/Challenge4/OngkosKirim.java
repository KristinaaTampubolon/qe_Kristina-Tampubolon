package Challenge4;

public class OngkosKirim {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int berat;

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
    public void setBerat(int berat) {
        this.berat = berat;
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
    public int getBerat() {
        return berat;
    }

    //Method
    public void standarDimensi(){
        this.berat = panjang*lebar*tinggi;
    }
}
