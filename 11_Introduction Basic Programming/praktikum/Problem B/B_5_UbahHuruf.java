public class B_5_UbahHuruf {
    public static final String aplha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String ubahHuruf(String s) {
        String cipherText = " ";
        int shiftKey = 10;
        for (int ii = 0; ii < s.length(); ii++) {
            int charPosition = aplha.indexOf(s.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = aplha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {

        System.out.println(ubahHuruf("SEPULSA OKE")); //COZEVCK YOU
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); //KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA")); //SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG")); //QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER")); // ZBYQBKWWOB
    }
}