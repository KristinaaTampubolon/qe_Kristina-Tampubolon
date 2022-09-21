package Challenge3;

public class kalkulator {
    private int bilangan1;
    private int bilangan2;
    private int hasil;

    //Setter
    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }
    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }
    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    //Getter
    public int getBilangan1() {
        return bilangan1;
    }
    public int getBilangan2() {
        return bilangan2;
    }
    public int getHasil() {
        return hasil;
    }

    //Method
    public void penjumlahan(){
        hasil = bilangan1 + bilangan2;
    }
    public void pengurangan(){
        hasil = bilangan1 - bilangan2;
    }
    public void perkalian(){
        hasil = bilangan1 * bilangan2;
    }
    public void pembagian(){
        hasil = bilangan1/bilangan2;
    }

}
