package Challenge2;

public class Kubus {
    private int sisi;

    //Volume
    public int getVolume(int sisi){
        return sisi*sisi*sisi;
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
