import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testSumaJezeliLiczbyDodatnieCalkowite() {
        Assertions.assertEquals(5,Kalkulator.suma(2,3));
    }

    @Test
    void testSumaJezeliLiczbyRzeczywiste(){
        Assertions.assertEquals(2.5,Kalkulator.suma(1.5,1));
    }


    @Test
    void testPodzielJezeliWynikCalkowity(){
        Assertions.assertEquals(3,Kalkulator.podziel(6,2));
    }

    @Test
    void testPodzielJezeliWynikRzeczywistyArgumentyCalkowite(){
        Assertions.assertEquals(3.5,Kalkulator.podziel(7,2));
    }

    @Test
    void testPodzielJezeliWynikRzeczywistyArgumentyRzeczywiste(){
        Assertions.assertEquals(3.6,Kalkulator.podziel(7.2,2));
    }

}