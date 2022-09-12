import demo.Navneliste;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NavnelisteTest {
    Navneliste navneliste;

    @BeforeEach
    public void setUp(){
        navneliste = new Navneliste();
    }

    @Test
    void testAddName() {
        //act
        navneliste.addNames("Veronica");
        int actual = navneliste.getSize();

        //assert
        int expected = 1;
        assertEquals(expected, actual);
        //test så specifik som muligt. Kun at en er added her. Ikke noget generelt,
        //ikke noget med sizeBefore - sizeAfter for så bruger man logik i sin test
        //gør det så primitivt som overhoved muligt
    }

    @Test
    void testAddTwoName() {
        //act
        int actual = navneliste.getSize();
        navneliste.addNames("Veronica");
        navneliste.addNames("Michael");

        //assert
        int expected = 2;
        assertEquals(expected, navneliste.getSize());
    }
}