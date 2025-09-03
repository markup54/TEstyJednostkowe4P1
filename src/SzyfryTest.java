import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {
    @Test
    void testSzyfrujCezaremJezeliKlucz0() {
        Assertions.assertEquals("abc",Szyfry.szyfrujCezarem("abc",0));
    }
    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetu() {
        Assertions.assertEquals("def",Szyfry.szyfrujCezarem("abc",3));
    }
    @Test
    void testSzyfrujCezaremJezeliKluczWiekszyOdDlugosciAlfabetu() {
        Assertions.assertEquals("efg",Szyfry.szyfrujCezarem("abc",30));
    }
    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetuZAwijanie() {
        Assertions.assertEquals("abc",Szyfry.szyfrujCezarem("xyz",3));
    }

    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetuUjemny() {
        Assertions.assertEquals("abc",Szyfry.szyfrujCezarem("def",-3));
    }

    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetuUjemnyZawijanie() {
        Assertions.assertEquals("xyz",Szyfry.szyfrujCezarem("abc",-3));
    }

    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetuDuzeLitery() {
        Assertions.assertEquals("DEF",Szyfry.szyfrujCezarem("ABC",3));
    }
    @Test
    void testSzyfrujCezaremJezeliKluczMniejszyOdDlugosciAlfabetuSpacja() {
        Assertions.assertEquals("de f",Szyfry.szyfrujCezarem("ab c",3));
    }
}