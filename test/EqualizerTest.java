import demo.Equalizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualizerTest {

    Equalizer e;

    @BeforeEach //reducerer redundant kode. initializere fra start
    public void setup(){
        e = new Equalizer();
    }
    //@BeforeAll er til filer?

    @Test
    void isEven() {
        //arrange
        Equalizer e = new Equalizer(); //hvorfor instans af test, i calculator er det af Calculator

        //act
        boolean actual = e.isEven(6);

        //assert
        assertTrue(actual);
    }

    @Test
    void isOdd() {
        //arrange
        Equalizer e = new Equalizer(); //hvorfor instans af test, i calculator er det af Calculator

        //act
        boolean actual = e.isEven(7);

        //assert
        assertFalse(actual);
    }
}