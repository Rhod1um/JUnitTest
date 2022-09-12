import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() { //trin i test
        //Arrange - sæt calculator op
        Calculator calculator = new Calculator();

        //Act - køre noget kode på det
        int actual = calculator.sum(10, 5);

        //Assert - test om det giver det forventede
        int expected = 15; //man skal kende svaret for at kunne teste det
        assertEquals(expected, actual);

        //lav unit test kun ved ting som man reelt er i tvivl om, ikke forstår eller ikke kan finde ud af
    }

    //man kan lave flere af samme test, bare kopier
    @Test
    void testIgen() { //trin i test
        //Arrange - sæt calculator op
        Calculator calculator = new Calculator();

        //Act - køre noget kode på det
        int actual = calculator.sum(-10, 5);

        //Assert - test om det giver det forventede
        int expected = -5; //man skal kende svaret for at kunne teste det
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumbers() { //trin i test
        //Arrange - sæt calculator op
        Calculator calculator = new Calculator();

        //Act - køre noget kode på det
        //Assert
        //vi har lavet en throw i Calculator så her forventer vi at få en IllegalException klasse
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(101,101); //giver "korrekt"/grøn i test fordi man tester om det er "forkert" med throwen
            //så det er korrekt at den smider en IllegalArgumentException
            //så man kan både teste om noget fungerer eller om det ikke fungerer
            //derfor vigtigt man kun tester en enkelt ting af gangen ellers ved man ikke om rigtigt/fprkert/grøn/rød
            //er for den ene test eller den anden
        });
    }
}