package SoalBasicProgramming.Eksplorasi;

public class Eksplorasi {
    public static String encrypt(String s) {
        //TODO: complete this code
        String encrypted = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                char shifted = (char) (c + 10);
                if(shifted > 'Z') {
                    shifted = (char) (shifted - 26);
                }
                encrypted += shifted;
            } else {
                encrypted += c;
            }
        }
        return encrypted;
    }
    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
