public class Szyfry {
    public static String szyfrujCezarem(String slowo,int klucz){
        String zaszyfrowane = "";
        boolean czyDuze = false;
        if(!slowo.toLowerCase().equals(slowo)){
            czyDuze = true;
            slowo = slowo.toLowerCase();
        }
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        klucz = klucz % 26;

        String alfabetPrzesuniety ;
        if(klucz>=0) {

            alfabetPrzesuniety = alfabet.substring(klucz) + alfabet.substring(0, klucz);
        }else {
            klucz = klucz*(-1);
            alfabetPrzesuniety = alfabet.substring(alfabet.length()-klucz)+alfabet.substring(0,alfabet.length()-klucz);
        }
        int kod;
        for (int i = 0; i < slowo.length(); i++) {
            if(slowo.charAt(i) == ' '){
                zaszyfrowane = zaszyfrowane +" ";
                continue;
            }
            kod = alfabet.indexOf(slowo.charAt(i));
            zaszyfrowane = zaszyfrowane +alfabetPrzesuniety.charAt(kod);
        }
        if(czyDuze){
            zaszyfrowane = zaszyfrowane.toUpperCase();
        }
        return zaszyfrowane;
    }



}
