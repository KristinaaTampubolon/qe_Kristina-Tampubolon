package Challenge1;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    //Luas
    public int getLuas(int panjang, int lebar){
        return panjang*lebar;
    }

    //Keliling
    public int getKeliling(int panjang, int lebar){
        return (2*panjang) + (2*lebar);
    }

    //Setter
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    //Getter
    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }
}